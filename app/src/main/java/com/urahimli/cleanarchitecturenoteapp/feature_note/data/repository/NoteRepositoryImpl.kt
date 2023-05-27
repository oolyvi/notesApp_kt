package com.urahimli.cleanarchitecturenoteapp.feature_note.data.repository

import com.urahimli.cleanarchitecturenoteapp.feature_note.data.data_source.NoteDao
import com.urahimli.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.urahimli.cleanarchitecturenoteapp.feature_note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

//doing inheritance from the other NoteRepository
class NoteRepositoryImpl(
    private val dao: NoteDao
) : NoteRepository{

    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        return dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        return dao.deleteNote(note)
    }

}