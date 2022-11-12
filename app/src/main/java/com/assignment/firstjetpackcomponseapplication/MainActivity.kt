package com.assignment.firstjetpackcomponseapplication

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


            /*Column(
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp)
                    .background(Color.Yellow)
            ) {

                Text(text = "Hello")
                Text(text = "Pallavi")
            }*/

            Column(
                modifier = Modifier
//                    .fillMaxWidth(0.8f)
//                    .fillMaxHeight(0.8f)
                    .fillMaxSize()
                    .background(Color.Yellow)
                    .padding(8.dp)
                    .border(2.dp, Color.Red)
                    .padding(8.dp)
                    .border(2.dp, Color.Gray)
                    .padding(8.dp)
                    .border(2.dp, Color.Green)

            ) {

                Text(
                    text = "Hello", modifier = Modifier
                        .offset(8.dp)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Text(text = "Pallavi", modifier = Modifier.clickable {
                    Toast.makeText(this@MainActivity, "Clicked!!", Toast.LENGTH_SHORT).show()
                })
            }

        }
    }
}

