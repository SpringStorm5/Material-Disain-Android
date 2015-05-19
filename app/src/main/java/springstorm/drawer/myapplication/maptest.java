//package springstorm.drawer.myapplication;
//
///**
// * Created by springstorm on 5/19/15.
// */
//import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
//import org.osmdroid.util.GeoPoint;
//import org.osmdroid.views.MapController;
//import org.osmdroid.views.MapView;
//import android.app.Activity;
//import android.os.Bundle;
//
//public class OsmDroidTest extends Activity {
//    /** Called when the activity is first created. */
//    private MapController mapController;
//    private MapView mapView;
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.maptest_main);
//        mapView = (MapView) findViewById(R.id.mapview);
//        mapView.setTileSource(TileSourceFactory.MAPNIK);
//        mapView.setBuiltInZoomControls(true);
//        //mapController = mapView.getController();
//        mapController.setZoom(15);
//        GeoPoint point2 = new GeoPoint(51496994, -134733);
//        mapController.setCenter(point2);
//    }
//    protected boolean isRouteDisplayed() {
//        // TODO Auto-generated method stub
//        return false;
//    }
//}