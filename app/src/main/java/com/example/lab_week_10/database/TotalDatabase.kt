package com.example.lab_week_10.database

import androidx.room.Database
import androidx.room.RoomDatabase

// Create a database with the @Database annotation
// entities: which entities the database relies on
// version: schema version, update this when schema changes
@Database(entities = [Total::class], version = 1)
abstract class TotalDatabase : RoomDatabase() {

    // Declare the Dao
    abstract fun totalDao(): TotalDao
    // You can declare another Dao here for other Entities
}
