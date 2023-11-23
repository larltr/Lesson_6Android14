package com.angelika.lesson_6android14.presentation.screens

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.angelika.lesson_6android14.data.repositories.HarryPotterRepository
import com.angelika.lesson_6android14.models.DataItem
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CharacterViewModel @Inject constructor(private val harryPotterRepository: HarryPotterRepository) :
    ViewModel() {

    var charactersListState = MutableStateFlow<List<DataItem>>(emptyList())

    init {
        fetchCharacters()
    }

    private fun fetchCharacters() {
        viewModelScope.launch {
            harryPotterRepository.fetchChacacters().collect { characters ->
                characters.data.let {
                    charactersListState.value = it!!
                }
            }
        }
    }

}