package com.example.mobs_prototype.ui.inventory_detail;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InventoryDetailViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public InventoryDetailViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Inventory Detail fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}


