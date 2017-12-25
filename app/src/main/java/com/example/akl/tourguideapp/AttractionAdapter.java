package com.example.akl.tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Mohamed Akl on 12/26/2017.
 */

public class AttractionAdapter extends ArrayAdapter {

    public AttractionAdapter(@NonNull Context context, @NonNull List<Attraction> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if(v == null){
            v = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Attraction currentAttraction = (Attraction) getItem(position);
        TextView aName = v.findViewById(R.id.name_tv);
        aName.setText(currentAttraction.getName());
        TextView aLocation = v.findViewById(R.id.location_tv);
        aLocation.setText(currentAttraction.getLocation());
        ImageView imageView = v.findViewById(R.id.image);
        if(currentAttraction.hasImage()){
            imageView.setVisibility(View.VISIBLE);
            imageView.setImageResource(currentAttraction.getImage());
        }else{
            imageView.setVisibility(View.INVISIBLE);
        }


        return v;
    }
}
