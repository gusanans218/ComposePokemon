package com.example.composepokemon.data.remote.responses

import com.google.gson.annotations.SerializedName

data class GenerationIv(
    @SerializedName("diamond-pearl")
    val diamond_pearl : DiamondPearl,
    @SerializedName("heartgold-soulsilver")
    val heartgold_soulsilver: HeartgoldSoulsilver,
    val platinum: Platinum
)