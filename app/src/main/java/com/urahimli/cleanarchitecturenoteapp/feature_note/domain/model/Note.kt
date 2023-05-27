package com.urahimli.cleanarchitecturenoteapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.urahimli.cleanarchitecturenoteapp.ui.theme.Blue
import com.urahimli.cleanarchitecturenoteapp.ui.theme.DarkRed
import com.urahimli.cleanarchitecturenoteapp.ui.theme.Green
import com.urahimli.cleanarchitecturenoteapp.ui.theme.Orange
import com.urahimli.cleanarchitecturenoteapp.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(Blue, DarkRed, Violet, Green, Orange)
    }
}

class InvalidNoteException(message: String) : Exception(message)
