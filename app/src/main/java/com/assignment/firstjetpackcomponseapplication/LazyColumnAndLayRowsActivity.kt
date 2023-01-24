package com.assignment.firstjetpackcomponseapplication

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class LazyColumnAndLayRowsActivity : androidx.activity.ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

//            VerticalListView()
//            HorizontalListView()
            SimpleList()
        }
    }
}

@Composable
fun VerticalListView(){

    LazyColumn{

        item {
            Button(onClick = {

            }
            ){
                Text(text = "Header")
            }
        }
        for (i in 1..20) {
            item {
                Text(text = "Item - $i")
            }

        }

        item {
           Button(onClick = {

           }) {

               Text(text = "Footer")
           }
        }
    }

}


@Composable
fun HorizontalListView() {
    LazyRow {
        item {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Header")
            }
        }

        items(20) { index ->
            Text(text = "Item $index")
        }

        item {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Footer")
            }

        }
    }
}

@Composable
fun SimpleList(){
    val itemsList = listOf("Hi", "Aniket", "How", "Are", "You")
    val listModifier = Modifier
        .fillMaxSize()
        .background(Color.Cyan)
        .padding(10.dp)
    val textStyle = TextStyle(fontSize = 20.sp, color = Color.Black)
    LazyColumn(modifier = listModifier){
            items(itemsList){
                Text(text = it, style = textStyle)
            }
    }
}

@Composable
fun CustomList(){
    
//    Image(imageVector = Icon(Icons.Default.Person), contentDescription = "")

}


data class Fruit(val name : String, val image : Int)