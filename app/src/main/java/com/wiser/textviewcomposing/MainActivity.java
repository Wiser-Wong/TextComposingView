package com.wiser.textviewcomposing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.wiser.text.TextComposingView;

public class MainActivity extends AppCompatActivity {

    private TextComposingView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text);
        textView.setText("大立科技的弗兰克打扫房间多少开了房间666666666666666666666666666");
    }
}
