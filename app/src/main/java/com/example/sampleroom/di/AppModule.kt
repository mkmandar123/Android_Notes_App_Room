package com.example.sampleroom.di

import android.content.Context
import androidx.room.Room
import com.example.sampleroom.db.AppDb
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

@Provides
@Singleton
fun getDatabaseInstance(@ApplicationContext context: Context)=Room.databaseBuilder(context,AppDb::class.java,"notes_db").build()

@Provides
@Singleton
fun getNotesDao(db:AppDb)=db.getNotesDao


}