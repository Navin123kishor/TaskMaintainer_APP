package com.example.keepnotes

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import java.util.concurrent.Flow

class NoteRepository(private val notesDao: NotesDao) {

    val allNotes: LiveData<List<Note>> = notesDao.getAllNotes()

    // insert method for adding the note to our database.
    suspend fun insert(note: Note) {
        notesDao.insert(note)
    }

    //  delete method for deleting our note from database.
    suspend fun delete(note: Note){
        notesDao.delete(note)
    }

    //  update method for updating our note from database.
    suspend fun update(note: Note){
        notesDao.update(note)
    }
}
