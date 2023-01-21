package com.assignment.firstjetpackcomponseapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class TextFieldActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            SimpleTextField()
            OutLinedTextView()
        }
    }
}

@Preview
@Composable
fun SimpleTextField() {

    // 1st way

    var tfState = remember {
        mutableStateOf("")
    }

    // sec way
    var secState by remember {
        mutableStateOf("")
    }

    Column {


        TextField(value = tfState.value,
            onValueChange = {
                tfState.value = it
            },
            label = {
                Text(text = "Hello")
            },
            placeholder = {
                Text(text = "Some Hint")
            }
        )

            Spacer(modifier = Modifier.height(8.dp))


            TextField(value = secState,
                onValueChange = {
                secState = it
            },
            keyboardOptions =  KeyboardOptions(
                keyboardType = KeyboardType.Number
            ),
            label = {
                Text(text = "Enter Number")
            })
        }
}


@Preview
@Composable
fun OutLinedTextView() {
    var text by remember {
        mutableStateOf("")
    }

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {


        OutlinedTextField(
            value = text,
            onValueChange = {
                text = it
            },
            label = {
                Text(text = "Email Address")
            },
            placeholder = {
                Text(text = "Enter your email")
            },
            leadingIcon = {
                Icon(imageVector = Icons.Default.Email, contentDescription = "")
            },
            trailingIcon = {
                Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "")
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)



        )
    }
}