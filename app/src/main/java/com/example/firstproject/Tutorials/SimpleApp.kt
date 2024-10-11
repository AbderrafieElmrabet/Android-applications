package com.example.firstproject.Tutorials

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.DividerDefaults.color
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstproject.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                PlainPage()
            }
        }
    }
}

@Composable
fun PlainPage() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center,
    ){
        Image(
            painter = painterResource(id = R.drawable.rabatpic),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize(),
            alpha = 0.5F
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "The City Of Rabat", // The title text
                color = Color.Black, // Set the text color
                fontSize = 35.sp,
                modifier = Modifier
                    .padding(16.dp) // Add some padding around the text
            )
            Image(
                painter = painterResource(id = R.drawable.rabat),
                contentDescription = "Rabat",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(top = 60.dp)
                    .height(230.dp)
                    .border(
                        width = 4.dp,
                        color = Color.White
                    )
            )
            Text(
                text = "Rabat, the capital city of Morocco, is situated along the Atlantic coast and is known for its rich history and blend of modernity and tradition. As one of the country's four imperial cities, Rabat boasts a variety of historical sites",
                color = Color.Black,
                fontSize = 25.sp,
                modifier = Modifier
                    .padding(16.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MaterialTheme {
        PlainPage()
    }
}