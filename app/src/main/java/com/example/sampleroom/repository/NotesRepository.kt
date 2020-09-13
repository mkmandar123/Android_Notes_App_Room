package com.example.sampleroom.repository

import com.example.sampleroom.db.dao.NotesDao
import javax.inject.Inject

class NotesRepository
@Inject constructor( var notesDao: NotesDao) {

    suspend fun getAllNotes()=notesDao.getAllNotes()
}