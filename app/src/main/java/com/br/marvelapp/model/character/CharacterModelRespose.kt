package com.br.marvelapp.model.character

import com.google.gson.annotations.SerializedName

data class CharacterModelRespose(
    @SerializedName("data ")
    val data: CharacterModelData
)
