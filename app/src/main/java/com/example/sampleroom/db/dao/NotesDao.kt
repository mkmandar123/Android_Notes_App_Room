package com.example.sampleroom.db.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.sampleroom.db.entities.Notes

@Dao
interface NotesDao {

    @Query("SELECT * FROM notes_table")
    suspend fun getAllNotes():List<Notes>
}