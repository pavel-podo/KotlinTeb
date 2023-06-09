package com.examplePavelpo.myapplication.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.examplePavelpo.myapplication.ui.theme.TextColor

@Composable
fun Btn(text:String="",onClick : ()-> Unit){
    Button(
//        onClick =  {navController.navigate("secondScreen")},
        onClick =  onClick,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Transparent,
            contentColor = TextColor
        ),
        modifier = Modifier
            .border(2.dp, TextColor, RoundedCornerShape(30.dp))
            .height(40.dp),
        elevation = ButtonDefaults.elevation(
            defaultElevation = 0.dp
        ),
        contentPadding = PaddingValues(horizontal = 50.dp, vertical = 5.dp)
    ) {
        Text("Sign up")
    }
}