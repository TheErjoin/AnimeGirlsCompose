package kg.erjan.composepractice.presentation.anime_girl

import dagger.hilt.android.lifecycle.HiltViewModel
import kg.erjan.composepractice.common.base.BaseViewModel
import kg.erjan.composepractice.domain.usecases.FetchAnimeGirlsUseCase
import javax.inject.Inject

@HiltViewModel
class AnimeGirlViewModel @Inject constructor(
    fetchAnimeGirlsUseCase: FetchAnimeGirlsUseCase
) : BaseViewModel() {

    var fetchAnimeGirls = fetchAnimeGirlsUseCase()
}