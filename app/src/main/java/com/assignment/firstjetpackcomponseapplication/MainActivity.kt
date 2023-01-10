package com.assignment.firstjetpackcomponseapplication

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.assignment.firstjetpackcomponseapplication.ui.theme.FirstJetpackComponseApplicationTheme
import com.assignment.firstjetpackcomponseapplication.ui.theme.Purple500
import com.assignment.firstjetpackcomponseapplication.ui.theme.Teal200

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
/*

            Column(
                modifier = Modifier
                    .background(Color.Red)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top

            ) {
                Text(text = "Hello")
                Text(text = "Jetpack compose")

                Row {

                    Text(text = "Hi")
                    Text(text = " Android")

                }
            }
*/
            FirstJetpackComponseApplicationTheme {
//            MessageCard(message = Message("Aniket", "Kumbhar", R.drawable.diwali))
                
//                Conversation(message = SampleData.conversationSample)
                ButtonDemo()
        }

        }
    }

    @Composable
    fun ButtonDemo(){
        Button(
            onClick = {
                Toast.makeText(this@MainActivity, "Clicked!!", Toast.LENGTH_SHORT).show()
            },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Cyan),
        ) {
            Text(text = "Click me", color = Color.Red)
        }
    }
}


data class Message(val firstName: String, val lastName: String, val image: Int = R.drawable.diwali )



@Composable
fun MessageCard(message: Message) {
    

    Row(modifier = Modifier.padding(8.dp)) {

        Image(
            painter = painterResource(id = message.image),
            contentDescription = "Dummy image",
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .border(1.5.dp, Teal200, CircleShape)
        )

        Spacer(modifier = Modifier.size(8.dp))

        Column {
            Text(
                text = message.firstName,
                color = MaterialTheme.colors.secondaryVariant,
                style = MaterialTheme.typography.subtitle2
            )
            Spacer(modifier = Modifier.size(4.dp))

            Surface(shape = MaterialTheme.shapes.medium, elevation = 1.dp) {
                Text(
                    text = message.lastName,
                    style = MaterialTheme.typography.body2,
                    modifier = Modifier.padding(4.dp)

                )
            }
        }

    }
}


@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_NO)
@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun ShowPreview() {
    FirstJetpackComponseApplicationTheme {
        MessageCard(message = Message("Aniket", "Kumbhar", R.drawable.diwali))
    }

}


@Composable
fun Conversation(message: List<Message>) {

    LazyColumn {
        items(message) { message ->
            MessageCard(message = message)
        }
    }

}

@Preview
@Composable
fun previewList(){
    Conversation(message = SampleData.conversationSample)
}


