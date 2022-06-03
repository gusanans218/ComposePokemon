package com.example.composepokemon.data.remote.responses

import com.google.gson.annotations.SerializedName

data class Versions(
    @SerializedName("generation-i")
    val generationI: GenerationI,
    @SerializedName("generation-ii")
    val generationII: GenerationIi,
    @SerializedName("generation-iii")
    val generationIII: GenerationIii,
    @SerializedName("generation-iv")
    val generationIV: GenerationIv,
    @SerializedName("generation-v")
    val generationV: GenerationV,
    @SerializedName("generation-vi")
    val generationVI: GenerationVi,
    @SerializedName("generation-vii")
    val generationVII: GenerationVii,
    @SerializedName("generation-viii")
    val generationVIII: GenerationViii
)