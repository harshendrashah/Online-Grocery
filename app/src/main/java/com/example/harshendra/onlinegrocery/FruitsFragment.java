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
public class FruitsFragment extends Fragment {


    ItemAdapter adapter;
    ListView lv;

    public FruitsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_fruits, container, false);
        // Inflate the layout for this fragment
        lv = rootView.findViewById(R.id.listView);
        adapter = new ItemAdapter(getContext(), getData());
        lv.setAdapter(adapter);

        return rootView;
    }


    private ArrayList getData() {

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Apple", R.drawable.apples, "20", "1", "Kgs"));
        items.add(new Item("Banana", R.drawable.banana, "4", "1", "Pieces"));
        items.add(new Item("Pear", R.drawable.pear, "40", "1", "Kgs"));
        items.add(new Item("Watermelon", R.drawable.watermelon, "60", "1", "Kgs"));

        return items;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Fruits");
    }

}
