package com.pepepunk.app.applogin;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import org.xml.sax.Parser;

public class contrasenaActivity extends AppCompatActivity {
    TextView but1, but2, but3, but4;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bx, bEntrar;
    int num1 = 10, num2 = 10, num3 = 10, num4 = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contrasena);
        but1 = (TextView) findViewById(R.id.but1);
        but2 = (TextView) findViewById(R.id.but2);
        but3 = (TextView) findViewById(R.id.but3);
        but4 = (TextView) findViewById(R.id.but4);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b0 = (Button) findViewById(R.id.b0);
        bx = (Button) findViewById(R.id.bx);
        bEntrar=(Button) findViewById(R.id.btEntrar);

        b1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                valorNum1();
            }
        });
        b2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                valorNum2();
            }
        });
        b3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                valorNum3();
            }
        });
        b4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                valorNum4();
            }
        });
        b5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                valorNum5();
            }
        });
        b6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                valorNum6();
            }
        });
        b7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                valorNum7();
            }
        });
        b8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                valorNum8();
            }
        });
        b9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                valorNum9();
            }
        });
        b0.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                valorNum0();
            }
        });
        bx.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                borrar();
            }
        });

        bEntrar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                entrar();
            }
        });

    }
    public void valorNum1()
    {
        if (num1==10)
        {
            num1=1;
            but1.setBackgroundColor(Color.RED);
            Toast.makeText(this,"Seleccionado 1B",Toast.LENGTH_LONG).show();
        }
        else if (num2==10)
        {
            num2=1;
            but2.setBackgroundColor(Color.RED);
            Toast.makeText(this,"Seleccionado 2B",Toast.LENGTH_LONG).show();
        }
        else if (num3==10)
        {
            num3=1;
            but3.setBackgroundColor(Color.RED);
            Toast.makeText(this,"Seleccionado 3B",Toast.LENGTH_LONG).show();
        }
        else if (num4==10)
        {
            num4=1;
            but4.setBackgroundColor(Color.RED);
            Toast.makeText(this,"Seleccionado 4B",Toast.LENGTH_LONG).show();
        }

    }
    public void valorNum2()
    {
        if (num1==10)
        {
            num1=2;
            but1.setBackgroundColor(Color.RED);
            Toast.makeText(this,"Seleccionado 1B",Toast.LENGTH_LONG).show();
        }
        else if (num2==10)
        {
            num2=2;
            but2.setBackgroundColor(Color.RED);
            Toast.makeText(this,"Seleccionado 2B",Toast.LENGTH_LONG).show();
        }
        else if (num3==10)
        {
            num3=2;
            but3.setBackgroundColor(Color.RED);
            Toast.makeText(this,"Seleccionado 3B",Toast.LENGTH_LONG).show();
        }
        else if (num4==10)
        {
            num4=2;
            but4.setBackgroundColor(Color.RED);
            Toast.makeText(this,"Seleccionado 4B",Toast.LENGTH_LONG).show();
        }
    }
    public void valorNum3()
    {
        if (num1==10)
        {
            num1=3;
            but1.setBackgroundColor(Color.RED);
            Toast.makeText(this,"Seleccionado 1B",Toast.LENGTH_LONG).show();
        }
        else if (num2==10)
        {
            num2=3;
            but2.setBackgroundColor(Color.RED);
            Toast.makeText(this,"Seleccionado 2B",Toast.LENGTH_LONG).show();
        }
        else if (num3==10)
        {
            num3=3;
            but3.setBackgroundColor(Color.RED);
            Toast.makeText(this,"Seleccionado 3B",Toast.LENGTH_LONG).show();
        }
        else if (num4==10)
        {
            num4=3;
            but4.setBackgroundColor(Color.RED);
            Toast.makeText(this,"Seleccionado 4B",Toast.LENGTH_LONG).show();
        }
    }
    public void valorNum4()
    {
        if (num1==10)
        {
            num1=4;
            but1.setBackgroundColor(Color.RED);
            Toast.makeText(this,"Seleccionado 1B",Toast.LENGTH_LONG).show();
        }
        else if (num2==10)
        {
            num2=4;
            but2.setBackgroundColor(Color.RED);
            Toast.makeText(this,"Seleccionado 2B",Toast.LENGTH_LONG).show();
        }
        else if (num3==10)
        {
            num3=4;
            but3.setBackgroundColor(Color.RED);
            Toast.makeText(this,"Seleccionado 3B",Toast.LENGTH_LONG).show();
        }
        else if (num4==10)
        {
            num4=4;
            but4.setBackgroundColor(Color.RED);
            Toast.makeText(this,"Seleccionado 4B",Toast.LENGTH_LONG).show();
        }
    }
    public void valorNum5()
    {
        if (num1==10)
        {
            num1=5;
            but1.setBackgroundColor(Color.RED);
            Toast.makeText(this,"Seleccionado 1B",Toast.LENGTH_LONG).show();
        }
        else if (num2==10)
        {
            num2=5;
            but2.setBackgroundColor(Color.RED);
            Toast.makeText(this,"Seleccionado 2B",Toast.LENGTH_LONG).show();
        }
        else if (num3==10)
        {
            num3=5;
            but3.setBackgroundColor(Color.RED);
            Toast.makeText(this,"Seleccionado 3B",Toast.LENGTH_LONG).show();
        }
        else if (num4==10)
        {
            num4=5;
            but4.setBackgroundColor(Color.RED);
            Toast.makeText(this,"Seleccionado 4B",Toast.LENGTH_LONG).show();
        }
    }
    public void valorNum6()
    {
        if (num1==10)
        {
            num1=6;
            but1.setBackgroundColor(Color.RED);
            Toast.makeText(this,"Seleccionado 1B",Toast.LENGTH_LONG).show();
        }
        else if (num2==10)
        {
            num2=6;
            but2.setBackgroundColor(Color.RED);
            Toast.makeText(this,"Seleccionado 2B",Toast.LENGTH_LONG).show();
        }
        else if (num3==10)
        {
            num3=6;
            but3.setBackgroundColor(Color.RED);
            Toast.makeText(this,"Seleccionado 3B",Toast.LENGTH_LONG).show();
        }
        else if (num4==10)
        {
            num4=6;
            but4.setBackgroundColor(Color.RED);
            Toast.makeText(this,"Seleccionado 4B",Toast.LENGTH_LONG).show();
        }
    }
    public void valorNum7()
    {
        if (num1==10)
        {
            num1=7;
            but1.setBackgroundColor(Color.RED);
            Toast.makeText(this,"Seleccionado 1B",Toast.LENGTH_LONG).show();
        }
        else if (num2==10)
        {
            num2=7;
            but2.setBackgroundColor(Color.RED);
            Toast.makeText(this,"Seleccionado 2B",Toast.LENGTH_LONG).show();
        }
        else if (num3==10)
        {
            num3=7;
            but3.setBackgroundColor(Color.RED);
            Toast.makeText(this,"Seleccionado 3B",Toast.LENGTH_LONG).show();
        }
        else if (num4==10)
        {
            num4=7;
            but4.setBackgroundColor(Color.RED);
            Toast.makeText(this,"Seleccionado 4B",Toast.LENGTH_LONG).show();
        }
    }
    public void valorNum8()
    {
        if (num1==10)
        {
            num1=8;
            but1.setBackgroundColor(Color.RED);
            Toast.makeText(this,"Seleccionado 1B",Toast.LENGTH_LONG).show();
        }
        else if (num2==10)
        {
            num2=8;
            but2.setBackgroundColor(Color.RED);
            Toast.makeText(this,"Seleccionado 2B",Toast.LENGTH_LONG).show();
        }
        else if (num3==10)
        {
            num3=8;
            but3.setBackgroundColor(Color.RED);
            Toast.makeText(this,"Seleccionado 3B",Toast.LENGTH_LONG).show();
        }
        else if (num4==10)
        {
            num4=8;
            but4.setBackgroundColor(Color.RED);
            Toast.makeText(this,"Seleccionado 4B",Toast.LENGTH_LONG).show();
        }
    }
    public void valorNum9()
    {
        if (num1==10)
        {
            num1=9;
            but1.setBackgroundColor(Color.RED);
            Toast.makeText(this,"Seleccionado 1B",Toast.LENGTH_LONG).show();
        }
        else if (num2==10)
        {
            num2=9;
            but2.setBackgroundColor(Color.RED);
            Toast.makeText(this,"Seleccionado 2B",Toast.LENGTH_LONG).show();
        }
        else if (num3==10)
        {
            num3=9;
            but3.setBackgroundColor(Color.RED);
            Toast.makeText(this,"Seleccionado 3B",Toast.LENGTH_LONG).show();
        }
        else if (num4==10)
        {
            num4=9;
            but4.setBackgroundColor(Color.RED);
            Toast.makeText(this,"Seleccionado 4B",Toast.LENGTH_LONG).show();
        }
    }
    public void valorNum0()
    {
        if (num1==10)
        {
            num1=0;
            but1.setBackgroundColor(Color.RED);
            Toast.makeText(this,"Seleccionado 1B",Toast.LENGTH_LONG).show();
        }
        else if (num2==10)
        {
            num2=0;
            but2.setBackgroundColor(Color.RED);
            Toast.makeText(this,"Seleccionado 2B",Toast.LENGTH_LONG).show();
        }
        else if (num3==10)
        {
            num3=0;
            but3.setBackgroundColor(Color.RED);
            Toast.makeText(this,"Seleccionado 3B",Toast.LENGTH_LONG).show();
        }
        else if (num4==10)
        {
            num4=0;
            but4.setBackgroundColor(Color.RED);
            Toast.makeText(this,"Seleccionado 4B",Toast.LENGTH_LONG).show();
        }
    }
    public void borrar()
    {
        if (num4!=10)
        {
            but4.setBackgroundColor(Color.TRANSPARENT);
            num4=10;
        }
        else if (num3!=10)
        {
            but3.setBackgroundColor(Color.TRANSPARENT);
            num3=10;
        }
        else if (num2!=10)
        {
            but2.setBackgroundColor(Color.TRANSPARENT);
            num2=10;
        }
        else if (num1!=10)
        {
            but1.setBackgroundColor(Color.TRANSPARENT);
            num1=10;
        }
    }
    public void entrar()
    {
        if (num1==5&&num2==7&&num3==2&& num4==4)
        {
            Intent i=new Intent(this,MenuPrincipal.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
            Toast.makeText(this,"num1 "+Integer.toString(num1),Toast.LENGTH_LONG).show();
            Toast.makeText(this,"num2 "+Integer.toString(num2),Toast.LENGTH_LONG).show();
            Toast.makeText(this,"num3 "+Integer.toString(num3),Toast.LENGTH_LONG).show();
            Toast.makeText(this,"num4 "+Integer.toString(num4),Toast.LENGTH_LONG).show();
            finish();
        }else
        {

            Toast.makeText(this,"num1 "+Integer.toString(num1),Toast.LENGTH_LONG).show();
            Toast.makeText(this,"num2 "+Integer.toString(num2),Toast.LENGTH_LONG).show();
            Toast.makeText(this,"num3 "+Integer.toString(num3),Toast.LENGTH_LONG).show();
            Toast.makeText(this,"num4 "+Integer.toString(num4),Toast.LENGTH_LONG).show();

        }
    }

}