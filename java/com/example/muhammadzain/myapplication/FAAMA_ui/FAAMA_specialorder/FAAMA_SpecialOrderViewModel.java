package com.example.muhammadzain.myapplication.FAAMA_ui.FAAMA_specialorder;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.muhammadzain.myapplication.FAAMA_Order;
import com.example.muhammadzain.myapplication.FAAMA_OrderAdapter;

import java.util.ArrayList;

public class FAAMA_SpecialOrderViewModel extends ViewModel {

    private MutableLiveData<FAAMA_OrderAdapter> orderAdapter;


    //NOT SURE ABOUT THIS
    public static Context context;
    public FAAMA_SpecialOrderViewModel() {

        orderAdapter=new MutableLiveData<>();

        ArrayList<FAAMA_Order> list=new ArrayList<>();

        FAAMA_Order FAAMAOrder =new FAAMA_Order();
        FAAMAOrder.setOrderId(100);
        FAAMAOrder.setDishName("CAJUN PASTA");
        FAAMAOrder.setTableNo(25);
        FAAMAOrder.setPriority(2);

        list.add(FAAMAOrder);


        FAAMA_Order FAAMAOrder1 =new FAAMA_Order();

        FAAMAOrder1.setOrderId(101);
        FAAMAOrder1.setDishName("Biryani");
        FAAMAOrder1.setTableNo(12);
        FAAMAOrder1.setPriority(6);

        list.add(FAAMAOrder1);

        FAAMA_Order FAAMAOrder2 =new FAAMA_Order();

        FAAMAOrder2.setOrderId(131);
        FAAMAOrder2.setDishName("Egg Fried Rice");
        FAAMAOrder2.setTableNo(18);
        FAAMAOrder2.setPriority(8);

        list.add(FAAMAOrder2);


        FAAMA_OrderAdapter adapter=new FAAMA_OrderAdapter(context,list);

        orderAdapter.setValue(adapter);

    }

    public LiveData<FAAMA_OrderAdapter> getOrderAdapter() {
        return orderAdapter;
    }
}