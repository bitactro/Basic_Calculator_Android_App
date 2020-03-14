package com.example.bitactrocalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button0, button1,button2,button3,button4,button5,button6,button7,button8,button9,buttonAdd,buttonSub,buttonDivision,buttonMul,button10,buttonC,buttonEqual;
    EditText bitactroEditText;
    float mValueOne,mValueTwo;
    boolean bitactroAddition,mSubtract,bitactroMultiplication,bitactroDivision;
     int val1=0,val2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 =(Button) findViewById(R.id.button0);
        button1 =(Button) findViewById(R.id.button1);
        button2 =(Button) findViewById(R.id.button2);
        button3 =(Button) findViewById(R.id.button3);
        button4 =(Button) findViewById(R.id.button4);
        button5 =(Button) findViewById(R.id.button5);
        button6 =(Button) findViewById(R.id.button6);
        button7 =(Button) findViewById(R.id.button7);
        button8= (Button) findViewById(R.id.button8);
        button9= (Button) findViewById(R.id.button9);
        button10= (Button) findViewById(R.id.button10);
        buttonAdd= (Button) findViewById(R.id.buttonAdd);
        buttonSub= (Button) findViewById(R.id.buttonSub);
        buttonMul= (Button) findViewById(R.id.buttonMul);
        buttonDivision= (Button) findViewById(R.id.buttonDivision);
        buttonC= (Button) findViewById(R.id.buttonC);
        buttonEqual= (Button) findViewById(R.id.buttonEqual);
        bitactroEditText= (EditText) findViewById(R.id.edt1);

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                 bitactroEditText.setText(bitactroEditText.getText()+"1");
                 

            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                bitactroEditText.setText(bitactroEditText.getText()+"2");

            }
        });

        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                bitactroEditText.setText(bitactroEditText.getText()+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                bitactroEditText.setText(bitactroEditText.getText()+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bitactroEditText.setText(bitactroEditText.getText()+"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bitactroEditText.setText(bitactroEditText.getText()+"6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bitactroEditText.setText(bitactroEditText.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bitactroEditText.setText(bitactroEditText.getText()+"8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bitactroEditText.setText(bitactroEditText.getText()+"9");
            }
        });




        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(bitactroEditText==null)
                    bitactroEditText.setText("");
                else {
                    bitactroEditText.setText(bitactroEditText.getText()+"+");
                    String text=bitactroEditText.getText().toString();


                    val1=text.length();
                    bitactroAddition = true;


                }
            }
        });


        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bitactroEditText.setText(bitactroEditText.getText()+"0");
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(bitactroEditText==null)
                    bitactroEditText.setText("");
                else {
                    bitactroEditText.setText(bitactroEditText.getText() + "-");
                    String text = bitactroEditText.getText().toString();


                    val1 = text.length();
                    mSubtract = true;
                    //bitactroEditText.setText(null);
                }}
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bitactroEditText==null)
                    bitactroEditText.setText("");
                else {
                    bitactroEditText.setText(bitactroEditText.getText() + "*");
                    String text = bitactroEditText.getText().toString();


                    val1 = text.length();
                    bitactroMultiplication = true;
                    //bitactroEditText.setText(null);
                }
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bitactroEditText==null)
                    bitactroEditText.setText("");
                else {
                    bitactroEditText.setText(bitactroEditText.getText() + "/");
                    String text = bitactroEditText.getText().toString();


                    val1 = text.length();
                    bitactroDivision = true;

                }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(bitactroAddition==true){
                    String text=bitactroEditText.getText().toString();
                    val2=text.length();
                    mValueOne=Float.parseFloat(text.substring(0,val1-1));
                    mValueTwo = Float.parseFloat(text.substring(val1,val2));

                    float result =mValueTwo+mValueOne;
                    bitactroEditText.setText(null);
                    bitactroEditText.setText(result+"");
                    bitactroAddition=false;
                }
                if(mSubtract==true){
                    String text=bitactroEditText.getText().toString();

                    val2=text.length();
                    mValueOne=Float.parseFloat(text.substring(0,val1-1));
                    mValueTwo = Float.parseFloat(text.substring(val1,val2));

                    float result =mValueOne-mValueTwo;
                    bitactroEditText.setText(null);
                    bitactroEditText.setText(result+"");
                    mSubtract=false;
                }
                if(bitactroMultiplication==true){
                    String text=bitactroEditText.getText().toString();
                    val2=text.length();
                    mValueOne=Float.parseFloat(text.substring(0,val1-1));
                    mValueTwo = Float.parseFloat(text.substring(val1,val2));

                    float result =mValueTwo*mValueOne;
                    bitactroEditText.setText(null);
                    bitactroEditText.setText(result+"");
                    bitactroMultiplication=false;
                }
                if(bitactroDivision==true){
                    String text=bitactroEditText.getText().toString();
                    val2=text.length();
                    mValueOne=Float.parseFloat(text.substring(0,val1-1));
                    mValueTwo = Float.parseFloat(text.substring(val1,val2));

                    float result =mValueOne/mValueTwo;
                    bitactroEditText.setText(null);
                    bitactroEditText.setText(result+"");
                    bitactroDivision=false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bitactroEditText.setText("");
            }
        });

        button10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                bitactroEditText.setText(bitactroEditText.getText()+".");
            }
        });
    }
}
