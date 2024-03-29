package com.example.marvelapp.data.model.comic

import com.google.gson.annotations.SerializedName

data class ComicModelResponse(
    @SerializedName("data")
    val data: ComicModelData
)
