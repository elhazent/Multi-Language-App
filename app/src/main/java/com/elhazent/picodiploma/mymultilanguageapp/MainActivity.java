package com.elhazent.picodiploma.mymultilanguageapp;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView hello, plural, xliff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hello = findViewById(R.id.tv_hello);
        plural = findViewById(R.id.tv_plural);
        xliff = findViewById(R.id.tv_xliff);

        int pokeCount = 3;
        String sthello = String.format(getResources().getString(R.string.hello_world),"Elhazent Media", pokeCount, "Elhazent Travel");

        hello.setText(sthello);
        int songCount = 5;
        String stPlural = getResources().getQuantityString(R.plurals.numberOfSongsAvailable,songCount,songCount);
        plural.setText(stPlural);
        xliff.setText(getResources().getString(R.string.app_homeurl));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_change_settings){
            Intent intent = new Intent(Settings.ACTION_LOCALE_SETTINGS);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
