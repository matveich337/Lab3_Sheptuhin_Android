package com.example.Lab3_Sheptuhin_Android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    private static final String VALUE_KEY = "Value";
    EditText editText;
    TextView textView;
    String LOG_TAG = "myLogs";
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button1);
        editText = (EditText) findViewById(R.id.editTextViewOne);
        textView = (TextView) findViewById(R.id.textViewOne);

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        text = ((EditText) findViewById(R.id.editTextViewOne)).getText().toString();
                        textView.setText(text);
                    }
                }
        );
        Log.d(LOG_TAG,"onCreate");
    }
}