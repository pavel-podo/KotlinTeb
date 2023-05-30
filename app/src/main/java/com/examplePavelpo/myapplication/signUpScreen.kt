package com.examplePavelpo.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun signUpScreen(navController: NavController,name: MutableState<String>, email:MutableState<String>, pass:MutableState<String>, confpas:MutableState<String>){
    val butVisibleState = remember{ mutableStateOf("false") }
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFF1d488c))
        .padding(top = 60.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Box(
            modifier = Modifier
                .size(size = 60.dp)
                .background(Color.White, shape = CircleShape),

            contentAlignment = Alignment.Center
        ){
            Icon(
                imageVector = Icons.Default.Person,
                contentDescription = "Person Icon",
                modifier = Modifier.size(size = 60.dp),
            )
        }
        Text(text = "Join Us",
            modifier = Modifier.padding(top=20.dp),
            fontSize =  40.sp,
            color= Color.White,

            );
        input("Your name",name)
        emailInput("Your email",email)
        pasInput("Enter password",pass)
        pasInput("Confirm password",confpas)
        fun clickBtn (){
           // if (pass.value == confpas.value ) butVisibleState.value = "false" else  butVisibleState.value = "true";
            navController.navigate("screen2")
        }
        Button(
            //enabled = false,
            onClick =  {navController.navigate("secondScreen")},
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Transparent, // Устанавливаем прозрачный фон
                contentColor = Color.White // Устанавливаем черный цвет текста
            ),
            modifier = Modifier
                .border(2.dp, Color.White, RoundedCornerShape(30.dp))
                .height(40.dp),
            elevation = ButtonDefaults.elevation(
                defaultElevation = 0.dp
            ),
            contentPadding = PaddingValues(horizontal = 50.dp, vertical = 5.dp)
        ) {
            Text("Sign up") // Текст на кнопке
        }

    }
}
