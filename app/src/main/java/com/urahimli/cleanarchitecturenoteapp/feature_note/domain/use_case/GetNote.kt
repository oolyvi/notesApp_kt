package com.urahimli.cleanarchitecturenoteapp.feature_note.domain.use_case

import com.urahimli.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.urahimli.cleanarchitecturenoteapp.feature_note.domain.repository.NoteRepository

//tekce bir note'u almaq ucun yazilir
class GetNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int) : Note? {
        return repository.getNoteById(id)
    }
}