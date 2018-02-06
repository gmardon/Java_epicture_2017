package com.gmardon.java_epicture_2017;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import android.net.Uri;
import java.util.ArrayList;

/**
 * Created by gmardon on 04/02/18.
 */

public class ImageListAdapter extends ArrayAdapter<Image> {
    private static class ViewHolder {
        private ImageView image;
    }

    private ViewHolder viewHolder;

    public ImageListAdapter(Context context, int textViewResourceId, ArrayList<Image> items) {
        super(context, textViewResourceId, items);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(this.getContext())
                    .inflate(R.layout.image_list_entry, parent, false);

            viewHolder = new ViewHolder();
            viewHolder.image = convertView.findViewById(R.id.image_list_url);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Image item = getItem(position);
        if (item != null) {
            viewHolder.image.setImageURI(Uri.parse(item.getUrl()));
        }
        return convertView;
    }
}