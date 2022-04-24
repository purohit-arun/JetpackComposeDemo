package com.example.composedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composedemo.ui.theme.ComposeDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background,
                ) {
                    Row(
                        modifier = Modifier
                            .background(
                                color = Color.LightGray
                            )
                            .fillMaxSize(),
                        horizontalArrangement = Arrangement.Center,
                         verticalAlignment = Alignment.Bottom
                    ) {
                        Greeting("Amit")
                        Greeting("arjun")
                        Greeting("ram")
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(
        text = "Hello $name!",
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Red,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .background(color = Color.Cyan)
            .border(2.dp, Color.Black)
            .padding(12.dp)
            .fillMaxWidth(0.6f)
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeDemoTheme {
        Greeting("Android")
    }
}