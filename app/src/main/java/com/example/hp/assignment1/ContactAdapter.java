package com.example.hp.assignment1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by HP on 10/2/2017.
 */
public class ContactAdapter extends ArrayAdapter {
    public ContactAdapter(Context context, List objects) {
        super(context, 0, objects);
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = LayoutInflater.from(getContext()).inflate(R.layout.custom_contact_layout , parent, false);

        TextView t1 = (TextView) view.findViewById(R.id.txt1);
        TextView t2 = (TextView) view.findViewById(R.id.txt2);
        Contact contact = (Contact) getItem(position);
        t1.setText(contact.getName());
        t2.setText(contact.getPhone() );

        return view;
    }
}

