package com.example.muhammadzain.myapplication.FAAMA_ui.FAAMA_generatebill;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.muhammadzain.myapplication.R;

public class FAAMA_GenerateBillFragment extends Fragment {

    private FAAMA_GenerateBillViewModel FAAMAGenerateBillViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        FAAMAGenerateBillViewModel =
                ViewModelProviders.of(this).get(FAAMA_GenerateBillViewModel.class);
        View root = inflater.inflate(R.layout.faama_fragment_generate_bill, container, false);
        final TextView textView = root.findViewById(R.id.tv_orderId);

        final Button printButton= root.findViewById(R.id.print_button);
        return root;
    }
}