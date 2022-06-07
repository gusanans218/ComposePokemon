package com.example.composepokemon.pokemondetail

import androidx.lifecycle.ViewModel
import com.example.composepokemon.data.remote.responses.Pokemon
import com.example.composepokemon.repository.PokemonRepository
import com.example.composepokemon.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository:PokemonRepository
): ViewModel(){

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon>{
        return repository.getPokemonInfo(pokemonName)
    }
}