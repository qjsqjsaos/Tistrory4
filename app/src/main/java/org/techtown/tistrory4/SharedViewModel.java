package org.techtown.tistrory4;

//라이브데이타 클래스 만들기

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {

    //String
    private MutableLiveData<String> liveDataString = new MutableLiveData<>();

    public LiveData<String> getLiveDataString(){
        return liveDataString;
    }

    public void setLiveDataString(String str){
        liveDataString.setValue(str);
    }
    //int
    private MutableLiveData<Integer> liveDataInt = new MutableLiveData<>();

    public LiveData<Integer> getLiveDataInt(){
        return liveDataInt;
    }

    public void setLiveDataInt(Integer integer){
        liveDataInt.setValue(integer);
    }
    //long
    private MutableLiveData<Long> liveDataLong = new MutableLiveData<>();

    public LiveData<Long> getLiveDataLong(){
        return liveDataLong;
    }

    public void setLiveDataLong(long longa){
        liveDataLong.setValue(longa);
    }
}
