package kg.erjan.composepractice.data.remote.dtos

import com.google.gson.annotations.SerializedName

data class PagingResponse<T>(
    @SerializedName("page")
    val page: Int,
    @SerializedName("next")
    val next: Int?,
    @SerializedName("characters")
    val characters: MutableList<T>
)