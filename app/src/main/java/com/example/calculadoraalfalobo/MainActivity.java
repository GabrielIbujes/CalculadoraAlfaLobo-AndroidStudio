package com.example.calculadoraalfalobo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    double n1, n2, res;
    String Operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void cero(View view){
        textView=(TextView) findViewById(R.id.textView);
        textView.setText(textView.getText()+"0");
    }

    public void uno(View view){
        textView=(TextView) findViewById(R.id.textView);
        textView.setText(textView.getText()+"1");
    }

    public void dos(View view){
        textView=(TextView) findViewById(R.id.textView);
        textView.setText(textView.getText()+"2");
    }
    public void tres(View view){
        textView=(TextView) findViewById(R.id.textView);
        textView.setText(textView.getText()+"3");
    }
    public void cuatro(View view){
        textView=(TextView) findViewById(R.id.textView);
        textView.setText(textView.getText()+"4");
    }
    public void cinco(View view){
        textView=(TextView) findViewById(R.id.textView);
        textView.setText(textView.getText()+"5");
    }
    public void seis(View view){
        textView=(TextView) findViewById(R.id.textView);
        textView.setText(textView.getText()+"6");
    }

    public void siete(View view){
        textView=(TextView) findViewById(R.id.textView);
        textView.setText(textView.getText()+"7");
    }

    public void ocho(View view){
        textView=(TextView) findViewById(R.id.textView);
        textView.setText(textView.getText()+"8");
    }

    public void nueve(View view){
        textView=(TextView) findViewById(R.id.textView);
        textView.setText(textView.getText()+"9");
    }
    public void punto(View view){
        textView=(TextView) findViewById(R.id.textView);
        textView.setText(textView.getText()+".");
    }

    public void OnclickOperacionCapturaNumero1(View view){
        textView=(TextView) findViewById(R.id.textView);
        n1=Double.parseDouble(textView.getText().toString());
        textView.setText(" ");
    }

    public void sumar(View view){
        Operador="+";
        OnclickOperacionCapturaNumero1(view);
    }

    public void restar(View view){
        Operador="-";
        OnclickOperacionCapturaNumero1(view);
    }

    public void multiplicar(View view){
        Operador="*";
        OnclickOperacionCapturaNumero1(view);
    }

    public void dividir(View view){
        Operador="/";
        OnclickOperacionCapturaNumero1(view);
    }
    public void igual(View view){
        textView=(TextView)findViewById(R.id.textView);
        n2=Double.parseDouble(textView.getText().toString());
        if (Operador.equals("+")){
            res=n1+n2;
        }
        else if (Operador.equals("-")){
            res=n1-n2;
        }else if (Operador.equals("*")){
            res=n1*n2;
        }

        textView.setText(" "+res);
    }

    public void rnd(View view){
        for (int x=0; x<=100;x++){
            int na=(int)Math.floor(Math.random()*(100-(1+1))+(1));
            textView.setText(String.valueOf(na));
        }
    }


    public void sen(View view){
        textView=(TextView)findViewById(R.id.textView);
        try {
            n1=Double.parseDouble(textView.getText().toString().toString());
            double rd=Math.toRadians(n1);
            res=Math.sin(rd);
            textView.setText(String.valueOf(res));
        } catch (NumberFormatException nfe){}

    }

    public void cos(View view){
        textView=(TextView)findViewById(R.id.textView);
        try {
            n1=Double.parseDouble(textView.getText().toString().toString());
            double rd=Math.toRadians(n1);
            res=Math.cos(rd);
            textView.setText(String.valueOf(res));
        } catch (NumberFormatException nfe){}
    }

    public void tan(View view){
        textView=(TextView)findViewById(R.id.textView);
        try {
            n1=Double.parseDouble(textView.getText().toString().toString());
            double rd=Math.toRadians(n1);
            res=Math.tan(rd);
            textView.setText(String.valueOf(res));
        } catch (NumberFormatException nfe){}
    }

    public void del(View view){
        if (textView.getText().toString().equals(" ")){
            textView.setText(textView.getText().subSequence(0,textView.getText().length()-1)+" ");
        }
    }

    public  void ac(View view){
        n1=0.0;
        n2=0.0;
        textView=(TextView)findViewById(R.id.textView);
        textView.setText(" ");
    }

    public void close (View view){
        finish();
    }

}