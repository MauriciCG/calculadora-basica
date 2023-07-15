package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button uno, dos, tres,cuatro, cinco,seis,siete,ocho, nueve,cero,suma,resta,multi,division,alcuadrado,punto,igual,borrar,clean;
    TextView operacion;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cero= findViewById(R.id.id_0);
        uno= findViewById(R.id.id_1);
        dos= findViewById(R.id.id_2);
        tres= findViewById(R.id.id_3);
        cuatro= findViewById(R.id.id_4);
        cinco= findViewById(R.id.id_5);
        seis= findViewById(R.id.id_6);
        siete= findViewById(R.id.id_7);
        ocho= findViewById(R.id.id_8);
        nueve= findViewById(R.id.id_9);
        suma= findViewById(R.id.id_suma);
        resta= findViewById(R.id.id_resta);
        multi= findViewById(R.id.id_por);
        division= findViewById(R.id.id_div);
        alcuadrado= findViewById(R.id.id_cuadrado);
        punto= findViewById(R.id.id_punto);
        borrar= findViewById(R.id.id_borrar);
        igual= findViewById(R.id.id_igual);
        clean = findViewById(R.id.limpiar);

        operacion = findViewById(R.id.operacion);


        clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Limpiar();
            }
        });
        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selecciona();
            }
        });
        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selecciona1();
            }
        }); dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selecciona2();
            }
        }); tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selecciona3();
            }
        }); cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selecciona4();
            }
        }); cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selecciona5();
            }
        }); seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selecciona6();
            }
        }); siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selecciona7();
            }
        }); ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selecciona8();
            }
        }); nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selecciona9();
            }
        });
        borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                borrar();
            }
        });
        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sum();
            }
        });
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res();
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mult();
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                div();
            }
        });
        alcuadrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alCuadrado();
            }
        });
        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                igual();
            }
        });
        punto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                punto();
            }
        });
    }
    String operador="";
    Float numero_1=0.0f;
    Float numero_2=0.0f;
    public void Limpiar(){
       if(operacion.equals(0)){
           operacion.setText("borrado");

       }else{
           operacion.setText("0");
       }
    }
    public void borrar(){
        if(operacion.getText().toString().equals("0") || operacion.getText().toString().equals("")){
            operacion.setText("0");
        }else {
            String text = operacion.getText().toString();
                operacion.setText(text.substring(0, text.length() - 1));
                if(operacion.getText().toString().equals("")){
                    operacion.setText("0");
                }
        }
    }

    public void selecciona(){
        if(operacion.getText().toString().equals("0")){
            operacion.setText("0");
        }else{
            operacion.setText(operacion.getText()+"0");
        }
    }
    public void selecciona1(){
        if(operacion.getText().toString().equals("0")){
            operacion.setText("1");
        }else{
            operacion.setText(operacion.getText()+"1");
        }
    }
    public void selecciona2(){
        if(operacion.getText().toString().equals("0")){
            operacion.setText("2");
        }else{
            operacion.setText(operacion.getText()+"2");
        }
    }public void selecciona3(){
        if(operacion.getText().toString().equals("0")){
            operacion.setText("3");
        }else{
            operacion.setText(operacion.getText()+"3");
        }
    }public void selecciona4(){
        if(operacion.getText().toString().equals("0")){
            operacion.setText("4");
        }else{
            operacion.setText(operacion.getText()+"4");
        }
    }public void selecciona5(){
        if(operacion.getText().toString().equals("0")){
            operacion.setText("5");
        }else{
            operacion.setText(operacion.getText()+"5");
        }
    }public void selecciona6(){
        if(operacion.getText().toString().equals("0")){
            operacion.setText("6");
        }else{
            operacion.setText(operacion.getText()+"6");
        }
    }public void selecciona7(){
        if(operacion.getText().toString().equals("0")){
            operacion.setText("7");
        }else{
            operacion.setText(operacion.getText()+"7");
        }
    }public void selecciona8(){
        if(operacion.getText().toString().equals("0")){
            operacion.setText("8");
        }else{
            operacion.setText(operacion.getText()+"8");
        }
    }public void selecciona9(){
        if(operacion.getText().toString().equals("0")){
            operacion.setText("9");
        }else{
            operacion.setText(operacion.getText()+"9");
        }
    }
    public void punto(){
        if(operacion.getText().toString().equals("0")){
            operacion.setText(".");
        }else{
            operacion.setText(operacion.getText()+".");
        }
    }
    public void sum(){
        operador="+";
        guardar_num1();
    }
    public void res(){
        operador="-";
        guardar_num1();
    }
    public void mult(){
        operador="x";
        guardar_num1();
    }
    public void div(){
        operador="/";
        guardar_num1();
    }
    public void alCuadrado(){
        Float nume= Float.parseFloat(operacion.getText().toString());
        Float res=nume*nume;
        operacion.setText(""+res+"");

    }
    public void guardar_num1(){
        numero_1=Float.parseFloat(operacion.getText().toString());
        operacion.setText("0");
    }

    public void igual(){
        numero_2=Float.parseFloat(operacion.getText().toString());

        switch (operador){
            case "+":
                float resSum=numero_1+numero_2;
                operacion.setText(""+resSum+"");
                break;
            case "-":
                float resRes=numero_1-numero_2;
                operacion.setText(""+resRes+"");
                break;
            case "x":
                float resMult=numero_1*numero_2;
                operacion.setText(""+resMult+"");
                break;
            case "/":
                float resDiv=numero_1/numero_2;
                operacion.setText(""+resDiv+"");
                break;
        }
    }
}