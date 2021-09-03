package com.juanje1.feedmemvvm.model.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.juanje1.feedmemvvm.model.Post
import com.juanje1.feedmemvvm.model.PostDao

@Database(entities = [Post::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun postDao(): PostDao
}