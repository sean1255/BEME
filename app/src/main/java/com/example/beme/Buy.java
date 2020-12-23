package com.example.beme;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Buy extends AppCompatActivity {

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
                    Log.e("결제", "결제");
                    startBuy2Activity();
                    break;
            }
        }

        private void startBuy2Activity() {
            Intent intent = new Intent(Buy.this, propil.class);
            startActivity(intent);
        }
    };

}
