package com.examplePavelpo.myapplication

import androidx.compose.ui.graphics.Color
import android.os.Bundle
import androidx.compose.material.TextField
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.examplePavelpo.myapplication.ui.theme.MyApplicationTheme

sealed class Destination(val route:String){
    object MainScreen :Destination("mainScreen")
    object SecondScreen :Destination("secondScreen")
}
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Main()
                }
            }
        }
    }
}

@Composable
fun Main() {
    val navController = rememberNavController()
    val nameState = remember{mutableStateOf("")}
    val emailState = remember{mutableStateOf("")}
    val passState = remember{mutableStateOf("")}
    val confPassState = remember{mutableStateOf("")}

    NavHost(
        navController = navController,
        startDestination = "mainScreen"
    ) {
        composable(Destination.MainScreen.route) {
            signUpScreen(navController = navController, name = nameState, email = emailState, pass = passState, confpas = confPassState)
        }
        composable(Destination.SecondScreen.route) {
            secondScreen(navController = navController, name = nameState.value,email= emailState.value, pass = passState.value, confPass = confPassState.value)
        }
    }
}


@Preview(showBackground = true)
@Composable

fun DefaultPreview() {
    MyApplicationTheme {
        Main()
    }
}



