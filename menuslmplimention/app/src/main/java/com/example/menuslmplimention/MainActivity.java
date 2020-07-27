package com.example.menuslmplimention;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final int GALLERY_REQUEST_CODE = 33;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.share:
                Intent intent1 = new Intent(android.content.Intent.ACTION_SEND);
                intent1.setType("text/plain");
                intent1.putExtra(android.content.Intent.EXTRA_TEXT, "TEXT");
                startActivity(intent1);
                break;
            case R.id.dail:
                Intent intent = new Intent(Intent.ACTION_DIAL);
                startActivity(intent);
                break;
            case R.id.gallery:
                Intent i = new Intent();
                i.setType("image/*");
                i.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(i, GALLERY_REQUEST_CODE);
                break;

        }
        return super.onOptionsItemSelected(item);
    }


}