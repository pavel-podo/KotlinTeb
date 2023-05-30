package com.examplePavelpo.myapplication

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.examplePavelpo.myapplication.ui.theme.MyApplicationTheme

@Composable

fun input(pl:String, value: MutableState<String>  )  {
    TextField(
        onValueChange = {newText -> value.value = newText},
        value= value.value,
                modifier = Modifier
                .fillMaxWidth(0.8f )
            .padding(16.dp)
            .border(3.dp, Color.White, RoundedCornerShape(30.dp)),
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = Color(0xFF1d488c),
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent,
            textColor = Color.White
        ),
        placeholder = { Text(pl,color = Color(0xFFc0c0c0 )) })
}
@Composable
fun pasInput(pl:String, value: MutableState<String>, )  {
    TextField(
        onValueChange = {newText -> value.value = newText},
        value= value.value,
        visualTransformation =PasswordVisualTransformation(),
        keyboardOptions =  KeyboardOptions(keyboardType = KeyboardType.Password),
        modifier = Modifier
            .fillMaxWidth(0.8f )
            .padding(16.dp)
            .border(3.dp, Color.White, RoundedCornerShape(30.dp)),
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = Color(0xFF1d488c),
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent,
            textColor = Color.White
        ),
        placeholder = { Text(pl,color = Color(0xFFc0c0c0 )) })
}

@Composable
fun emailInput(pl:String, value: MutableState<String>, )  {
    TextField(
        onValueChange = {newText -> value.value = newText},
        value= value.value,
        keyboardOptions =  KeyboardOptions(keyboardType = KeyboardType.Email),
        modifier = Modifier
            .fillMaxWidth(0.8f )
            .padding(16.dp)
            .border(3.dp, Color.White, RoundedCornerShape(30.dp)),
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = Color(0xFF1d488c),
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent,
            textColor = Color.White
        ),
        placeholder = { Text(pl,color = Color(0xFFc0c0c0 )) })
}