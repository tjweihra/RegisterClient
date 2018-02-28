package com.example.trevor.menu;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Menu extends AppCompatActivity {
Button b1;
Button b2;
Button b3;
Button b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                AlertDialog alertDialog = new AlertDialog.Builder(Menu.this).create();
                alertDialog.setTitle("Functionality Not Available");
                alertDialog.setMessage("This functionality has not yet been implemented");
                alertDialog.setIcon(R.drawable.abc_btn_check_to_on_mtrl_015);
                alertDialog.setButton("Ok",new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which){
                       //Toast.makeText(getApplicationContext(),"You clicked Ok", Toast.LENGTH_LONG).show();
                    }
                });
                alertDialog.show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                AlertDialog alertDialog = new AlertDialog.Builder(Menu.this).create();
                alertDialog.setTitle("Functionality Not Available");
                alertDialog.setMessage("This functionality has not yet been implemented");
                alertDialog.setIcon(R.drawable.abc_btn_check_to_on_mtrl_015);
                alertDialog.setButton("Ok",new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which){
                        //Toast.makeText(getApplicationContext(),"You clicked Ok", Toast.LENGTH_LONG).show();
                    }
                });
                alertDialog.show();
            }
        });
        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                AlertDialog alertDialog = new AlertDialog.Builder(Menu.this).create();
                alertDialog.setTitle("Functionality Not Available");
                alertDialog.setMessage("This functionality has not yet been implemented");
                alertDialog.setIcon(R.drawable.abc_btn_check_to_on_mtrl_015);
                alertDialog.setButton("Ok",new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which){
                       // Toast.makeText(getApplicationContext(),"You clicked Ok", Toast.LENGTH_LONG).show();
                    }
                });
                alertDialog.show();
            }
        });
        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                AlertDialog alertDialog = new AlertDialog.Builder(Menu.this).create();
                alertDialog.setTitle("Functionality Not Available");
                alertDialog.setMessage("This functionality has not yet been implemented");
                alertDialog.setIcon(R.drawable.abc_btn_check_to_on_mtrl_015);
                alertDialog.setButton("Ok",new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which){
                       // Toast.makeText(getApplicationContext(),"You clicked Ok", Toast.LENGTH_LONG).show();
                    }
                });
                alertDialog.show();
            }
        });
    }





/*
    public void onBtnClicked(View v){
        if(v.getId() == R.id.button || v.getId()==R.id.button2|| v.getId()==R.id.button3|| v.getId()==R.id.button4) {
            MessageBox();
        }
    }

    private void MessageBox() {
        //Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
        new AlertDialog.Builder(this)
                .setMessage("Hello")
                .setPositiveButton("Ok",null)
                .show();
    }
    public static void dialog() {
        new AlertDialog.Builder(this)
                .setMessage("Hello Baby")
                .setPositiveButton("Ok",null)
                .show();
    }
*/
}
