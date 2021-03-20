package com.example.muhammadzain.myapplication.FAAMA_ui.FAAMA_setthreshold;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.muhammadzain.myapplication.R;

public class FAAMA_SetThresholdFragment extends Fragment {

    private FAAMA_SetThresholdViewModel FAAMASetThresholdViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        FAAMASetThresholdViewModel =
                ViewModelProviders.of(this).get(FAAMA_SetThresholdViewModel.class);
        View root = inflater.inflate(R.layout.faama_fragment_set_threshold, container, false);
        return root;
    }
}