package kg.erjan.composepractice.presentation.anime_girl

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.paging.compose.collectAsLazyPagingItems
import dagger.hilt.android.AndroidEntryPoint
import kg.erjan.composepractice.presentation.anime_girl.components.AnimeGirlForecast

@AndroidEntryPoint
class AnimeGirlActivity : ComponentActivity() {

    private val viewModel: AnimeGirlViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val animeGirlData = viewModel.fetchAnimeGirls.collectAsLazyPagingItems()
            Box(modifier = Modifier.fillMaxSize()) {
                AnimeGirlForecast(animeGirl = animeGirlData)
            }
        }
    }
}