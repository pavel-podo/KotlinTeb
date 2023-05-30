package com.examplePavelpo.myapplication

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun secondScreen(navController: NavController,name:String, email:String,pass:String,confPass:String){
    Column(modifier = Modifier
        .fillMaxSize()){
        Text(text = "name: $name" );
        Text(text = "email $email");
        Text(text = "password $pass");
        Text(text = "conf $confPass" );
    }
}


