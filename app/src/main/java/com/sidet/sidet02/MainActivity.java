package com.sidet.sidet02;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.sidet.sidet02.BE.PersonaBE;
import com.sidet.sidet02.BE.PersonaNaturalBE;


public class MainActivity extends Activity {
    private EditText txtUserName,txtPassword;
    private Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Asociacion OBJECT Java con Objetos XML

        txtUserName = (EditText) findViewById(R.id.txtUserName);
        txtPassword = (EditText) findViewById(R.id.txtPassword);
        btnLogin    = (Button) findViewById(R.id.btnLogin);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),txtUserName.getText().toString(),Toast.LENGTH_SHORT).show();
            // txtUserName.getText();
                // txtPassword.getText();
                return;
            }
        });

        /*String x = "";
        PersonaBE Usuario= new PersonaBE();
        PersonaBE Usuario2 = new PersonaBE("Grover","Trujillo","Benites",20);

        PersonaNaturalBE Usuario3 = new PersonaNaturalBE();
        PersonaNaturalBE Usuario4 = new PersonaNaturalBE("Grover J.","Trujillo","Benites",20,"AV. Sin Nombre","2047012346");

        Log.i("SIDET:",Usuario4.getNombreCompleto());*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
