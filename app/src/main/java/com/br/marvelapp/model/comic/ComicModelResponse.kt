package com.br.marvelapp.model.comic

import com.google.gson.annotations.SerializedName

data class ComicModelResponse(
    @SerializedName("data")
    val data: ComicModelData
)
