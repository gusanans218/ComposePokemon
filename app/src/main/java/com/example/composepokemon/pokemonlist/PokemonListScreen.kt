package com.example.composepokemon.pokemonlist

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.composepokemon.R

@Composable
fun PokemonListScreen(
    navController: NavController
){
    androidx.compose.material.Surface (
        color = MaterialTheme.colors.background,
        modifier = Modifier.fillMaxSize()
            ){
        Column {
            Spacer(modifier = Modifier.height(20.dp))
            Image(
                painter = painterResource(id = R.drawable.ic_international_pok_mon_logo),
                contentDescription = "Pokemon",
                modifier = Modifier
                    .fillMaxWidth()
                    .align(CenterHorizontally))
        }
    }
}

@Composable
fun SearchBar(
    modifier: Modifier = Modifier,
    hint:String = "",
    onSearch: (String) -> Unit = {}
){

}