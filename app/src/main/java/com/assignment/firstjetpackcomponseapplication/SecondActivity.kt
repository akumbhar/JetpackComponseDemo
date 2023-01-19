package com.assignment.firstjetpackcomponseapplication

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import kotlin.random.Random

class SecondActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
//TestState()

            editTextDemo(){
                Toast.makeText(this, it, Toast.LENGTH_SHORT).show()

            }
            var boxColor by remember {
                mutableStateOf(Color.Red)
            }


           /* Column(modifier = Modifier.fillMaxSize()) {
                BoxColorTest(Modifier.weight(1f).fillMaxSize().background(boxColor.value)){ updatedColor ->
                    boxColor.value = updatedColor
                }
                Box(Modifier.weight(1f).fillMaxSize().background(boxColor.value))
            }*/

        }
    }

}


@Composable
fun BoxColorTest(modifier: Modifier, callback : (Color) -> Unit){
    Box(
        modifier = modifier
            .background(Color.Yellow)
            .clickable {
                callback(
                    Color(
                        Random.nextFloat(),
                        Random.nextFloat(),
                        Random.nextFloat(),
                        1f
                    )
                )
            }
    )
}



@Composable
fun TestState(){

    var clickCount by rememberSaveable {
        mutableStateOf(0)
    }

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Button(onClick = { clickCount++
            Log.e("TAG", "NoState: $clickCount")}) {
            Text(text = "Clicked $clickCount times")
        }

    }
}

@Composable
fun editTextDemo(callback: (String) -> Unit){

    var textFieldState by remember {
        mutableStateOf("")
    }


    Column {


        TextField(
            value = textFieldState,
            label ={ Text(text = "Some Hint")},
            singleLine = true,
            onValueChange = {
                textFieldState = it
                Log.e("TAG", "Entered Text $it")
            }

        )

        Button(
            onClick = {
                callback(textFieldState)

            }
        ) {
            Text(text = "Press me")
        }
    }
}

