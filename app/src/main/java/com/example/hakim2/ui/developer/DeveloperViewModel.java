package com.example.hakim2.ui.developer;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DeveloperViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DeveloperViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Ini adalah Developer Fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}