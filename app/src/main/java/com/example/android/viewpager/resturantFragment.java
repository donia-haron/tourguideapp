package com.example.android.viewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


import java.util.ArrayList;


public class resturantFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ArrayList<loc> rest = new ArrayList<>();
        rest.add(new loc(getString(R.string.Heliopolis),getString(R.string.chr),getString(R.string.numh22),R.drawable.t,getString(R.string.dis1r)));
        rest.add(new loc(getString(R.string.locr1),getString(R.string.br),getString(R.string.numh11),R.drawable.de,getString(R.string.dis2r)));
        rest.add(new loc(getString(R.string.Zamalek),getString(R.string.hr),getString(R.string.numh33),R.drawable.de,getString(R.string.dis3r)));
        rest.add(new loc(getString(R.string.l1),getString(R.string.sr),getString(R.string.numh22),R.drawable.t,getString(R.string.dis1r)));
        rest.add(new loc(getString(R.string.l),getString(R.string.rr),getString(R.string.numh33),R.drawable.de,getString(R.string.dis3r)));
        rest.add(new loc(getString(R.string.l3),getString(R.string.chr),getString(R.string.numh22),R.drawable.t,getString(R.string.dis2r)));
        rest.add(new loc(getString(R.string.Heliopolis),getString(R.string.chr),getString(R.string.numh33),R.drawable.t,getString(R.string.dis1r)));
        rest.add(new loc(getString(R.string.locr1),getString(R.string.br),getString(R.string.numc4),R.drawable.de,getString(R.string.dis2r)));
        rest.add(new loc(getString(R.string.Zamalek),getString(R.string.hr),getString(R.string.numc44),R.drawable.de,getString(R.string.dis1r)));
        rest.add(new loc(getString(R.string.l1),getString(R.string.sr),getString(R.string.numh22),R.drawable.t,getString(R.string.dis3r)));
        rest.add(new loc(getString(R.string.l),getString(R.string.rr),getString(R.string.numh11),R.drawable.de,getString(R.string.dis1r)));
        rest.add(new loc(getString(R.string.l3),getString(R.string.chr),getString(R.string.numh33),R.drawable.t,getString(R.string.dis2r)));
        rest.add(new loc(getString(R.string.Heliopolis),getString(R.string.chr),getString(R.string.numh2),R.drawable.t,getString(R.string.dis1r)));
        rest.add(new loc(getString(R.string.locr1),getString(R.string.br),getString(R.string.numh3),R.drawable.de,getString(R.string.dis3r)));
        rest.add(new loc(getString(R.string.Zamalek),getString(R.string.hr),getString(R.string.numh22),R.drawable.de,getString(R.string.dis1r)));
        rest.add(new loc(getString(R.string.l1),getString(R.string.sr),getString(R.string.numh2),R.drawable.t,getString(R.string.dis2r)));
        View root= inflater.inflate(R.layout.fragment_resturant, container, false);
        locAdapter his= new locAdapter(root.getContext(),rest);
        ListView list=(ListView) root.findViewById(R.id.items);
        list.setAdapter(his);

        return root;
    }
}
