package kg.erjan.composepractice.data.repositories

import kg.erjan.composepractice.common.base.BaseRepository
import kg.erjan.composepractice.data.remote.apiServices.AnimeGirlsApiService
import kg.erjan.composepractice.data.remote.pagingSources.AnimeGirlsPagingSource
import kg.erjan.composepractice.domain.repository.AnimeGirlsRepository
import javax.inject.Inject

class AnimeGirlsRepositoryImpl @Inject constructor(
    private val service: AnimeGirlsApiService
) : BaseRepository(),
    AnimeGirlsRepository {

    override fun fetchAnimeGirls() = doPagingRequest(AnimeGirlsPagingSource(service))
}