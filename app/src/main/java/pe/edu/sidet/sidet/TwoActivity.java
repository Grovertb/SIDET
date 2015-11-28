package pe.edu.sidet.sidet;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class TwoActivity extends ActionBarActivity {
    private TextView lbl1;
    private Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        lbl1 = (TextView) findViewById(R.id.txtvista);
        String cadena = getIntent().getExtras().getString("variable");
        String nombre = getIntent().getExtras().getString("nombre");

        lbl1.setText(cadena);

        Toast.makeText(getApplicationContext(),nombre,Toast.LENGTH_SHORT).show();

        btn1 = (Button) findViewById(R.id.btnLLamar);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent y = new Intent(Intent.ACTION_CALL);
                y.setData(Uri.parse("tel:989081963"));
                startActivity(y);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_two, menu);
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
