package com.example.mylivedate;

import androidx.lifecycle.MutableLiveData;

import java.util.HashMap;
import java.util.Map;

public class LiveDataBus <T>{

    private static  LiveDataBus mLiveDataBus = new LiveDataBus();

    private Map<String, MutableLiveData> mMap;

    private LiveDataBus(){
        mMap = new HashMap<>();
    }

    public static LiveDataBus getInstance(){
        return  mLiveDataBus;
    }

    public    MutableLiveData<T> with(String key,Class<T> type){
        if(!mMap.containsKey(key)){
            mMap.put(key,new MutableLiveData<Object>());
        }
        return  mMap.get(key);
    }
}
