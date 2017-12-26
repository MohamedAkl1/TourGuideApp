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

        getActivity().setTitle(getString(R.string.art_museum));
        listView = v.findViewById(R.id.art_museums_list);
        List<Attraction> lists = new ArrayList<>();
        lists.add(new Attraction(getString(R.string.modern_art),getString(R.string.gezira_exhibition)));
        lists.add(new Attraction(getString(R.string.islamic_art),getString(R.string.bab_al_khalk)));
        lists.add(new Attraction(getString(R.string.islamic_ceramics), getString(R.string.al_sheikh)));
        AttractionAdapter adapter = new AttractionAdapter(getContext(),lists);
        listView.setAdapter(adapter);
        return v;
    }
}