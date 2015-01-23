package com.jellyink.ridelogger;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

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
        return super.getView(position, convertView, parent);
    }
}
