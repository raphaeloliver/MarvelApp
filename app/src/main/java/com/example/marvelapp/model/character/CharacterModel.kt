package com.example.marvelapp.model.character

import com.example.marvelapp.model.ThumbnailModel
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class CharacterModel(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("thumbnail")
    val thumbnailModel: ThumbnailModel
) : Serializable