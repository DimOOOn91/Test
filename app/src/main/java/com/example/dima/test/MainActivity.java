package com.example.dima.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText name;
    private EditText nikName;
    private EditText phone;
    private EditText email;
    private EditText icq;
    private Button mButton;
    private TextView result;

    private static Note sNote;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.edit_name);
        nikName = (EditText) findViewById(R.id.edit_nikName);
        phone = (EditText) findViewById(R.id.edit_phone);
        email = (EditText) findViewById(R.id.edit_email);
        icq = (EditText) findViewById(R.id.edit_icq);
        result = (TextView) findViewById(R.id.text_Note);

        mButton = (Button) findViewById(R.id.button_save);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sNote = new Note(name.getText().toString(), nikName.getText().toString(),
                        phone.getText().toString(), email.getText().toString(),
                        icq.getText().toString());
                result.setText(sNote.toString());
            }
        });

    }
}
