package com.socialimpulse.tripsapp.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.socialimpulse.tripsapp.R;
import com.socialimpulse.tripsapp.logic.Trip;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

public class HomeAdapter extends BaseAdapter {

    private ArrayList<Trip> trips = new ArrayList<>();
    private LayoutInflater inflater;
    private Context context;
    private Trip trip;


    public HomeAdapter(Context context) {
        this.context = context;
        this.inflater = LayoutInflater.from(this.context);
        try {
            trip = new Trip("Las Vegas", "Nevada, US", new SimpleDateFormat("MM/dd/yy").parse("07/07/15"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        trips.add(trip);

    }

    @Override
    public int getCount() {
        return trips.size();
    }

    @Override
    public Trip getItem(int position) {
        return trips.get(position);
    }

    @Override
    public boolean hasStableIds(){
        return true;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final MyViewHolder mViewHolder;
        if (convertView == null) {

            convertView = inflater.inflate(R.layout.trip_item, null);

            mViewHolder = new MyViewHolder();

            mViewHolder.ivImage = (ImageView) convertView.findViewById(R.id.image);
            mViewHolder.tvCity = (TextView) convertView.findViewById(R.id.city);
            mViewHolder.tvDate = (TextView) convertView.findViewById(R.id.date);
            mViewHolder.tvState = (TextView) convertView.findViewById(R.id.state);

            convertView.setTag(mViewHolder);

        } else {
            mViewHolder = (MyViewHolder) convertView.getTag();
        }

        mViewHolder.tvCity.setText(trip.getCity());
        mViewHolder.tvDate.setText((new SimpleDateFormat("MMM", Locale.ENGLISH).format(trip.getDepartureDate().getTime())).toUpperCase() + " " + new SimpleDateFormat("dd", Locale.ENGLISH).format(trip.getDepartureDate().getTime()));
        mViewHolder.tvState.setText(trip.getState());

        return convertView;
    }

    private class MyViewHolder {
        ImageView ivImage;
        TextView tvCity;
        TextView tvDate;
        TextView tvState;
    }

}