package com.example.composepokemon.data.remote.responses

import com.google.gson.annotations.SerializedName

data class GenerationVi(
    @SerializedName("omegaruby-alphasapphire")
    val omegaruby_alphasapphire: OmegarubyAlphasapphire,
    @SerializedName("x-y")
    val xY: XY
)