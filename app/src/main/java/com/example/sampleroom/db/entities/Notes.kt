package com.example.sampleroom.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes_table")
data class Notes(var title:String,var body:String) {
    @PrimaryKey(autoGenerate = true)
    var pk:Int=0
}