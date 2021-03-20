package com.example.muhammadzain.myapplication.FAAMA_ui.FAAMA_checktables;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.muhammadzain.myapplication.FAAMA_CheckTablesAdapter;
import com.example.muhammadzain.myapplication.R;

public class FAAMA_CheckTablesFragment extends Fragment {

    private FAAMA_CheckTablesViewModel FAAMA_CheckTablesViewModel;


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        FAAMA_CheckTablesViewModel.context = getContext();
        FAAMA_CheckTablesViewModel = ViewModelProviders.of(this).get(FAAMA_CheckTablesViewModel.class);


        View root = inflater.inflate(R.layout.faama_fragment_tables, container, false);
        final ListView tablesListView = root.findViewById(R.id.listView_checktables);


        FAAMA_CheckTablesViewModel.getTablesAdapter().observe(this, new Observer<FAAMA_CheckTablesAdapter>() {
            @Override
            public void onChanged(FAAMA_CheckTablesAdapter faama_checkTablesAdapter) {

                tablesListView.setAdapter(faama_checkTablesAdapter);

            }
        });


        return root;
    }

    private void onChanged() {
    }
}