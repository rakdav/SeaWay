package com.example.myapplication;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.FragmentActivity;
import android.os.Bundle;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
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
        mMap = googleMap;
        LatLng hedland = new LatLng(-20.18, 118.36);
        mMap.addMarker(new MarkerOptions().position(hedland).title("Порт-Хедленд")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.anchor))
                .snippet("Крупнейший порт Австралии."));
        LatLng marseille = new LatLng(43.17, 5.22);
        mMap.addMarker(new MarkerOptions().position(marseille).title("Марсель")
                .snippet("Крупнейший порт Франции."));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(marseille));
        LatLng kaliningrad = new LatLng(54.42, 20.27);
        mMap.addMarker(new MarkerOptions().position(kaliningrad).title("Калининград")
                .snippet("Единственный незамерзающий российский порт Балтийского моря."));
        LatLng alexandria = new LatLng(31.12, 29.55);
        mMap.addMarker(new MarkerOptions().position(alexandria).title("Александрия")
                .snippet("Крупнейши порт Египта"));
        LatLng vladivostok = new LatLng(43.087094, 131.869826);
        mMap.addMarker(new MarkerOptions().position(vladivostok).title("Владивосток")
                .snippet("Крупнейший тихоокеанских порт России"));
        LatLng hong_cong = new LatLng(22.297420, 114.164505);
        mMap.addMarker(new MarkerOptions().position(hong_cong).title("Гонконг")
                .snippet("Крупнейший порт Китая"));
        LatLng casablanka = new LatLng(33.611828, -7.601249);
        mMap.addMarker(new MarkerOptions().position(casablanka).title("Касабланка")
                .snippet("Крупнейший тихоокеанских порт России"));
        LatLng mumbai = new LatLng(19.050345, 72.868855);
        mMap.addMarker(new MarkerOptions().position(mumbai).title("Мумбаи")
                .snippet("Крупнейший порт Индии"));
        LatLng cape_town = new LatLng(-33.887481, 18.488945);
        mMap.addMarker(new MarkerOptions().position(cape_town).title("Кейптаун")
                .snippet("Крупнейший порт ЮАР"));
        LatLng mombasa = new LatLng(-4.070105, 39.656553);
        mMap.addMarker(new MarkerOptions().position(mombasa).title("Момбаса")
                .snippet("Крупнейший порт Кении"));
        LatLng montevideo = new LatLng(-34.898598, -56.209428);
        mMap.addMarker(new MarkerOptions().position(montevideo).title("Монтевидео")
                .snippet("Крупнейший порт Уругвая"));
        LatLng havana = new LatLng(23.137141, -82.347139);
        mMap.addMarker(new MarkerOptions().position(havana).title("Гавана")
                .snippet("Крупнейший порт Кубы"));
        LatLng panama = new LatLng(8.951333, -79.573287);
        mMap.addMarker(new MarkerOptions().position(panama).title("Панама")
                .snippet("Крупнейший порт Панамы"));
        LatLng san_francisco = new LatLng(37.799753, -122.395337);
        mMap.addMarker(new MarkerOptions().position(san_francisco).title("Сан-Франциско")
                .snippet("ВМБ и крупный порт США"));
        LatLng boston = new LatLng(42.359511, -71.049133);
        mMap.addMarker(new MarkerOptions().position(boston).title("Бостон")
                .snippet("Один из основных портов США"));
        LatLng lisbon = new LatLng(38.701749, -9.165369);
        mMap.addMarker(new MarkerOptions().position(lisbon).title("Лиссабон")
                .snippet("Крупнейший порт Португалии"));
    }
}
