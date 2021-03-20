package com.example.muhammadzain.myapplication.FAAMA_ui.FAAMA_checktables;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.muhammadzain.myapplication.FAAMA_CheckTablesAdapter;
import com.example.muhammadzain.myapplication.FAAMA_Table;

import java.util.ArrayList;

public class FAAMA_CheckTablesViewModel extends ViewModel {


    private MutableLiveData<FAAMA_CheckTablesAdapter> tablesAdapter;


    //NOT SURE ABOUT THIS
    public static Context context;

    public FAAMA_CheckTablesViewModel() {


        tablesAdapter=new MutableLiveData<>();

        ArrayList<FAAMA_Table> list=new ArrayList<>();

        FAAMA_Table FAAMATable =new FAAMA_Table();

        FAAMATable.setId(100);
        FAAMATable.setStatus(true);

        list.add(FAAMATable);

        FAAMA_Table FAAMATable1 =new FAAMA_Table();

        FAAMATable1.setId(105);
        FAAMATable1.setStatus(false);

        list.add(FAAMATable1);


        FAAMA_Table FAAMATable2 =new FAAMA_Table();

        FAAMATable2.setId(110);
        FAAMATable2.setStatus(false);

        list.add(FAAMATable2);

        FAAMA_CheckTablesAdapter adapter =new FAAMA_CheckTablesAdapter(context,list);

        tablesAdapter.setValue(adapter);

    }


    public LiveData<FAAMA_CheckTablesAdapter> getTablesAdapter(){
        return tablesAdapter;
    }



}