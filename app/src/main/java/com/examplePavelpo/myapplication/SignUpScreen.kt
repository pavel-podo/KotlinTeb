package com.examplePavelpo.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.examplePavelpo.myapplication.components.Btn
import com.examplePavelpo.myapplication.components.EmailInput
import com.examplePavelpo.myapplication.components.Input
import com.examplePavelpo.myapplication.components.PasInput
import com.examplePavelpo.myapplication.components.Icon




@Composable
    fun SignUpScreen(
    navController: NavController,
    name: MutableState<String>,
    email:MutableState<String>,
    pass:MutableState<String>,
    confpas:MutableState<String>,
){

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFF1d488c))
        .padding(top = 60.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Icon()
        Text(text = "Join Us",
            modifier = Modifier.padding(top=20.dp),
            fontSize =  40.sp,
            color= Color.White,

            );

        Input("Your name",name)
        EmailInput("Your email",email)
        PasInput("Enter password",pass)
        PasInput("Confirm password",confpas)
        Btn(text="Sign up", onClick = {navController.navigate("secondScreen")})
    }
}

