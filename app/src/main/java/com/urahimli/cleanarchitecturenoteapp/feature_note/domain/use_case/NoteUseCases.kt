package com.urahimli.cleanarchitecturenoteapp.feature_note.domain.use_case

data class NoteUseCases (   //buraya butun use_case'leri getiririk ki bir class'la icinden icine rahat erise bilek
    val getNotes: GetNotes,      //bu class'i sonra ViewModel'da inject edeceyik
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getNote: GetNote
)