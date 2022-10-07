package kg.erjan.composepractice.presentation.state

import kg.erjan.composepractice.domain.models.anime_girl.AnimeGirl

data class AnimeGirlsState(
    val animeGirlInfo: AnimeGirl? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)