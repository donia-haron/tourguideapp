package com.example.android.viewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


import java.util.ArrayList;

public class hotelsFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayList<loc> hotel = new ArrayList<>();
        hotel.add(new loc(getString(R.string.Heliopolis), getString(R.string.plazaa), getString(R.string.numh22), R.drawable.hw, getString(R.string.dis3h)));
        hotel.add(new loc(getString(R.string.l4), getString(R.string.house), getString(R.string.numh11), R.drawable.hq, getString(R.string.dis5h)));
        hotel.add(new loc(getString(R.string.Zamalek), getString(R.string.plaza2), getString(R.string.numh22), R.drawable.hv, getString(R.string.dis6h)));
        hotel.add(new loc(getString(R.string.l1), getString(R.string.helnan), getString(R.string.numh33), R.drawable.hq, getString(R.string.dis3h)));
        hotel.add(new loc(getString(R.string.l), getString(R.string.helton), getString(R.string.numh22), R.drawable.hv, getString(R.string.dis5h)));
        hotel.add(new loc(getString(R.string.l3), getString(R.string.motel), getString(R.string.numh22), R.drawable.hw, getString(R.string.dis3h)));
        hotel.add(new loc(getString(R.string.Heliopolis), getString(R.string.plazaa), getString(R.string.numh11), R.drawable.hw, getString(R.string.dis6h)));
        hotel.add(new loc(getString(R.string.l4), getString(R.string.house), getString(R.string.numc4), R.drawable.hq, getString(R.string.dis5h)));
        hotel.add(new loc(getString(R.string.Zamalek), getString(R.string.plaza2), getString(R.string.numh22), R.drawable.hv, getString(R.string.dis3h)));
        hotel.add(new loc(getString(R.string.l1), getString(R.string.helnan), getString(R.string.numh22), R.drawable.hq, getString(R.string.dis5h)));
        View root = inflater.inflate(R.layout.fragment_hotels, container, false);
        locAdapter his = new locAdapter(root.getContext(), hotel);
        ListView list = (ListView) root.findViewById(R.id.items);
        list.setAdapter(his);

        return root;

    }
}
