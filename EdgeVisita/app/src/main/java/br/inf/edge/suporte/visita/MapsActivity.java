package br.inf.edge.suporte.visita;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import org.greenrobot.eventbus.EventBus;

import java.util.List;

import br.inf.edge.suporte.visita.R;
import br.inf.edge.suporte.visita.dao.DadosDAO;
import br.inf.edge.suporte.visita.model.Cliente;

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

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        int codigoRegiao = EventBus.getDefault().getStickyEvent(Integer.class);

        Log.d("MAPA", Integer.toString(codigoRegiao));

        // Add a marker in Sydney and move the camera

        LatLng primeiro = null;

        DadosDAO dao = new DadosDAO();
        List<Cliente> clientes = dao.getClientes(codigoRegiao);

        for (Cliente cli : clientes) {
            LatLng mark = new LatLng(cli.getLatitude(), cli.getLongitude());
            mMap.addMarker(new MarkerOptions().position(mark).title(cli.getNome()));

            if ( primeiro == null )
                primeiro = mark;
        }

        if ( primeiro != null )
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(primeiro, 13f));
    }
}
