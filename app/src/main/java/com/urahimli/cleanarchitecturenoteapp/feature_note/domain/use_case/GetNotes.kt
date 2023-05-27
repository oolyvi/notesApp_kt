package com.urahimli.cleanarchitecturenoteapp.feature_note.domain.use_case

import com.urahimli.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.urahimli.cleanarchitecturenoteapp.feature_note.domain.repository.NoteRepository
import com.urahimli.cleanarchitecturenoteapp.feature_note.domain.util.NoteOrder
import com.urahimli.cleanarchitecturenoteapp.feature_note.domain.util.OrderType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

//bu hissede hem get, hem de sort edirik note'larimizi
class GetNotes(
    private val repository: NoteRepository
) {
    operator fun invoke(
        noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending)    //default olaraq DESCENDING etdik
    ): Flow<List<Note>> {
        return repository.getNotes().map { notes ->
            when(noteOrder.orderType) {
                is OrderType.Ascending -> {
                    when(noteOrder) {
                        is NoteOrder.Title -> notes.sortedBy { it.title.lowercase() }
                        is NoteOrder.Date -> notes.sortedBy { it.timestamp }
                        is NoteOrder.Color -> notes.sortedBy { it.color }
                    }
                }
                is OrderType.Descending -> {
                    when(noteOrder) {
                        is NoteOrder.Title -> notes.sortedByDescending { it.title.lowercase() }
                        is NoteOrder.Date -> notes.sortedByDescending { it.timestamp }
                        is NoteOrder.Color -> notes.sortedByDescending { it.color }
                    }
                }
            }
        }
    }
}