package com.example.module2;

import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter implements ListAdapter {

    ArrayList<SubjectData> arrayList;
    Context context;

    public CustomAdapter(Context context, ArrayList<SubjectData> arrayList) {
        this.arrayList = arrayList;
        this.context = context;

    }

    @Override
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override
    public boolean isEnabled(int i) {
        return true;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {

    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        SubjectData  subjectData = arrayList.get(i);
        if (view==null){
            LayoutInflater inflater = LayoutInflater.from(context);
            view= inflater.inflate(R.layout.list_row,null);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(subjectData.Link));
                    context.startActivity(intent);

                }
            });
            TextView title = view.findViewById(R.id.list_title);
            ImageView image = view.findViewById(R.id.list_image);

            title.setText(subjectData.Uicomponentname);
            image.setImageResource(subjectData.Image);

//            try {
//                image.setImageResource(Integer.parseInt((subjectData.Image).toString()));
//            }catch (NumberFormatException e){
//
//            }

        }

        return view;
    }

    @Override
    public int getItemViewType(int i) {
        return i;
    }

    @Override
    public int getViewTypeCount() {
        return arrayList.size();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
