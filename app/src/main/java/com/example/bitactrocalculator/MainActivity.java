package com.example.bitactrocalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonAdd, buttonSub, buttonDivision, buttonMul, button10, buttonC, buttonEqual;
    EditText bitactroEditText;
    TextView resultEditText;
    ImageView clear, putabove;
    TextView useResult;
    float mValueOne, mValueTwo;
    double store, val3, result = 0;
    boolean bitactroAddition, mSubtract, bitactroMultiplication, bitactroDivision;
    String str = "";
    int val1 = 0, val2, tcount = 0, acount = 0, scount = 0, dcount = 0, mcount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSub = (Button) findViewById(R.id.buttonSub);
        buttonMul = (Button) findViewById(R.id.buttonMul);
        buttonDivision = (Button) findViewById(R.id.buttonDivision);
        buttonC = (Button) findViewById(R.id.buttonC);
        clear = (ImageView) findViewById(R.id.cut);
        putabove = (ImageView) findViewById(R.id.put_above);
        useResult = (TextView) findViewById(R.id.use_result);
        bitactroEditText = (EditText) findViewById(R.id.edt1);
        resultEditText = (TextView) findViewById(R.id.edt2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = str + '1';
                String temp = str;
                bitactroEditText.setText(str);
                str = handleOperatorSymbols(str);
                String ans = calculate(str);
                BigDecimal b1 = new BigDecimal(ans).stripTrailingZeros();
                ans = b1.toString();
                Double d = Double.parseDouble(ans);
                DecimalFormat format = new DecimalFormat("0.######");
                ans = format.format(d);
                resultEditText.setText(ans);

                str = temp;
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = str + "2";
                String temp = str;
                bitactroEditText.setText(str);
                str = handleOperatorSymbols(str);
                String ans = calculate(str);
                BigDecimal b1 = new BigDecimal(ans).stripTrailingZeros();
                ans = b1.toString();
                Double d = Double.parseDouble(ans);
                DecimalFormat format = new DecimalFormat("0.######");
                ans = format.format(d);
                resultEditText.setText(ans);

                str = temp;
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = str + "3";
                String temp = str;
                bitactroEditText.setText(str);
                str = handleOperatorSymbols(str);
                String ans = calculate(str);
                BigDecimal b1 = new BigDecimal(ans).stripTrailingZeros();
                ans = b1.toString();
                Double d = Double.parseDouble(ans);
                DecimalFormat format = new DecimalFormat("0.#######");
                ans = format.format(d);
                resultEditText.setText(ans);
                str = temp;
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = str + "4";
                String temp = str;
                bitactroEditText.setText(str);
                str = handleOperatorSymbols(str);
                String ans = calculate(str);
                BigDecimal b1 = new BigDecimal(ans).stripTrailingZeros();
                ans = b1.toString();
                Double d = Double.parseDouble(ans);
                DecimalFormat format = new DecimalFormat("0.######");
                ans = format.format(d);
                resultEditText.setText(ans);
                str = temp;
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = str + '5';
                String temp = str;
                bitactroEditText.setText(str);
                str = handleOperatorSymbols(str);
                String ans = calculate(str);
                BigDecimal b1 = new BigDecimal(ans).stripTrailingZeros();
                ans = b1.toString();
                Double d = Double.parseDouble(ans);
                DecimalFormat format = new DecimalFormat("0.######");
                ans = format.format(d);
                resultEditText.setText(ans);
                str = temp;
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = str + "6";
                String temp = str;
                bitactroEditText.setText(str);
                str = handleOperatorSymbols(str);
                String ans = calculate(str);
                BigDecimal b1 = new BigDecimal(ans).stripTrailingZeros();
                ans = b1.toString();
                Double d = Double.parseDouble(ans);
                DecimalFormat format = new DecimalFormat("0.######");
                ans = format.format(d);
                resultEditText.setText(ans);
                str = temp;
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = str + "7";
                String temp = str;
                bitactroEditText.setText(str);
                str = handleOperatorSymbols(str);
                String ans = calculate(str);
                BigDecimal b1 = new BigDecimal(ans).stripTrailingZeros();
                ans = b1.toString();
                Double d = Double.parseDouble(ans);
                DecimalFormat format = new DecimalFormat("0.######");
                ans = format.format(d);
                resultEditText.setText(ans);
                str = temp;
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = str + "8";
                String temp = str;
                bitactroEditText.setText(str);
                str = handleOperatorSymbols(str);
                String ans = calculate(str);
                BigDecimal b1 = new BigDecimal(ans).stripTrailingZeros();
                ans = b1.toString();
                Double d = Double.parseDouble(ans);
                DecimalFormat format = new DecimalFormat("0.######");
                ans = format.format(d);
                resultEditText.setText(ans);
                str = temp;
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = str + "9";
                String temp = str;
                bitactroEditText.setText(str);
                str = handleOperatorSymbols(str);
                String ans = calculate(str);
                BigDecimal b1 = new BigDecimal(ans).stripTrailingZeros();
                ans = b1.toString();
                Double d = Double.parseDouble(ans);
                DecimalFormat format = new DecimalFormat("0.######");
                ans = format.format(d);
                resultEditText.setText(ans);
                str = temp;
            }
        });


        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (str.length() == 0) {
                    bitactroEditText.setText("Bad Expression");
                } else if (validCheck(str)) {

                    bitactroEditText.setText(str + "+");
                    str = str + '+';
                } else {

                    if (str.length() > 0) {

                        str = str.substring(0, str.length() - 1);
                        str = str + "+";
                        bitactroEditText.setText(str);
                    } else bitactroEditText.setText("Bad Expression");
                }

            }
        });


        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str += '0';

                String temp = str;
                bitactroEditText.setText(str);
                str = handleOperatorSymbols(str); //handling divide symbol
                if (str.length() < 2) {

                } else if (str.charAt(str.length() - 2) == '/') {

                } else {
                    str = handleOperatorSymbols(str);
                    String ans = calculate(str);


                    BigDecimal b1 = new BigDecimal(ans).stripTrailingZeros();
                    ans = b1.toString();
                    Double d = Double.parseDouble(ans);
                    DecimalFormat format = new DecimalFormat("0.######");
                    ans = format.format(d);
                    resultEditText.setText(ans);
                }

                str = temp;
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (str.length() == 0) {
                    bitactroEditText.setText(str + "-");
                    str += '-';
                } else if (str.length() > 1 && str.charAt(str.length() - 1) == '-') {

                } else if (validCheck(str)) {

                    bitactroEditText.setText(bitactroEditText.getText() + "-");
                    str = str + '-';
                } else {
                    int len = bitactroEditText.getText().length();
                    if (len > 0) {
                        if (str.length() > 1 && str.charAt(str.length() - 1) == '+')
                            str = str.substring(0, str.length() - 1);
                        str = str + "-";
                        bitactroEditText.setText(str);
                    }
                }


            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (str.length() == 0) {
                    bitactroEditText.setText("Bad Expression");
                } else if (validCheck(str)) {

                    bitactroEditText.setText(bitactroEditText.getText() + "x");
                    str = str + 'x';
                } else {
                    int len = bitactroEditText.getText().length();
                    if (len > 0) {
                        str = str.substring(0, str.length() - 1);
                        str = str + 'x';
                        bitactroEditText.setText(str);
                    }
                }

            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (str.length() == 0) {
                    bitactroEditText.setText("Bad Expression");
                } else if (validCheck(str)) {

                    bitactroEditText.setText(bitactroEditText.getText() + "÷");
                    str = str + '÷';
                } else {
                    int len = bitactroEditText.getText().length();
                    if (len > 0) {
                        str = str.substring(0, str.length() - 1);
                        str = str + "÷";
                        bitactroEditText.setText(str);
                    }
                }
            }
        });


        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = "";
                bitactroEditText.setText(str);
                resultEditText.setText(str);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (str.length() > 0)
                    if (validCheck(str))
                        str = str + '.';


                bitactroEditText.setText(str);
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (str.length() > 0)
                    str = str.substring(0, str.length() - 1);
                bitactroEditText.setText(str);
                String ans = "";
                if (str.length() > 0) {
                    String temp = str;
                    str = handleOperatorSymbols(str);
                    ans = calculate(str);
                    str = temp;
                }
                resultEditText.setText(ans);


            }
        });
        putabove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //String temp=str;
                str = handleOperatorSymbols(str);
                String ans = calculate(str);
                BigDecimal b1 = new BigDecimal(ans).stripTrailingZeros();
                ans = b1.toString();
                Double d = Double.parseDouble(ans);
                DecimalFormat format = new DecimalFormat("0.#######");
                ans = format.format(d);
                bitactroEditText.setText(ans);
                str = ans;

            }
        });
        useResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = handleOperatorSymbols(str);
                String ans = calculate(str);
                BigDecimal b1 = new BigDecimal(ans).stripTrailingZeros();
                ans = b1.toString();
                Double d = Double.parseDouble(ans);
                DecimalFormat format = new DecimalFormat("0.#######");
                ans = format.format(d);
                bitactroEditText.setText(ans);
                str = ans;
            }
        });
    }

    boolean validCheck(String S) {
        String temp = S;
        S = handleOperatorSymbols(S);
        if (S == null) {
            str = temp;
            return false;
        } else if (S.charAt(S.length() - 1) == '.') {
            str = temp;
            return false;
        } else if (S.charAt(S.length() - 1) == '/' || S.charAt(S.length() - 1) == '*' || S.charAt(S.length() - 1) == '+' || S.charAt(S.length() - 1) == '-') {
            str = temp;
            return false;
        }

        return true;


    }

    String calculate(String S) {
        String res = "";
        int len = S.length() -1, count = 0, flag = 0,f=0;
        while (len >= 0) {
            if (S.charAt(len) == '+' || S.charAt(len) == '/' || S.charAt(len) == '*' || S.charAt(len) == '*') {
                if (S.charAt(len) == '/') {

                    if(S.charAt(S.length()-1)!='/') {
                        String st = S.substring(len +1, S.length() );
                        Double d = Double.parseDouble(st);
                        if (d == 0) {
                            S =S.substring(0,len);
                            flag=1;
                        }
                    }

                }
                break;
            }
            count++;
            len--;
        }



                 char c = S.charAt(S.length() - 1);
            String exp;
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                exp = S.substring(0, S.length() - 1);
            } else exp = S;
            ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");
            Object result = null;
            try {
                result = engine.eval(exp);
                res = result.toString();
            } catch (Exception e) {
                res = "Error";

            }



        return res;
    }

    String handleOperatorSymbols(String S) {
        String res = "";
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'x') {
                res += "*";
            } else if (S.charAt(i) == '÷') {
                res += "/";
            } else {
                res += S.charAt(i);
            }
        }
        return res;
    }
}
