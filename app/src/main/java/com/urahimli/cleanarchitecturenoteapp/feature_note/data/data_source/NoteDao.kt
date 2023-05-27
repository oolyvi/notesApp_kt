package com.urahimli.cleanarchitecturenoteapp.feature_note.data.data_source

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.urahimli.cleanarchitecturenoteapp.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {

    @Query("SELECT * FROM note")
    fun getNotes(): Flow<List<Note>>

    @Query("SELECT * FROM note WHERE id = :id")
    suspend fun getNoteById(id: Int): Note?    //tek bir note'a tikladiqda icindekileri gormek ucun

    @Insert(onConflict = OnConflictStrategy.REPLACE)     //hem insert, hem update edir
    suspend fun insertNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)
}