package com.google.firebase.quickstart.database;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.quickstart.database.java.SignInActivity;

public class ProfielActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profiel);


    }
    public void saveData(View view){
        EditText profiel_naam = (EditText) findViewById(R.id.profiel_naam);
        EditText profiel_email = (EditText) findViewById(R.id.profiel_email);
        EditText profiel_wachtwoord = (EditText) findViewById(R.id.profiel_wachtwoord);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int i = item.getItemId();
        if (i == R.id.action_logout) {
            FirebaseAuth.getInstance().signOut();
            startActivity(new Intent(this, SignInActivity.class));
            finish();
            return true;
        } else if(i == R.id.action_profiel ){
            startActivity(new Intent(this, ProfielActivity.class));
            return true;
        }else{
            return super.onOptionsItemSelected(item);
        }
    }
}
