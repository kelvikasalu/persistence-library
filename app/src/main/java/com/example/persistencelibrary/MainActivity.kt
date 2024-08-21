package com.example.persistencelibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Dao

import androidx.room.Insert

import androidx.room.Query

import android.content.Context

import androidx.room.Room
class MainActivity : AppCompatActivity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Initialize the database in your activity's onCreate or relevant entry point
        DatabaseInitializer.init(getApplicationContext());

// Get a reference to the DAO
        YourEntityDao dao = DatabaseInitializer.getDatabase().yourEntityDao();

// Example: Insert data
        YourEntity entity = new YourEntity();
        entity.name = "John Doe";
        dao.insert(entity);

// Example: Query data
        List<YourEntity> entities = dao.getAllEntities();
// Do something with the retrieved entities

    }
}