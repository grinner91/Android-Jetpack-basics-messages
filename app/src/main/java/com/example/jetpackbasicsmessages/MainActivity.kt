package com.example.jetpackbasicsmessages

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackbasicsmessages.data.MessageData
import com.example.jetpackbasicsmessages.ui.theme.JetpackBasicsMessagesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackBasicsMessagesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MessageCard(MessageData("Zaman", "This is message1"))
                }
            }
        }
    }
}


@Composable
fun MessageCard(msg: MessageData) {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(all = 5.dp)
    ) {

        Image(
            painter = painterResource(id = R.drawable.profile_picture1),
            contentDescription = "Profile picture",
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Column {
            Text(text = msg.author)
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = msg.body)
        }
    }
}

@Preview
@Composable
fun MessageCard() {
    JetpackBasicsMessagesTheme {
        MessageCard(MessageData("Zaman", "This is message1"))
    }
}

