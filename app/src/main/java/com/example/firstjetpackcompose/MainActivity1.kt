package com.example.firstjetpackcompose

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

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
    Column(Modifier.padding(8.dp)) {
        Text(text = "This is first text")
        Text(text = "Second")
        Text(text = "Third Text")
    }
}

@Preview
@Composable
fun DefaultPreview(){
    NewsStory()
}

/*
Using a Column
The Column function lets you stack elements vertically.
 */