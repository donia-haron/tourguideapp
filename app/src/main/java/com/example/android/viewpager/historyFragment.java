package com.example.android.viewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


import java.util.ArrayList;

public class historyFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ArrayList<loc> historic = new ArrayList<>();
        historic.add(new loc(getString(R.string.Heliopolis), getString(R.string.Baron), getString(R.string.numc4), R.drawable.download, getString(R.string.dis7c)));
        historic.add(new loc(getString(R.string.down), getString(R.string.Champollian_House), getString(R.string.numh1), R.drawable.ig, getString(R.string.dis8c)));
        historic.add(new loc(getString(R.string.Zamalek), getString(R.string.are), getString(R.string.numh2), R.drawable.i, getString(R.string.dis7c)));
        historic.add(new loc(getString(R.string.l1), getString(R.string.kal3a), getString(R.string.numc4), R.drawable.down, getString(R.string.dis9c)));
        historic.add(new loc(getString(R.string.Heliopolis), getString(R.string.Baron), getString(R.string.numh3), R.drawable.download, getString(R.string.dis8c)));
        historic.add(new loc(getString(R.string.down), getString(R.string.Champollian_House), getString(R.string.numc4), R.drawable.ig, getString(R.string.dis7c)));
        historic.add(new loc(getString(R.string.Zamalek), getString(R.string.are), getString(R.string.numh3), R.drawable.i, getString(R.string.dis9c)));
        historic.add(new loc(getString(R.string.l1), getString(R.string.kal3a), getString(R.string.numc4), R.drawable.down, getString(R.string.dis8c)));
        historic.add(new loc(getString(R.string.l), getString(R.string.pyramids), getString(R.string.numh3), R.drawable.downloa, getString(R.string.dis7c)));
        historic.add(new loc(getString(R.string.l3), getString(R.string.plazaa), getString(R.string.numc4), R.drawable.download, getString(R.string.dis9c)));
        View root = inflater.inflate(R.layout.fragment_history, container, false);
        locAdapter his = new locAdapter(root.getContext(), historic);
        ListView list = (ListView) root.findViewById(R.id.items);
        list.setAdapter(his);
        return root;
    }
}
