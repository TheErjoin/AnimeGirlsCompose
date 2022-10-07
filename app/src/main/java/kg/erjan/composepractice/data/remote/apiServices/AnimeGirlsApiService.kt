package kg.erjan.composepractice.data.remote.apiServices

import kg.erjan.composepractice.data.remote.dtos.PagingResponse
import kg.erjan.composepractice.data.remote.dtos.anime_girls.AnimeGirlDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface AnimeGirlsApiService {

    @GET("/api/anime_girls")
    suspend fun fetchAnimeGirls(page: Int): Response<PagingResponse<AnimeGirlDto>>

}