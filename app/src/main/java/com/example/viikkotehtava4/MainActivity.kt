package com.example.viikkotehtava4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.viikkotehtava4.ui.theme.Viikkotehtava4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Viikkotehtava4Theme {
                Viikkotehtava4()
            }
        }
    }
}

@Composable
fun Viikkotehtava4() {
    val appModifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "My title",
            style = MaterialTheme.typography.headlineSmall,
            modifier = appModifier
        )

        OutlinedTextField(
            value = "",
            onValueChange = { /* Handle input */ },
            modifier = appModifier
        )

        Button (
            onClick = { /* Handle click */ },
            modifier = appModifier
        ) {
            Text(text = "Submit")
        }
    }
}





















