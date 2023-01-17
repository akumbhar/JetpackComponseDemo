package com.assignment.firstjetpackcomponseapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            ComposeBoxText()

        }
    }
}

/*
@Preview
@Composable
fun ComposeText() {

    Card(
        modifier = Modifier
            .width(200.dp)
            .height(200.dp)
            .padding(16.dp),
        shape = RoundedCornerShape(10.dp),
        elevation = 5.dp
    ) {

        Box {
            Image(
                painter = painterResource(id = R.drawable.diwali),
                contentDescription = "Some desc"
            )

            Box(modifier = Modifier.fillMaxSize().padding(8.dp), contentAlignment = Alignment.BottomCenter) {
                Text(text = "Happy Diwali", color = Color.White)
            }

        }


    }
}*/

/*

@Preview
@Composable
fun ComposeText() {
   Column(modifier = Modifier
       .fillMaxWidth()
       .fillMaxHeight(0.5f)
       .background(Color.Yellow)
       .border(5.dp, Color.Green)
       .padding(5.dp)
       .border(5.dp, Color.Cyan)
       .padding(5.dp)
       .border(5.dp, Color.Magenta)
       .padding(5.dp)
   ) {


       Text(text = "Hello", modifier = Modifier.draggable)
   }
}
*/

@Preview
@Composable
fun ComposeBoxText() {

    Box {
        Text(
            text = "Hello World!!",
            color = Color.Red,
            fontSize = 20.sp,
            textDecoration = TextDecoration.LineThrough,
            fontFamily = FontFamily(Font(R.font.aclonica)),
            textAlign = TextAlign.Center,
            fontStyle = FontStyle.Italic
        )
    }

}

@Preview
@Composable
fun ComposeSpannableText() {

    Box {
        Text(
            text = buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        color = Color.Green,
                        fontFamily = FontFamily(Font(R.font.aclonica)),
                        fontSize = 20.sp,
                        textDecoration = TextDecoration.LineThrough
                    )
                ) {
                    append("Hello")
                }
                withStyle(
                    style = SpanStyle(
                        color = Color.Magenta,
                        fontFamily = FontFamily(Font(R.font.montserrat_italic)),
                        fontSize = 30.sp,
                        textDecoration = TextDecoration.Underline,
                    )
                ) {
                    append(" World!!")
                }
            },
            color = Color.Red,
            textAlign = TextAlign.Center,
            fontStyle = FontStyle.Italic
        )
    }

}