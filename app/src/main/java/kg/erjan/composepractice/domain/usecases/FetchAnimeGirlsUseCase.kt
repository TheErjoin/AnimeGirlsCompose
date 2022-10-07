package kg.erjan.composepractice.domain.usecases

import kg.erjan.composepractice.domain.repository.AnimeGirlsRepository
import javax.inject.Inject

class FetchAnimeGirlsUseCase @Inject constructor(
    private val repository: AnimeGirlsRepository
) {

    operator fun invoke() = repository.fetchAnimeGirls()
}