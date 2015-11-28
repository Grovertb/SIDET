package pe.edu.sidet.sidet;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import pe.edu.sidet.sidet.ADT.PaisesAdapter;
import pe.edu.sidet.sidet.BE.PaisBE;


public class lista2Activity extends ActionBarActivity {
    private ListView lst2;
    ArrayList<PaisBE> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista2);

        lst2 = (ListView) findViewById(R.id.listapaises);
        items = new ArrayList<PaisBE>();
        items.add(new PaisBE("PERU",R.drawable.peru));
        items.add(new PaisBE("VENEZUELA",R.drawable.venezuela));
        items.add(new PaisBE("ECUADOR",R.drawable.ecuador));
        lst2.setAdapter(new PaisesAdapter(getApplicationContext(),0,items));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_lista2, menu);
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
