package com.example.beme;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Search extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);

        findViewById(R.id.million).setOnClickListener(onClickListener);

    }

    final View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.million:
                    Log.e("원밀리언 결제","원밀리언 결제");
                    startMillionActivity();
                    break;
            }
        }

        private void startMillionActivity() {
            Intent intent = new Intent(Search.this, Take.class);
            startActivity(intent);
        }

    };

}
