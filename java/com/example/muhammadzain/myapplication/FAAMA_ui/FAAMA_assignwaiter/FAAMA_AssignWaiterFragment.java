package com.example.muhammadzain.myapplication.FAAMA_ui.FAAMA_assignwaiter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.muhammadzain.myapplication.FAAMA_WaiterAdapter;
import com.example.muhammadzain.myapplication.R;

public class FAAMA_AssignWaiterFragment extends Fragment {

    private FAAMA_AssignWaiterViewModel FAAMA_AssignWaiterViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        FAAMA_AssignWaiterViewModel.context=getContext();

        FAAMA_AssignWaiterViewModel =
                ViewModelProviders.of(this).get(FAAMA_AssignWaiterViewModel.class);
        View root = inflater.inflate(R.layout.faama_fragment_waiter, container, false);
        final ListView waiterList = root.findViewById(R.id.listView_waiter);
        FAAMA_AssignWaiterViewModel.getWaiterAdapter().observe(this, new Observer<FAAMA_WaiterAdapter>() {
            @Override
            public void onChanged(FAAMA_WaiterAdapter faama_waiterAdapter) {
                waiterList.setAdapter(faama_waiterAdapter);
            }

        });
        return root;
    }
}