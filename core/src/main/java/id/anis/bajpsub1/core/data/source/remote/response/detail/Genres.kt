package id.anis.bajpsub1.core.data.source.remote.response.detail

import com.google.gson.annotations.SerializedName


data class Genres(

    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String
)