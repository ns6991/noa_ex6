package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random ran = new Random();
    int num1 = ran.nextInt(90)+10;
    int num2 = ran.nextInt(90)+10;
    int counter=0;
    Button reset;
    TextView a1;
    TextView a2;
    EditText a3;
    ImageView a4;
    Button a5;
    TextView b1;
    TextView b2;
    EditText b3;
    ImageView b4;
    Button b5;
    TextView c1 ;
    TextView c2;
    EditText c3;
    ImageView c4;
    Button c5;
    int ans1;
    int ans2;
    int ans3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //creating objects
        reset = findViewById(R.id.reset);
        a1 = findViewById(R.id.a1);
        a2 = findViewById(R.id.a2);
        a3 = findViewById(R.id.a3);
        a4 = findViewById(R.id.a4);
        a5 = findViewById(R.id.a5);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);
        c3 = findViewById(R.id.c3);
        c4 = findViewById(R.id.c4);
        c5 = findViewById(R.id.c5);

        //set beginning
        a1.setText("" + num1);
        a2.setText("" + num2);
        b3.setEnabled(false);
        b5.setEnabled(false);
        c3.setEnabled(false);
        c5.setEnabled(false);
        b1.setText(null);
        b2.setText(null);
        c2.setText(null);
        c1.setText(null);

    }


    public void clickedA(View view) {
        ans1 = Integer.parseInt(a3.getText().toString());
        if(num1+num2==ans1){
            a4.setImageResource(R.drawable.good);
            counter++;
        }
        else{
            a4.setImageResource(R.drawable.bad);
        }
        a3.setEnabled(false);
        a5.setEnabled(false);
        b3.setEnabled(true);
        b5.setEnabled(true);
        num1+=num2;
        num2=ran.nextInt(90)+10;
        b1.setText(""+num1);
        b2.setText(""+num2);
    }

    public void clickedB(View view) {
        ans2 = Integer.parseInt(b3.getText().toString());
        if(num1+num2==ans2){
            b4.setImageResource(R.drawable.good);
            counter++;
        }
        else{
            b4.setImageResource(R.drawable.bad);
        }
        b3.setEnabled(false);
        b5.setEnabled(false);
        c3.setEnabled(true);
        c5.setEnabled(true);
        num1+=num2;
        num2=ran.nextInt(90)+10;
        c1.setText(""+num1);
        c2.setText(""+num2);
    }

    public void clickedC(View view) {
        ans3 = Integer.parseInt(c3.getText().toString());
        if(num1+num2==ans3){
            c4.setImageResource(R.drawable.good);
            counter++;
        }
        else{
            c4.setImageResource(R.drawable.bad);
        }
        c3.setEnabled(false);
        c5.setEnabled(false);

        Toast.makeText(MainActivity.this,"good job!, you got "+counter+"/3 correct",Toast.LENGTH_LONG).show();
    }

    public void clickedRE(View view) {
        num1 = ran.nextInt(90)+10;
        num2 = ran.nextInt(90)+10;
        counter=0;
        a1.setText("" + num1);
        a2.setText("" + num2);
        a3.setEnabled(true);
        a3.setText(null);
        a5.setEnabled(true);
        b3.setEnabled(false);
        b3.setText(null);
        b5.setEnabled(false);
        c3.setEnabled(false);
        c3.setText(null);
        c5.setEnabled(false);
        b1.setText(null);
        b2.setText(null);
        c2.setText(null);
        c1.setText(null);
        a4.setImageResource(0);
        b4.setImageResource(0);
        c4.setImageResource(0);
    }
}