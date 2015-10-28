package licethovalles.administrador.mijuego;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.parse.Parse;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.ArrayList;


public class historial extends ActionBarActivity {
    private Button button;
    private TextView ed,ed2;
    String puntajes;
    int game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial);
        button=(Button) findViewById(R.id.button);

        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "FP8uwfPaXpsJPEFqLIGCRWRjvgjsdaRuDsQT8Pa0", "AeQTDAfrC1E76p5XUe6DHdfxbU0lmoFD9juLgOHU");
        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                historial.this.startActivity(new Intent(historial.this, MainActivity2Activity.class));

            }
        });



        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
         game = sharedPref.getInt("PUNTAJES", 0);
        int puntaje=sharedPref.getInt("MAYORPTJ", 0);
        //puntajes=puntajes+sharedPref.getString("PUNTAJES2", Integer.toString(puntaje));
        ed = (TextView) findViewById(R.id.textView2);
        ed.setText("No juegos Ganados "+game);

        ed2=(TextView) findViewById(R.id.textView4);
        ed2.setText("Mayor Puntaje " + puntaje);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_historial, menu);
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



    private class SendData extends AsyncTask<Void, Void, Void> {



        public SendData ()
        {
            super();

        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }


        @Override
        protected Void doInBackground(Void... arg0) {
            // Creating service handler class instance
            ParseObject testObject = new ParseObject("DataEntry");
            testObject.put("Puntajes",game);
           // testObject.put("Mayor puntaje",);
            testObject.saveInBackground();
            return null;
        }


        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);
            // Dismiss the progress dialog


            //new GetData().execute();
        }

    }


    private class GetData extends AsyncTask<Void, Void, Void> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();

        }

        @Override
        protected Void doInBackground(Void... params) {
            // Create the array


            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            // Locate the listview in listview_main.xml
            // Pass the results into ListViewAdapter.java




        }
    }
}
