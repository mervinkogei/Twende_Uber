package com.example.twendeuber;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng KICC = new LatLng(-1.272758, 36.827899);
        mMap.addMarker(new MarkerOptions().position(KICC).title("Marker in KICC, Nairobi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(KICC));

        LatLng JKIA = new LatLng(-1.333731, 36.927109);
        mMap.addMarker(new MarkerOptions().position(JKIA).title("Marker in JKIA, Nairobi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(JKIA));

        LatLng Kiambu = new LatLng(-1.146188, 36.966499);
        mMap.addMarker(new MarkerOptions().position(Kiambu).title("Marker in Kiambu, Nairobi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Kiambu));

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Kiambu,15.0f));
    }
}
