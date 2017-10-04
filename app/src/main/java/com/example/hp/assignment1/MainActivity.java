package com.example.hp.assignment1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Contact> contactList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            contactList.add(new Contact("std "+i++,"0300476755"+i++ ));
        }

        ListView listview1 = (ListView) findViewById(R.id.listview1);
        ContactAdapter contactAdapter = new ContactAdapter(this, contactList);
        listview1.setAdapter(contactAdapter);



    }
}
