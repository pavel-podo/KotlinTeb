package com.examplePavelpo.myapplication

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun PersonalDataScreen(
    navController: NavController,
    name: MutableState<String>,
    email: MutableState<String>,
    pass: MutableState<String>,
    confpas: MutableState<String>,
    ){
    Column(modifier = Modifier
        .fillMaxSize()){
        Text(text = "name: ${name.value}" );
        Text(text = "email ${email.value}");
        Text(text = "password ${pass.value}");
        Text(text = "conf ${confpas.value}" );
    }
}


