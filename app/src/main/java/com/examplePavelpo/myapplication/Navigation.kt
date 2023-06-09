package com.examplePavelpo.myapplication

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

sealed class Destination(val route:String){
    object MainScreen :Destination("mainScreen")
    object SecondScreen :Destination("secondScreen")
}

@Composable
fun Navigation() {
    val navController = rememberNavController()
    val nameState = remember{ mutableStateOf("") }
    val emailState = remember{ mutableStateOf("") }
    val passState = remember{ mutableStateOf("") }
    val confPassState = remember{ mutableStateOf("") }

    NavHost(
        navController = navController,
        startDestination = "mainScreen"
    ) {
        composable(Destination.MainScreen.route) {
            SignUpScreen(navController = navController, name = nameState, email = emailState, pass = passState, confpas = confPassState)
        }
        composable(Destination.SecondScreen.route) {
            PersonalDataScreen(navController = navController, name = nameState,email= emailState, pass = passState, confpas = confPassState)
        }
    }
}