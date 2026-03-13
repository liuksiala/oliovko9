package com.example.notesapp;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button addNoteButton = findViewById(R.id.AddNoteActivityButton);
        Button listNotesButton = findViewById(R.id.ListNotesActivityButton);



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    // move to AddNoteActivity
    public void moveToAddNote (View view){
        Intent intent = new Intent(MainActivity.this, AddNoteActivity.class);
        startActivity(intent);
    }
    // move to ListNotesActivity
    public void moveToListNotes (View view){
        Intent intent = new Intent(MainActivity.this, ListNotesActivity.class);
        startActivity(intent);
    }

}