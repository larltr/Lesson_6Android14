package com.angelika.lesson_6android14.presentation.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.hilt.navigation.compose.hiltViewModel
import com.angelika.lesson_6android14.presentation.items.Item

@Composable
fun CharactersScreen(
    viewModel: CharacterViewModel = hiltViewModel()
) {
    val characterState = viewModel.charactersListState.collectAsState()

    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        items(characterState.value) { character ->
            Item(model = character.attributes)
        }
    }
}