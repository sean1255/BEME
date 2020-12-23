package com.example.beme;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Take extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.take);

        findViewById(R.id.buy).setOnClickListener(onClickListener);

    }

    final View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.buy:
                    Log.e("수강", "수강");
                    startBuyActivity();
                    break;
            }
        }

        private void startBuyActivity() {
            Intent intent = new Intent(Take.this, Buy.class);
            startActivity(intent);
        }
    };
}
