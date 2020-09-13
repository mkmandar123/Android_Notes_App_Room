package com.example.sampleroom.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.sampleroom.db.dao.NotesDao
import com.example.sampleroom.db.entities.Notes

@Database(entities = [Notes::class],version = 1,exportSchema = false)
abstract class AppDb:RoomDatabase() {
    abstract val getNotesDao:NotesDao
}