package com.example.firstjetpackcompose

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity1 : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsStory()
        }
    }
}

@Composable
fun NewsStory(){
    Column() {
        Text(text = "This is first text")
        Text(text = "Second")
        Text(text = "Third Text")
    }
    Text(text = "This is first text")
    Text(text = "Second")
    Text(text = "Third Text")
}

@Preview
@Composable
fun DefaultPreview(){
    NewsStory()
}