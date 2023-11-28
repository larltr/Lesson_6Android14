package com.angelika.lesson_6android14.presentation.items

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.angelika.lesson_6android14.R
import com.angelika.lesson_6android14.models.Attributes

@Composable
fun Item(model: Attributes) {

    Row(
        modifier = Modifier
            .padding(3.dp)
            .fillMaxWidth()
            .background(Color.White)
    ) {
        AsyncImage(
            model = model.image,
            contentDescription = "",
            modifier = Modifier.size(100.dp),
            contentScale = ContentScale.FillBounds,
            placeholder = painterResource(
                id = R.drawable.image_loading,
            ),
            error = painterResource(id = R.drawable.image_not_found)
        )
        Column(
            modifier = Modifier
                .padding(start = 10.dp, top = 12.dp)
                .fillMaxSize()
        ) {
            Text(text = model.name)
        }
    }
}