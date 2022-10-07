package kg.erjan.composepractice.domain.repository

import kg.erjan.composepractice.domain.models.anime_girl.AnimeGirl
import kg.erjan.composepractice.common.utils.RemotePagingWrapper

interface AnimeGirlsRepository {

    fun fetchAnimeGirls(): RemotePagingWrapper<AnimeGirl>

}