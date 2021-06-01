package com.example.firstjetpackcompose

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
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
        Image(painter = painterResource(id = R.drawable.image1),
            contentDescription = null,
            Modifier
                .height(180.dp)
                .fillMaxWidth(),
            contentScale = ContentScale.Crop)
        Spacer(modifier = Modifier.height(16.dp))
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

Add style settings to the column
By passing parameters to the Column call, you can configure the column's
size and position, and how the column's children are arranged.

The setting has the following meaning:

modifier: Lets you configure the layout. In this case, apply a
Modifier.padding modifier, which insets the column from the surrounding view.

ADDING IMAGE
The graphic is added to your layout, but it isn't sized appropriately yet.
To style the graphic, pass a size Modifier to the call to Image().

height(180.dp): Specifies the height of the image.
fillMaxWidth(): Specifies that the image should be wide enough to
fill the layout it belongs to.
You also need to pass a contentScale parameter to Image():

contentScale = ContentScale.Crop: Specifies that the graphic should
fill the width of the column, and be cropped if necessary to the
appropriate height.

 */