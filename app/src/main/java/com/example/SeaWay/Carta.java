package com.example.SeaWay;
import androidx.fragment.app.FragmentActivity;
import android.os.Bundle;

import com.example.myapplication.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.gson.Gson;

public class Carta extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap mMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carta);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        String points=Utils.getJsonFromAssets(getApplicationContext(),"Coordinates.json");
        Gson gson=new Gson();
        MapCoordinates mapCoordinates= gson.fromJson(points,MapCoordinates.class);
        mMap = googleMap;
        for(int i=0;i<mapCoordinates.getCoordinates().size();i++)
        {
            Double lat=mapCoordinates.getCoordinates().get(i).getCoordinate().get(0);
            Double lng=mapCoordinates.getCoordinates().get(i).getCoordinate().get(1);
            LatLng hedland=new LatLng(lat,lng);
            mMap.addMarker(new MarkerOptions().position(hedland).title(mapCoordinates.getCoordinates().get(i).getTitle()));
        }
        for(int i=0;i<mapCoordinates.getPorts().size();i++)
        {
            float lat=mapCoordinates.getPorts().get(i).getX();
            float lng=mapCoordinates.getPorts().get(i).getY();
            LatLng hedland=new LatLng(lat,lng);
            mMap.addMarker(new MarkerOptions().position(hedland).title(mapCoordinates.getPorts().get(i).getTitle())
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.anchor))
                .snippet(mapCoordinates.getPorts().get(i).getSnippet()));
        }
        PolylineOptions line = new PolylineOptions();
        LatLngBounds.Builder latLngBuilder = new LatLngBounds.Builder();
        for (int i = 0; i < mapCoordinates.getRoutes().size(); i++) {
            for(int j=0;j<mapCoordinates.getRoutes().get(i).getCoordinates().size();j++) {
                line.add(new com.google.android.gms.maps.model.LatLng(mapCoordinates.getRoutes().get(i).getCoordinates().get(j)[0],
                        mapCoordinates.getRoutes().get(i).getCoordinates().get(j)[1]));
                latLngBuilder.include(new com.google.android.gms.maps.model.LatLng(
                        mapCoordinates.getRoutes().get(i).getCoordinates().get(j)[0],
                        mapCoordinates.getRoutes().get(i).getCoordinates().get(j)[1]));
            }
        }
        line.width(16f).color(R.color.colorPrimary);
        googleMap.addPolyline(line);

    }
}
