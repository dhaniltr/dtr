package com.dtr.www.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.button_sportify_streamer:
                viewToast("sportify streamer!");
                break;
            case R.id.button_scores_app:
                viewToast("scores app!");
                break;
            case R.id.button_library_app:
                viewToast("library app!");
                break;
            case R.id.button_build_it_bigger:
                viewToast("build it bigger app!");
                break;
            case R.id.button_xyz_reader:
                viewToast("xyz reader app!");
                break;
            case R.id.button_capstone_myownapp:
                viewToast("capstone app!");
                break;
        }
    }

    public void viewToast(String message){

        String toastMessage = "This button will launch my "+message;
        Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT).show();
    }

}
