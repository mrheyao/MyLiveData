package com.example.mylivedate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

/**
 * livedata感知生命周期
 */
public class MainActivity extends AppCompatActivity {


    private String name;
    MutableLiveData<String> liveData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        liveData  =LiveDataBus.getInstance().with("user",String.class);

//        liveData.observe(MainActivity.this, new Observer<String>() {
//            @Override
//            public void onChanged(String s) {
//                Log.d("testtt","s:"+s);
//            }
//        });

    }

    public void getMessage(View view) {

        liveData.postValue("1111");
        liveData.postValue("22222");
        Intent intent = new Intent(this,TwoActivity.class);
        startActivity(intent);
    }
}
