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

public class ArtMuseumsFragment extends Fragment {

    ListView listView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_art_museums,container,false);

        getActivity().setTitle("Art Museums");
        listView = v.findViewById(R.id.art_museums_list);
        List<Attraction> lists = new ArrayList<>();
        lists.add(new Attraction("Museum Of Modern Egyptian Art","Gezira Exhibition"));
        lists.add(new Attraction("Museum Of Islamic Art Cairo","Bab Al Khalk square"));
        lists.add(new Attraction("Islamic Ceramics Museum", "Al Sheikh Al Marsafi"));
        AttractionAdapter adapter = new AttractionAdapter(getContext(),lists);
        listView.setAdapter(adapter);
        return v;
    }
}
