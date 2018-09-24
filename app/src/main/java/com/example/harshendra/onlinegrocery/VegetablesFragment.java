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
public class VegetablesFragment extends Fragment {


    ItemAdapter adapter;
    ListView lv;

    public VegetablesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_vegetables, container, false);
        // Inflate the layout for this fragment
        lv = rootView.findViewById(R.id.listView);
        adapter = new ItemAdapter(getContext(), getData());
        lv.setAdapter(adapter);

        return rootView;
    }


    private ArrayList getData() {

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Potatoes", R.drawable.potatos, "20", "1", "Kgs"));
        items.add(new Item("Capsicum", R.drawable.capsicum, "40", "1", "Kgs"));
        items.add(new Item("Aubergines", R.drawable.brinjal, "50", "1", "Kgs"));
        items.add(new Item("LadyFinger", R.drawable.ladyfinger, "60", "1", "Kgs"));
        items.add(new Item("Corn", R.drawable.corn, "45", "1 Kg", "Kgs"));

        return items;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Vegetables");
    }

}
