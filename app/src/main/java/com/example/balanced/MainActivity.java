package com.example.balanced;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void balanced(View v) {
        EditText t1 = (EditText)findViewById(R.id.editText1);
        EditText t2 = (EditText)findViewById(R.id.editName);
           char result;
           int count=0;
       String n1 = t1.getText().toString();

           for (int i = 0; i < n1.length(); i++) {
               result = n1.charAt(i);
               if (result == '(') {
                   count++;
               } else if (result == ')') {
                   count--;
                   if (count == -1) {
                       break;
                   }
               }
           }

           if (count == 0) {
               t2.setText("balanced");
           } else if (count == -1 || count == 1) {
               t2.setText("unbalanced!!!");
           }
       }

    


    public void hide(View v)
    {
        try

        {
            InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        } catch(Exception e)

        {
            // TODO: handle exception
        }
    }



}