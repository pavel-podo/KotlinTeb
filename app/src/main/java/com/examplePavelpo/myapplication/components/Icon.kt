package com.examplePavelpo.myapplication.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.examplePavelpo.myapplication.ui.theme.TextColor

@Composable
fun Icon(){
    Box(
        modifier = Modifier
            .size(size = 60.dp)
            .background(TextColor, shape = CircleShape),

        contentAlignment = Alignment.Center
    ){
        androidx.compose.material.Icon(
            imageVector = Icons.Default.Person,
            contentDescription = "Person Icon",
            modifier = Modifier.size(size = 60.dp),
        )
    }
}