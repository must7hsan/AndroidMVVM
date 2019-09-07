package com.mjb.android.mvvm.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
        entities = [Photo::class],
        version = 1,
        exportSchema = false
)

abstract class MvvmDatabase : RoomDatabase() {
        abstract fun photosDao(): PhotosDao
}
