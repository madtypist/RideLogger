package com.jellyink.ridelogger;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by jessielink on 1/22/15.
 */
public class RideAdapter extends ArrayAdapter<Ride> {
    Context mContext;
    int mLayoutResource;
    Ride[] mRides = null;

    public RideAdapter(Context context, int resource, Ride[] rides) {
        super(context, resource, rides);
        mContext = context;
        mLayoutResource = resource;
        mRides = rides;
    }

    @Override
    public Ride getItem(int position) {
        return super.getItem(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        PlaceHolder holder = null;

        //if we don't have a row view to reuse
        if (row == null){
            //inflate the layout for a single row
            LayoutInflater inflater = LayoutInflater.from(mContext);
            row = inflater.inflate(mLayoutResource, parent, false);

            holder = new PlaceHolder();

            //get a reference to the different view elements we want to update
            holder.titleView = (TextView) row.findViewById(R.id.titleTextView);
            holder.distanceView = (TextView) row.findViewById(R.id.distanceTextView);
            holder.rideDateView = (TextView) row.findViewById(R.id.rideDateTextView);

            row.setTag(holder);
        } else {
            holder = (PlaceHolder) row.getTag();
        }

        //get the date from the Ride Array
        Ride ride = mRides[position];

        //setting the view to display the data we need
        holder.titleView.setText(ride.getTitle());
        holder.rideDateView.setText(ride.getStartDate().toString("yyyy-MM-dd"));
        holder.distanceView.setText(ride.getDistance().toString() + " miles");

        return row;
    }

    private static class PlaceHolder {
        TextView titleView;
        TextView distanceView;
        TextView rideDateView;
    }
}
