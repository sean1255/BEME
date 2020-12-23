package com.example.beme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main1);

        findViewById(R.id.onemilion).setOnClickListener(onClickListener);
        findViewById(R.id.add).setOnClickListener(onClickListener);

    }

    final View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.onemilion:
                    Log.e("원밀리언","원밀리언");
                    startTakeActivity();
                    break;
                case R.id.add:
                    Log.e("맞춤설정", "맞춤설정");
                    startCustomActivity();
                    break;
            }
        }

        private void startTakeActivity() {
            Intent intent = new Intent(MainActivity.this, Take.class);
            startActivity(intent);
        }
        private void startCustomActivity() {
            Intent intent = new Intent(MainActivity.this, Custom.class);
        }

    };
}