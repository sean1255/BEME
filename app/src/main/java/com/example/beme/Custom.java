package com.example.beme;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Custom extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom);

        findViewById(R.id.add1).setOnClickListener(onClickListener);

    }

    final View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.add1:
                    Log.e("설정완료","설정완료");
                    startAddActivity();
                    break;
            }
        }

        private void startAddActivity() {
            Intent intent = new Intent(Custom.this, Search.class);
            startActivity(intent);
        }

    };

}
