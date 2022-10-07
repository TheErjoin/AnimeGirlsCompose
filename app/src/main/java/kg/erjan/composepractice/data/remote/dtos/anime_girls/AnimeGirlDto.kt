package kg.erjan.composepractice.data.remote.dtos.anime_girls

import com.google.gson.annotations.SerializedName
import kg.erjan.composepractice.domain.models.anime_girl.AnimeGirl
import kg.erjan.composepractice.common.utils.DataMapper

class AnimeGirlDto(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name_ru")
    val nameRu: String,
    @SerializedName("image")
    val image: String
) : DataMapper<AnimeGirl> {
    override fun mapToDomain() = AnimeGirl(id, nameRu, image)
}