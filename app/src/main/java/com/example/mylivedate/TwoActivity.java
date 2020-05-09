package com.example.mylivedate;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

public class TwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MutableLiveData<String> user = LiveDataBus.getInstance().with("user",String.class);
        user.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Log.d("testtt","tow s:"+s);
            }
        });
    }

    public void getMessage(View view) {

    }
}
