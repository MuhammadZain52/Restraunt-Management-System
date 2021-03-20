package com.example.muhammadzain.myapplication;

import android.content.Context;
import android.content.DialogInterface;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;

import java.util.ArrayList;

public class FAAMA_OrderAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<FAAMA_Order> arrayList;

    public FAAMA_OrderAdapter(Context context, ArrayList<FAAMA_Order> arrayList) {
        this.context = context;
        this.arrayList = arrayList;

        Log.d("ArraySize", arrayList.toString());

    }

    @Override
    public int getCount() {

        return arrayList.size();
    }

    @Override
    public FAAMA_Order getItem(int position) {

        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {

        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        FAAMA_Order FAAMAOrder = arrayList.get(position);
        ViewHodler holder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.faama_orderlist_view, parent, false);
            holder = new ViewHodler();

            holder.orderId=(TextView) convertView.findViewById(R.id.orderId);

            holder.tableNo=(TextView) convertView.findViewById(R.id.tableNo);

            holder.order=(TextView)convertView.findViewById(R.id.dishName);

            holder.priority=(TextView)convertView.findViewById(R.id.priority);


            holder.setSpecializedOrder=(ImageButton)convertView.findViewById(R.id.imageButton);


            convertView.setTag(holder);
        } else {
            holder = (ViewHodler) convertView.getTag();
        }

        holder.orderId.setText(String.valueOf(FAAMAOrder.getOrderId()));

        holder.tableNo.setText(String.valueOf(FAAMAOrder.getTableNo()));

        holder.priority.setText(String.valueOf(FAAMAOrder.getPriority()));

        holder.order.setText(FAAMAOrder.getDishName());

        holder.setSpecializedOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if(which== DialogInterface.BUTTON_POSITIVE)
                        {


                        }
                        else if(which== DialogInterface.BUTTON_NEGATIVE)
                        {



                        }

                    }
                };



                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setMessage("Are you sure?").setPositiveButton("No", dialogClickListener)
                        .setNegativeButton("Yes", dialogClickListener).show();
            }
        });






        return convertView;
    }

    // View holder to hold views
    private class ViewHodler {

//            TextView contactName, contactNumber, contactEmail;

        ImageButton setSpecializedOrder;
        TextView orderId;
        TextView tableNo;
        TextView order;
        TextView priority;


    }



}
