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

public class HistoryMuseumsFragment extends Fragment {

    ListView listView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_history_museums,container,false);

        getActivity().setTitle("History Museums");
        listView = v.findViewById(R.id.history_museums_list);
        List<Attraction> lists = new ArrayList<>();
        lists.add(new Attraction("Egyptian Museum","Al Tahrir"));
        lists.add(new Attraction("Manial Palace","Manial"));
        lists.add(new Attraction("Gayer-Anderson Museum", "Old Cairo"));
        AttractionAdapter adapter = new AttractionAdapter(getContext(),lists);
        listView.setAdapter(adapter);
        return v;
    }
}
