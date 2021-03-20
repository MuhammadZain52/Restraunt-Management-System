package com.example.muhammadzain.myapplication.FAAMA_ui.FAAMA_specialorder;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.muhammadzain.myapplication.FAAMA_OrderAdapter;
import com.example.muhammadzain.myapplication.R;

public class FAAMA_SpecialOrderFragment extends Fragment {

    private FAAMA_SpecialOrderViewModel FAAMASpecialOrderViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        FAAMA_SpecialOrderViewModel.context=getContext();
        FAAMASpecialOrderViewModel =
                ViewModelProviders.of(this).get(FAAMA_SpecialOrderViewModel.class);
        View root = inflater.inflate(R.layout.faama_fragment_order_details, container, false);
        final ListView listView = root.findViewById(R.id.order_listview);
        FAAMASpecialOrderViewModel.getOrderAdapter().observe(this, new Observer<FAAMA_OrderAdapter>() {
            @Override
            public void onChanged(FAAMA_OrderAdapter FAAMAOrderAdapter) {
                listView.setAdapter(FAAMAOrderAdapter);
            }
        });
        return root;
    }
}