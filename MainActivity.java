package com.example.exercice4td1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView text1;
    private EditText edit1;
    private EditText edit2;
    private CheckBox checkBox;
    private Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercice1);
        text1 = findViewById(R.id.textView);
        edit1 = findViewById(R.id.editText1);
        edit2 = findViewById(R.id.editText2);
        checkBox = findViewById(R.id.checkBox);
        bt = findViewById(R.id.concatenateButton);

    }

    public void concat(View view) {

        String mot1 = edit1.getText().toString().trim();
        String mot2 = edit2.getText().toString().trim();

        if (mot1.isEmpty() || mot2.isEmpty()) {

            Toast.makeText(MainActivity.this, "Champs vide", Toast.LENGTH_SHORT).show();
        } else {

            String result = mot1;
            if (checkBox.isChecked()) {
                result += " ";
            }
            result += mot2;
            Toast.makeText(MainActivity.this, "Concaténation : " + result, Toast.LENGTH_SHORT).show();

        }
    }
}