package com.gmardon.java_epicture_2017;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayAdapter<Image> adapter;
    ListView imageListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_list);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        imageListView = findViewById(R.id.image_list);

        SearchView search = findViewById(R.id.search);
        search.setLayoutParams(new Toolbar.LayoutParams(Gravity.RIGHT));
    }

    private void search() {
        ArrayList<Image> imageList = new ArrayList<>();
        if (adapter == null) {
            adapter = new ImageListAdapter(this, R.layout.image_list_entry, imageList);
            imageListView.setAdapter(adapter);
        } else {
            adapter.clear();
            adapter.addAll(imageList);
            adapter.notifyDataSetChanged();
        }
    }
}
