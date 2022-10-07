package kg.erjan.composepractice.presentation.anime_girl.components

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.paging.compose.LazyPagingItems
import androidx.paging.compose.items
import kg.erjan.composepractice.domain.models.anime_girl.AnimeGirl

@Composable
fun AnimeGirlForecast(
    animeGirl: LazyPagingItems<AnimeGirl>,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Тянки",
            fontSize = 20.sp,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(12.dp))

        LazyColumn(
            contentPadding = PaddingValues(horizontal = 8.dp, vertical = 4.dp)
        ) {
            items(
                items = animeGirl,
            ) { animeGirl ->
                if (animeGirl != null) {
                    Log.e("dataConstract", "AnimeGirlForecast: ${animeGirl.nameRu}", )
                    AnimeGirlItem(animeGirl = animeGirl)
                }
            }
        }
    }
}