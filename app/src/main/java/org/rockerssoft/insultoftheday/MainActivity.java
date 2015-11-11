package org.rockerssoft.insultoftheday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Random rand = new Random();
    private String[] insults = {
        "\"Your birth certificate is an apology letter from the condom company.\"",
        "\"I bet your brain feels as good as new, as you've never used it.\"",
        "\"You're so ugly, whn your mom dropped you off at school she got a fine for littering.\"",
        "\"Roses are red, violets are blue, I have 5 fingers, the third ones for you.\""
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView insult = (TextView)findViewById(R.id.tvInsult);
        int i = rand.nextInt(insults.length);

        insult.setText(insults[i]);
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
