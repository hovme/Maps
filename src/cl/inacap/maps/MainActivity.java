package cl.inacap.maps;

import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends MapActivity {
	
	private MapView mapa = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//Obtenemos una referencia al control MapView
        mapa = (MapView)findViewById(R.id.mapa);
 
        //Mostramos los controles de zoom sobre el mapa
        mapa.setBuiltInZoomControls(true);
		
	}


	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}
}
