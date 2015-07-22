package ubs.project0;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private Button button_spotify;
    private Button button_scores;
    private Button button_library;
    private Button button_bigger;
    private Button button_xyz;
    private Button button_capstone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_spotify = (Button) findViewById(R.id.button_spotify);
        button_spotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch Spotify Streamer", Toast.LENGTH_SHORT).show();
            }
        });

        button_scores = (Button) findViewById(R.id.button_scores);
        button_scores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch Scores App", Toast.LENGTH_SHORT).show();
            }
        });

        button_library = (Button) findViewById(R.id.button_library);
        button_library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch Library App", Toast.LENGTH_SHORT).show();
            }
        });

        button_bigger = (Button) findViewById(R.id.button_bigger);
        button_bigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch Build It Bigger", Toast.LENGTH_SHORT).show();
            }
        });

        button_xyz = (Button) findViewById(R.id.button_xyz);
        button_xyz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch XYZ Reader", Toast.LENGTH_SHORT).show();
            }
        });

        button_capstone = (Button) findViewById(R.id.button_capstone);
        button_capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch Capstone: My Own App", Toast.LENGTH_SHORT).show();
            }
        });



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
