package com.urahimli.cleanarchitecturenoteapp.feature_note.presentation.util

//navigation between screens
sealed class Screen(val route: String) {
    object NotesScreen: Screen("notes_screen")
    object AddEditNoteScreen: Screen("add_edit_note_screen")
}
