package com.assignment.firstjetpackcomponseapplication

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

class ScaffoldActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            FloatingActionScaffold()
//            SnackBarComposable()
//            TopAppBarDemo()
            BottomBarDemo()
        }
    }


}


@Composable
fun SnackBarComposable() {
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

@Composable
fun FloatingActionScaffold() {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = {
                Log.e("TAG", "FAB clicked..")
            }) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "")
            }
        },
        floatingActionButtonPosition = FabPosition.End,
        isFloatingActionButtonDocked = true
    ) {

    }
}

@Composable
fun TopAppBarDemo() {

    Scaffold(
        topBar = {

            TopAppBar(
                title = {
                    Column {


                        Text(text = "Hello")
                        Text(text = "World")
                    }
                },
                backgroundColor = Color.Red,
                navigationIcon = {
                    IconButton(onClick = {
                        Log.e("TAG", "Topbar back clicked..")

                    }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "",
                            Modifier.padding(10.dp)
                        )
                    }
                }
            )
        },
        contentColor = Color.White
    ) {
    }

}


@Preview
@Composable
fun BottomBarDemo() {

    /* Scaffold(bottomBar = Botto{
         Text(text = "Bottom bar")
     },
     backgroundColor = MaterialTheme.colors.primary) {

     }*/

    Scaffold(
        bottomBar = {
            BottomAppBar(
                backgroundColor = MaterialTheme.colors.primary,
                contentColor = Color.Cyan,
                elevation = 5.dp
            ) {
                Column {
                    Text("Bottom Top Text")
                    Text("Bottom Bottom Text")
                }
            }
        },
    ) {

    }

}