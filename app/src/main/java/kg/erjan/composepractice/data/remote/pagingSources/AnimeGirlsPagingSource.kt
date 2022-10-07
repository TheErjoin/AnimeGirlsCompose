package kg.erjan.composepractice.data.remote.pagingSources

import kg.erjan.composepractice.common.base.BasePagingSource
import kg.erjan.composepractice.data.remote.apiServices.AnimeGirlsApiService
import kg.erjan.composepractice.data.remote.dtos.anime_girls.AnimeGirlDto
import kg.erjan.composepractice.domain.models.anime_girl.AnimeGirl

class AnimeGirlsPagingSource(
    private val service: AnimeGirlsApiService
) : BasePagingSource<AnimeGirlDto, AnimeGirl>({
    service.fetchAnimeGirls(it)
})