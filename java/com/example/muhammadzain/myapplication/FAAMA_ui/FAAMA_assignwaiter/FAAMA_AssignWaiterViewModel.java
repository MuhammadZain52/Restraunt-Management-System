package com.example.muhammadzain.myapplication.FAAMA_ui.FAAMA_assignwaiter;


import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.muhammadzain.myapplication.FAAMA_Waiter;
import com.example.muhammadzain.myapplication.FAAMA_WaiterAdapter;

import java.util.ArrayList;


public class FAAMA_AssignWaiterViewModel extends ViewModel {

    private MutableLiveData<FAAMA_WaiterAdapter> waiterAdapter;

    public static Context context;

    public FAAMA_AssignWaiterViewModel() {


        waiterAdapter=new MutableLiveData<>();


        ArrayList<FAAMA_Waiter> list=new ArrayList<>();

        FAAMA_Waiter FAAMAWaiter =new FAAMA_Waiter();
        FAAMAWaiter.setWaiterId(100);
        FAAMAWaiter.setWaiterName("Abdul Hanan");

        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);

        arr.add(23);

        arr.add(13);

        FAAMAWaiter.setAssignedTables(arr);

        list.add(FAAMAWaiter);

        FAAMA_Waiter FAAMAWaiter1 =new FAAMA_Waiter();
        FAAMAWaiter1.setWaiterId(105);
        FAAMAWaiter1.setWaiterName("Muaz Tehami");

        ArrayList<Integer> arr2=new ArrayList<>();
        arr2.add(12);

        arr2.add(21);

        arr2.add(5);

        FAAMAWaiter1.setAssignedTables(arr2);

        list.add(FAAMAWaiter1);






        FAAMA_WaiterAdapter adapter=new FAAMA_WaiterAdapter(context,list);

        waiterAdapter.setValue(adapter);
    }


    public LiveData<FAAMA_WaiterAdapter> getWaiterAdapter(){
        return waiterAdapter;
    }



}