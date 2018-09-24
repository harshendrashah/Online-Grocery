package com.example.harshendra.onlinegrocery;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends BaseAdapter {

    Context c;
    ArrayList<Item> Items;

    public ItemAdapter(Context c, ArrayList<Item> items) {
        this.c = c;
        this.Items = items;
    }

    @Override
    public int getCount() {
        return Items.size();
    }

    @Override
    public Object getItem(int i) {
        return Items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view==null)
        {
            view= LayoutInflater.from(c).inflate(R.layout.item_card,viewGroup,false);
        }

        final Item s= (Item) this.getItem(i);

        ImageView img = view.findViewById(R.id.item_image);
        TextView name = view.findViewById(R.id.item_name);
        TextView price = view.findViewById(R.id.item_price);
        TextView quantity = view.findViewById(R.id.item_quantity);

        name.setText(s.getName());
        img.setImageResource(s.getImageId());
        price.setText(s.getPrice());
        quantity.setText(s.getQuantity());

//        view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(c, s.getName(), Toast.LENGTH_SHORT).show();
//            }
//        });

        return view;
    }
}
