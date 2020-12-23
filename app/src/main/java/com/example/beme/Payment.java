package com.example.beme;

import android.content.Intent;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

public class Payment extends AppCompatActivity {

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.payment);

        findViewById(R.id.buy2).setOnClickListener(onClickListener);

    }

    final View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.buy2:
                    Log.e("구매완료","구매완료");
                    startPayActivity();
                    break;
            }
        }

        private void startPayActivity() {
            Intent intent = new Intent(Payment.this, My.class);
            startActivity(intent);
        }
    };

}
