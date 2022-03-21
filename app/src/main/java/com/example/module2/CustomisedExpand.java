package com.example.module2;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.HashMap;
import java.util.List;

public class CustomisedExpand extends BaseExpandableListAdapter {

    private Context context;
    private List<String>  TitleList;
    private HashMap<String ,List<String>> expandableList;

    public CustomisedExpand(Context context,List<String> ListTitle,HashMap<String,List<String>>Listexpandable){
        this.context = context;
        this.TitleList = ListTitle;
        this.expandableList = Listexpandable;
    }



    @Override
    public int getGroupCount() {
        return this.TitleList.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return this.expandableList.get(this.TitleList.get(i)).size();
    }

    @Override
    public Object getGroup(int i) {

        return this.TitleList.get(i);
    }

    @Override
    public Object getChild(int pos1, int exppos) {
        return this.expandableList.get(this.TitleList.get(pos1)).get(exppos);
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i1;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        String listTitle =(String) getGroup(i);
        if (view == null){
            LayoutInflater inflater =(LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.list_group,null);
        }
        TextView ttxt= (TextView) view.findViewById(R.id.expandablelistgroup);
        ttxt.setTypeface(null, Typeface.BOLD);
        ttxt.setText(listTitle);
        return view;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        String expandablelistText =(String) getChild(i,i1);
        if (view == null){
            LayoutInflater inflater =(LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.list_item,null);
        }
        TextView txtt= (TextView) view.findViewById(R.id.expandablelistitem);
        txtt.setText(expandablelistText);
        return view;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }
}
