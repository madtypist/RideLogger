package com.jellyink.ridelogger;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import org.joda.time.DateTime;
import org.joda.time.Interval;


public class ListRidesActivity extends ActionBarActivity {
    //REMOVE THIS LATER
    Interval interval1 = new Interval(new DateTime(2015,1,11,12,34,33), new DateTime(2015,1,11,14,03,11));
    Interval interval2 = new Interval(new DateTime(2015,1,14,7,34,33), new DateTime(2015,1,14,9,03,11));
    Interval interval3 = new Interval(new DateTime(2015,1,29,12,34,33), new DateTime(2015,1,29,14,03,11));
    Interval interval4 = new Interval(new DateTime(2015,2,1,12,34,33), new DateTime(2015,2,1,14,03,11));
    Interval interval5 = new Interval(new DateTime(2015,2,3,10,34,33), new DateTime(2015,2,3,13,14,33));

    Ride[] mRides = new Ride[]{
            new Ride("short ride", "Ride went well", interval1 ,1,21.5),
            new Ride("ok ride", "Ride went well", interval2, 1,21.5),
            new Ride("amazing 20 miler", "Ride went well", interval3, 1,21.5),
            new Ride("short ride", "Ride went well", interval4, 1,21.5),
            new Ride("short ride", "Ride went well", interval5, 1,21.5),
    };
    // END REMOVE THIS LATER

    private ListView mListView;
    private RideAdapter mRideAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_rides);

        mListView = (ListView) findViewById(R.id.rideList);
        mRideAdapter = new RideAdapter(getApplicationContext(),R.layout.ride_row, mRides);
        if (mListView != null){
            mListView.setAdapter(mRideAdapter);
        }
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
