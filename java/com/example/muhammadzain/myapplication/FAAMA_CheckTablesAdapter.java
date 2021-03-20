package com.example.muhammadzain.myapplication;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class FAAMA_CheckTablesAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<FAAMA_Table> arrayList;

    public FAAMA_CheckTablesAdapter(Context context, ArrayList<FAAMA_Table> arrayList) {
        this.context = context;
        this.arrayList = arrayList;

        Log.d("ArraySize", arrayList.toString());

    }

    @Override
    public int getCount() {

        return arrayList.size();
    }

    @Override
    public FAAMA_Table getItem(int position) {

        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {

        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(context!=null)
        {

            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);




            FAAMA_Table FAAMATable = arrayList.get(position);

            ViewHodler holder;

            if (convertView == null) {
                convertView = inflater.inflate(R.layout.faama_tablelist_view, parent, false);
                holder = new FAAMA_CheckTablesAdapter.ViewHodler();

                holder.tableId=(TextView) convertView.findViewById(R.id.tableId_tableListViewItem);

                holder.tableStatus=(TextView) convertView.findViewById(R.id.tableStatus_tableListViewItem);





                convertView.setTag(holder);
            } else {
                holder = (ViewHodler) convertView.getTag();
            }

            holder.tableId.setText(String.valueOf(FAAMATable.getId()));

            if(FAAMATable.isStatus())
            {

                holder.tableStatus.setText("Available");

            }
            else
            {

                holder.tableStatus.setText("Not Available");

            }









            return convertView;
        }


        return null;
    }

    // View holder to hold views
    private class ViewHodler {

//            TextView contactName, contactNumber, contactEmail;


        TextView tableId;
        TextView tableStatus;



    }

}
