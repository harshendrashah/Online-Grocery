package com.example.harshendra.onlinegrocery;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ItemAdapter extends BaseAdapter {

    Context c;
    ArrayList<item> items;

    public ItemAdapter(Context c, ArrayList<item> items) {
        this.c = c;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return items.get(i);
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

        final item s= (item) this.getItem(i);

        ImageView img= (ImageView) view.findViewById(R.id.item_image);
        TextView name= (TextView) view.findViewById(R.id.item_name);
        TextView price = (TextView) view.findViewById(R.id.item_price);
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
