package com.wh.jia.navigation3;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    private MutableLiveData<Integer> number;
    public MutableLiveData<Integer> getNumber(){
        if (number == null){
            number = new MutableLiveData<Integer>();
            number.setValue(0);
        }
        return  number;
    }
    public void add(int x){
        number.setValue(number.getValue() + x);
        if(number.getValue()<0){
            number.setValue(0);
        }

    }
}
