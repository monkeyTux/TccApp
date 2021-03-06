package br.com.etecfran.blackeyes.tcc;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class BoasVindas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boas_vindas);

        Button btnPular = (Button) findViewById(R.id.btnPular);
        Button btnAvancar = (Button) findViewById(R.id.btnAvancar);



        btnPular.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){


                startActivity(new Intent(BoasVindas.this, MainActivity.class));
            }


        });

        btnAvancar.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                startActivity(new Intent(BoasVindas.this, CadastroObjeto.class));
            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_boas_vindas, menu);
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
