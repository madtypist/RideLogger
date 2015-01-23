package com.jellyink.ridelogger;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.Date;


public class ListRidesActivity extends ActionBarActivity {
    Ride[] mRides = new Ride[]{
            new Ride("short ride", "Ride went well", new Date(2015,1,10,12,10), new Date(2015,1,10,13,00),1),
            new Ride("ok ride", "Ride went well", new Date(2015,1,11,12,10), new Date(2015,1,11,13,00),1),
            new Ride("amazing 20 miler", "Ride went well", new Date(2015,1,12,12,10), new Date(2015,1,12,13,00),1),
            new Ride("short ride", "Ride went well", new Date(2015,1,14,12,10), new Date(2015,1,14,14,00),1),
            new Ride("short ride", "Ride went well", new Date(2015,1,21,12,10), new Date(2015,1,21,13,00),1),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_rides);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_list_rides, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
