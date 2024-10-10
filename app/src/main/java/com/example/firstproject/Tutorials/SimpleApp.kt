package com.example.firstproject.Tutorials

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun HeadingText(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.titleLarge,
        fontSize = 24.sp
    )
}

@Composable
fun BodyText(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.bodyLarge,
        fontSize = 16.sp
    )
}

@Composable
fun FooterText(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.bodySmall,
        fontSize = 12.sp
    )
}

@Composable
fun ModularTextExample() {
    Column {
        HeadingText(text = "Welcome to Modular Text Elements")
        BodyText(text = "This is an example of how to create reusable text components in Jetpack Compose.")
        FooterText(text = "© 2024 Your Company")
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewModularTextExample() {
    ModularTextExample()
}