package com.urahimli.cleanarchitecturenoteapp.feature_note.domain.repository

import com.urahimli.cleanarchitecturenoteapp.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow
                                //burada fake kimi yaradiriq repository'ni, bundan yardimci kimi istifade edirik..
                                //kimi
interface NoteRepository {

    fun getNotes(): Flow<List<Note>>

    suspend fun getNoteById(id: Int): Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)
}