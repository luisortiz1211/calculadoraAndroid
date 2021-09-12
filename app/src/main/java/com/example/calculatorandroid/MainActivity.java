package com.example.calculatorandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView Screen;
    private Button AC,Power,Back,Div,Mul,Add,Min,Ans,Equal,
            Sin,Cos,Tan,Log,Point,Sqrt,
            One,Two,Three,
            Four,Five,Six,
            Seven,Eight,Nine,Zero;
    private String input,Answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Screen=findViewById(R.id.screen);
        AC=findViewById(R.id.ac);
        Power=findViewById(R.id.power);
        Back=findViewById(R.id.back);
        Div=findViewById(R.id.div);
        Mul=findViewById(R.id.mul);
        Add=findViewById(R.id.add);
        Min=findViewById(R.id.min);
        Point=findViewById(R.id.point);
        Sqrt=findViewById(R.id.sqrt);
        Ans=findViewById(R.id.ans);
        Equal=findViewById(R.id.equal);
        Sin=findViewById(R.id.sin);
        Cos=findViewById(R.id.cos);
        Tan=findViewById(R.id.tan);
        Log=findViewById(R.id.log);
        One=findViewById(R.id.one);
        Two=findViewById(R.id.two);
        Three=findViewById(R.id.three);
        Four=findViewById(R.id.four);
        Five=findViewById(R.id.five);
        Six=findViewById(R.id.six);
        Seven=findViewById(R.id.seven);
        Eight=findViewById(R.id.eight);
        Nine=findViewById(R.id.nine);
        Zero=findViewById(R.id.zero);
    }
    public void ButtonCLick(View view){
        Button button=(Button) view;
        String data=button.getText().toString();
        switch(data){
            case"AC":
                Solve();
                input="";
                break;
            case"Ans":
                Solve();
                input+=Answer;
                break;
            case"X":
                Solve();
                input+="*";
                break;
            case"^":
                Solve();
                input+="^";
                break;
            case"=":
                Solve();
                Answer=input;
                break;
            case"←":
                String newTex=input.substring(0, input.length()-1);
                input=newTex;
                break;
            case"Sin":
                sinSolve();
                break;
            case"Cos":
                cosSolve();
                break;
            case"Tan":
                tanSolve();
                break;
            case"Log":
                fLog();
                break;
            case"Sqrt":
                fSqrt();
                break;
            case"GR":
                fgrades();
                break;
            case"RD":
                fradians();
                break;
            case"e":
                feuler();
                break;
            case"Rn":
                fRound();
                break;
            case"¶":
                fPi();
                break;

            default:
                if(input==null){
                    input="";
                }
                if(data.equals("+")||data.equals("-")||data.equals("/")){
                    Solve();
                }
                input+=data;
        }
        Screen.setText(input);
    }
    private void sinSolve(){
        if(input.split("Sin").length==1){
            String number[]=input.split("Sin");
            try{
                double sin=Math.sin(Double.parseDouble(number[0]));
                input =sin+"";
            }catch(Exception e){

            }
        }
    }
    private void fradians(){
        if(input.split("RD").length==1){
            String number[]=input.split("RD");
            try{
                double rad=Math.toRadians(Double.parseDouble(number[0]));
                input =rad+"";
            }catch(Exception e){
            }
        }
    }
    private void cosSolve(){
        if(input.split("Cos").length==1){
            String number[]=input.split("Cos");
            try{
                double cos=Math.cos(Double.parseDouble(number[0]));
                input =cos+"";
            }catch(Exception e){
            }
        }
    }
    private void fgrades(){
        if(input.split("GR").length==1){
            String number[]=input.split("GR");
            try{
                double deg=Math.toDegrees(Double.parseDouble(number[0]));
                input =deg+"";
            }catch(Exception e){
            }
        }
    }
    private void tanSolve(){
        if(input.split("Tan").length==1){
            String number[]=input.split("Tan");
            try{
                double tan=Math.tan(Double.parseDouble(number[0]));
                input =tan+"";
            }catch(Exception e){
            }
        }
    }
    private void feuler(){
        if(input.split("e").length==1){
            String number[]=input.split("e");
            try{
                double eul=Math.E;
                input =eul+"";
            }catch(Exception e){
            }
        }
    }
    private void fLog(){
        if(input.split("Log").length==1){
            String number[]=input.split("Log");
            try{
                double log=Math.log(Double.parseDouble(number[0]));
                input =log+"";
            }catch(Exception e){
            }
        }
    }
    private void fRound(){
        if(input.split("Ln").length==1){
            String number[]=input.split("Ln");
            try{
                double log=Math.round(Double.parseDouble(number[0]));
                input =log+"";
            }catch(Exception e){
            }
        }
    }

    private void fSqrt(){
        if(input.split("Sqrt").length==1){
            String number[]=input.split("Sqrt");
            try{
                double sqrt=Math.sqrt(Double.parseDouble(number[0]));
                input =sqrt+"";
            }catch(Exception e){
            }
        }
    }
    private void fPi(){
        if(input.split("\\¶").length==1){
            String number[]=input.split("\\¶");
            try{
                double pi=Math.PI;
                input =pi+"";
            }catch(Exception e){
            }
        }
    }
    private void Solve(){
        if(input.split("\\*").length==2){
            String number[]=input.split("\\*");
            try{
            double mul=Double.parseDouble(number[0])*Double.parseDouble(number[1]);
            input=mul+"";
            }catch(Exception e){

            }
        }else if(input.split("/").length==2){
            String number[]=input.split("/");
            try{
                double div=Double.parseDouble(number[0])*Double.parseDouble(number[1]);
                input =div+"";
            }catch(Exception e){

            }
        }else if(input.split("\\^").length==2){
            String number[]=input.split("\\^");
            try{
                double pow=Math.pow(Double.parseDouble(number[0]),Double.parseDouble(number[1]));
                input=pow+"";
            }catch(Exception e){
            }
        }else if(input.split("\\+").length==2){
            String number[]=input.split("\\+");
            try{
                double sum=Double.parseDouble(number[0])+Double.parseDouble(number[1]);
                input=sum+"";
            }catch(Exception e){
            }
        }else if(input.split("-").length==2){
            String number[]=input.split("-");
            if(number[0]==""&&number.length==2){
                number[0]= 0+"";
            }
            try{
                double sub=0;
                if(number.length==2){
                sub=Double.parseDouble(number[0])-Double.parseDouble(number[1]);
                }else if(number.length==3){
                    sub=Double.parseDouble(number[1])-Double.parseDouble(number[2]);
                }
                input=sub+"";
            }catch(Exception e){

            }
        }
        String n[]=input.split("\\.");
        if(n.length>1){
            if(n[1].equals("0")){
                input=n[0];
            }
        }

        Screen.setText(input);

    }
}