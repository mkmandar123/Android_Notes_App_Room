package com.example.sampleroom.viewmodels

import androidx.lifecycle.ViewModel
import com.example.sampleroom.repository.NotesRepository

class MainViewModel constructor(val notesRepository: NotesRepository):ViewModel() {
}