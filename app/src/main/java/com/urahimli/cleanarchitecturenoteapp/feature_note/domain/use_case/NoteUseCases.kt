package com.urahimli.cleanarchitecturenoteapp.feature_note.domain.use_case

//this class contains all our UseCases
data class NoteUseCases (
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getNote: GetNote
)