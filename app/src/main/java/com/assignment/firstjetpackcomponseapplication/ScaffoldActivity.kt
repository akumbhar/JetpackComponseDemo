package com.assignment.firstjetpackcomponseapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class ScaffoldActivity  : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val scaffoldState = rememberScaffoldState()
            val myScope = rememberCoroutineScope()
            Scaffold(modifier = Modifier.fillMaxSize(), scaffoldState = scaffoldState) {



                    Button(onClick = {
                        myScope.launch {
                            scaffoldState.snackbarHostState.showSnackbar("Hello")
                        }
                    }) {
                        Text(text = "Press me")
                    }
                }

        }
    }
}