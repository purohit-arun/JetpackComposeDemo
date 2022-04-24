package com.example.composedemo

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            ) {
                ButtonDemo()
            }
        }
    }

}

@Composable
fun ButtonDemo() {
    val context = LocalContext.current
    Button(onClick = {

        Toast.makeText(context, "Button Clicked", Toast.LENGTH_SHORT).show()
    }) {
        Text(text = "Add to cart")
    }
    TextButton(onClick = {

        Toast.makeText(context, "Button Clicked", Toast.LENGTH_SHORT).show()
    }) {
        Text(text = "Add to cart")
    }
    OutlinedButton(onClick = {

        Toast.makeText(context, "Button Clicked", Toast.LENGTH_SHORT).show()
    }) {
        Text(text = "Add to cart")
    }
    Button(
        onClick = {
            Toast.makeText(context, "Button Clicked", Toast.LENGTH_SHORT).show()
        },
        contentPadding = PaddingValues(16.dp),
        border = BorderStroke(10.dp, Color.Black),
        colors = ButtonDefaults.textButtonColors(
            backgroundColor = Color.DarkGray,
            contentColor = Color.White
        ),
        shape = CutCornerShape(10.dp)
    ) {
        Text(
            text = "Add to cart",
            style = MaterialTheme.typography.h3,
            modifier = Modifier.padding(5.dp)
        )
    }
}

@Composable
fun BoxExample1() {
    Box(
        modifier = Modifier
            .background(color = Color.Green)
            .size(180.dp, 300.dp),
    ) {
        Box(
            modifier = Modifier
                .size(125.dp, 100.dp)
                .background(Color.Yellow)
                .align(Alignment.TopEnd)
        ) {
            Text(
                text = "hi",
                style = MaterialTheme.typography.h3,
                modifier = Modifier
                    .background(Color.White)
                    .size(90.dp, 50.dp)
                    .align(Alignment.BottomCenter)
            )
        }
    }
}


@Composable
fun BoxExample2() {
    Box(
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxSize()
    ) {
        Text(
            text = "TopStart",
            style = MaterialTheme.typography.h5,
            modifier = Modifier
                .background(Color.Yellow)
                .padding(10.dp)
                .align(Alignment.TopStart)
        )
        Text(
            text = "TopCenter",
            style = MaterialTheme.typography.h5,
            modifier = Modifier
                .background(Color.Yellow)
                .padding(10.dp)
                .align(Alignment.TopCenter)
        )
        Text(
            text = "TopEnd",
            style = MaterialTheme.typography.h5,
            modifier = Modifier
                .background(Color.Yellow)
                .padding(10.dp)
                .align(Alignment.TopEnd)
        )
        Text(
            text = "CenterStart",
            style = MaterialTheme.typography.h5,
            modifier = Modifier
                .background(Color.Yellow)
                .padding(10.dp)
                .align(Alignment.CenterStart)
        )
        Text(
            text = "Center",
            style = MaterialTheme.typography.h5,
            modifier = Modifier
                .background(Color.Yellow)
                .padding(10.dp)
                .align(Alignment.Center)
        )
        Text(
            text = "CenterEnd",
            style = MaterialTheme.typography.h5,
            modifier = Modifier
                .background(Color.Yellow)
                .padding(10.dp)
                .align(Alignment.CenterEnd)
        )
        Text(
            text = "BottomStart",
            style = MaterialTheme.typography.h5,
            modifier = Modifier
                .background(Color.Yellow)
                .padding(10.dp)
                .align(Alignment.BottomStart)
        )
        Text(
            text = "BottomCenter",
            style = MaterialTheme.typography.h5,
            modifier = Modifier
                .background(Color.Yellow)
                .padding(10.dp)
                .align(Alignment.BottomCenter)
        )
        Text(
            text = "BottomEnd",
            style = MaterialTheme.typography.h5,
            modifier = Modifier
                .background(Color.Yellow)
                .padding(10.dp)
                .align(Alignment.BottomEnd)
        )
    }
}

@Composable
fun BoxExample3() {
    Box() {
        Image(
            painterResource(id = R.drawable.kotlin_cover_1024x576),
            contentDescription = "Kotlin Background"
        )
        Text(
            text = "Kotlin",
            color = Color.Black,
            style = MaterialTheme.typography.h3,
            modifier = Modifier
                .align(Alignment.BottomStart)
        )
        Button(
            onClick = { },
            colors = ButtonDefaults.textButtonColors(
                backgroundColor = Color.White,
                contentColor = Color.DarkGray
            ),
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(10.dp)
                .border(5.dp, Color.DarkGray, RectangleShape)
        ) {
            Text(text = "Add to Cart")
        }
    }
}









