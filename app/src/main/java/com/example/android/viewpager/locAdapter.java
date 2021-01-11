package com.example.android.viewpager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class locAdapter extends ArrayAdapter<loc> {


    public locAdapter(Context context, ArrayList<loc> loc1) {
        super(context, 0, loc1);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_items, parent, false);
        }
        loc loc2 = getItem(position);
        TextView addTextView = (TextView) listItemView.findViewById(R.id.address);
        addTextView.setText(loc2.getAddress());
        TextView discriptionTextView = (TextView) listItemView.findViewById(R.id.discrip);
        discriptionTextView.setText(loc2.getDisctription());
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        nameTextView.setText(loc2.getName());
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.phone);
        numberTextView.setText(loc2.getPhone());
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.img);
        iconView.setImageResource(loc2.getImgid());
        return listItemView;
    }
}