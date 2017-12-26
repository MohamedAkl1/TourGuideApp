package com.example.akl.tourguideapp;

import android.app.Fragment;
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

public class MallsFragment extends Fragment {
    ListView listView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_malls,container,false);

        getActivity().setTitle(getString(R.string.malls));
        listView = v.findViewById(R.id.malls_list);
        List<Attraction> lists = new ArrayList<>();
        lists.add(new Attraction(getString(R.string.cairo_festival_mall),getString(R.string.fifth_settlement)));
        lists.add(new Attraction(getString(R.string.city_stars),getString(R.string.downtown)));
        lists.add(new Attraction(getString(R.string.galleria_mall), getString(R.string.fifth_settlement)));
        AttractionAdapter adapter = new AttractionAdapter(getContext(),lists);
        listView.setAdapter(adapter);
        return v;
    }
}
