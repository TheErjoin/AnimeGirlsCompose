package kg.erjan.composepractice.data.remote.apiServices.mock

import android.content.Context
import kg.erjan.composepractice.common.utils.fromJson
import kg.erjan.composepractice.common.utils.jsonFromAssets
import kg.erjan.composepractice.data.remote.apiServices.AnimeGirlsApiService
import kg.erjan.composepractice.data.remote.dtos.PagingResponse
import kg.erjan.composepractice.data.remote.dtos.anime_girls.AnimeGirlDto
import kotlinx.coroutines.delay
import retrofit2.Response

class AnimeGirlsApiServiceImpl(
    private val context: Context
) : AnimeGirlsApiService {

    override suspend fun fetchAnimeGirls(
        page: Int
    ): Response<PagingResponse<AnimeGirlDto>> {
        delay(1000)
        return when (page) {
            1 -> {
                Response.success(fromJson(context.jsonFromAssets("AnimeGirlPage1.json")))
            }
            2 -> {
                Response.success(fromJson(context.jsonFromAssets("AnimeGirlPage2.json")))
            }
            3 -> {
                Response.success(fromJson(context.jsonFromAssets("AnimeGirlPage3.json")))
            }
            4 -> {
                Response.success(fromJson(context.jsonFromAssets("AnimeGirlPage4.json")))
            }
            5 -> {
                Response.success(fromJson(context.jsonFromAssets("AnimeGirlPage5.json")))
            }
            6 -> {
                Response.success(fromJson(context.jsonFromAssets("AnimeGirlPage6.json")))
            }
            7 -> {
                Response.success(fromJson(context.jsonFromAssets("AnimeGirlPage7.json")))
            }
            else ->{
                Response.success(fromJson(context.jsonFromAssets("AnimeGirlPage8.json")))
            }
        }
    }
}