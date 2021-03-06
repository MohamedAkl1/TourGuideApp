package com.example.akl.tourguideapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mohamed Akl on 12/25/2017.
 */

public class RestaurantsFragment extends android.app.Fragment {

    ListView listView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_restaurants,container,false);

        getActivity().setTitle(getString(R.string.restaurants));
        listView = v.findViewById(R.id.restaurant_list);
        List<Attraction> lists = new ArrayList<>();
        lists.add(new Attraction(getString(R.string.buffalo_burger),getString(R.string.new_cairo),R.drawable.buffalo_inner_banner));
        lists.add(new Attraction(getString(R.string.kfc),getString(R.string.downtown),R.drawable.kfc));
        lists.add(new Attraction(getString(R.string.butcher_burger), getString(R.string.fifth_settlement),R.drawable.butcher));
        AttractionAdapter adapter = new AttractionAdapter(getContext(),lists);
        listView.setAdapter(adapter);
        return v;
    }
}