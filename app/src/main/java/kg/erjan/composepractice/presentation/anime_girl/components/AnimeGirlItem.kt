package kg.erjan.composepractice.presentation.anime_girl.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import kg.erjan.composepractice.domain.models.anime_girl.AnimeGirl

@Composable
fun AnimeGirlItem(
    animeGirl: AnimeGirl
) {
    Card(
        modifier = Modifier
            .padding(all = 8.dp)
            .fillMaxWidth()
    ) {
        var expanded by remember { mutableStateOf(false) }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.clickable { expanded = !expanded }
        ) {
            AsyncImage(
                model = animeGirl.image,
                contentDescription = null,
                modifier = Modifier.height(200.dp),
                contentScale = ContentScale.Crop
            )
            AnimatedVisibility(visible = expanded) {
                Text(
                    text = animeGirl.nameRu,
                    color = Color.Black,
                    modifier = Modifier.padding(bottom = 4.dp),
                    style = MaterialTheme.typography.h6
                )
            }
        }
    }
}