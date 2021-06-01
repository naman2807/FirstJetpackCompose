package com.example.firstjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.firstjetpackcompose.ui.theme.FirstJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting(text = "Android")
        }
    }
}

@Composable
fun Greeting(text : String){
    Text(text = text)
}
/*
The setContent block defines the activity's layout. Instead of defining the layout contents
with an XML file, we call composable functions. Jetpack Compose uses a custom Kotlin
compiler plugin to transform these composable functions into the app's UI elements. For
example, the Text() function is defined by the Compose UI library; you call that function
to declare a text element in your app.

Define a composable function
Composable functions can only be called from within the scope of other composable
functions. To make a function composable, add the @Composable annotation.
 */