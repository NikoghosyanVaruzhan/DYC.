package com.example.dyc;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class AboutActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        bottomNavigationView=findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.page_4);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                if(menuItem.getItemId()==R.id.page_2){
                    Intent intent=new Intent(AboutActivity.this, MapActivity.class);
                    startActivity(intent);
                }
                if(menuItem.getItemId()==R.id.page_3){
                    Intent intent=new Intent(AboutActivity.this, ProfileActivity.class);
                    startActivity(intent);
                }
                if(menuItem.getItemId()==R.id.page_1){
                    Intent intent=new Intent(AboutActivity.this, ListActivity.class);
                    startActivity(intent);
                }
                return false;
            }
        });
    }
}