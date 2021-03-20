package com.example.muhammadzain.myapplication.FAAMA_ui.FAAMA_setthreshold;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FAAMA_SetThresholdViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FAAMA_SetThresholdViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is send fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}