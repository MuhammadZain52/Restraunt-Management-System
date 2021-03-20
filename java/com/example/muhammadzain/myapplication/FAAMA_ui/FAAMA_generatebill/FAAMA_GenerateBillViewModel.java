package com.example.muhammadzain.myapplication.FAAMA_ui.FAAMA_generatebill;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FAAMA_GenerateBillViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FAAMA_GenerateBillViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}