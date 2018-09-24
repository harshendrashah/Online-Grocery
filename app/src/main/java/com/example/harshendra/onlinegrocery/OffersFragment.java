package com.example.harshendra.onlinegrocery;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class OffersFragment extends Fragment {


    ItemAdapter adapter;
    ListView lv;

    public OffersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_offers, container, false);
        // Inflate the layout for this fragment
        lv = rootView.findViewById(R.id.listView);
        adapter = new ItemAdapter(getContext(), getData());
        lv.setAdapter(adapter);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    private ArrayList getData() {

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Milk", R.drawable.milk2, "100", "1"));
        items.add(new Item("Banana", R.drawable.banana, "4", "1"));
        items.add(new Item("Brinjal", R.drawable.brinjal, "40", "1"));
        items.add(new Item("Burger", R.drawable.burger, "45", "1"));
        items.add(new Item("Cake", R.drawable.cake, "350", "1"));

        return items;
    }

}
