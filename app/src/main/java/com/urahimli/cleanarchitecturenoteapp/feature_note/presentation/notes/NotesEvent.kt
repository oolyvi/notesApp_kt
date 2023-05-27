package com.urahimli.cleanarchitecturenoteapp.feature_note.presentation.notes

import com.urahimli.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.urahimli.cleanarchitecturenoteapp.feature_note.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()         //snackbar'daki undo button
    object ToggleOrderSection: NotesEvent()
}