package com.example.todoapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.todoapp.model.Item;

import java.util.List;

public class ItemAdapter extends ArrayAdapter<Item> {
    public ItemAdapter(@NonNull Context context, int resource, @NonNull List<Item> objects) {
        super(context, resource, objects);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        }

        final Item item = getItem(position);

        final ImageView ivItem = convertView.findViewById(R.id.ivItem);
        TextView tvItem = convertView.findViewById(R.id.tvItem);

        ivItem.setImageResource(item.isDone() ? R.drawable.done : R.drawable.notdone);
        tvItem.setText(item.getText());

        ivItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                item.setDone(!item.isDone());
                notifyDataSetChanged();
            }
        });

        return convertView;
    }
}
