package com.example.muhammadzain.myapplication;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class FAAMA_WaiterAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<FAAMA_Waiter> arrayList;

    public FAAMA_WaiterAdapter(Context context, ArrayList<FAAMA_Waiter> arrayList) {
        this.context = context;
        this.arrayList = arrayList;

        Log.d("ArraySize", arrayList.toString());

    }

    @Override
    public int getCount() {

        return arrayList.size();
    }

    @Override
    public FAAMA_Waiter getItem(int position) {

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




            FAAMA_Waiter FAAMAWaiter = arrayList.get(position);

            ViewHodler holder;

            if (convertView == null) {
                convertView = inflater.inflate(R.layout.faama_waiterlist_view, parent, false);
                holder = new FAAMA_WaiterAdapter.ViewHodler();

                holder.waiterIdTextView =(TextView) convertView.findViewById(R.id.tv_waiterId);

                holder.waiterNameTextView =(TextView) convertView.findViewById(R.id.tv_waiterName);

                holder.assignedTablesTextView=(TextView)convertView.findViewById(R.id.tv_assigned_tables);




                convertView.setTag(holder);
            } else {
                holder = (ViewHodler) convertView.getTag();
            }



            holder.waiterIdTextView.setText(String.valueOf(FAAMAWaiter.getWaiterId()));

            holder.waiterNameTextView.setText(String.valueOf(FAAMAWaiter.getWaiterName()));

            ArrayList<Integer> list= FAAMAWaiter.getAssignedTables();
            StringBuffer tables=new StringBuffer();
            for(int i=0;i<list.size();i++)
            {
                tables.append(String.valueOf(list.get(i)));
                if((i+1)!=list.size())
                {

                    tables.append(" ");
                    tables.append(String.valueOf(","));

                    tables.append(" ");
                }

            }
            holder.assignedTablesTextView.setText(tables);







            return convertView;
        }


        return null;
    }

    // View holder to hold views
    private class ViewHodler {

//            TextView contactName, contactNumber, contactEmail;


        TextView waiterIdTextView;
        TextView waiterNameTextView;

        TextView assignedTablesTextView;



    }

}
