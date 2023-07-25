package com.example.jetpackbasicsmessages

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackbasicsmessages.data.MessageData
import com.example.jetpackbasicsmessages.ui.theme.JetpackBasicsMessagesTheme


@Composable
fun MessageCard(msg: MessageData) {

    var isExpanded by remember { mutableStateOf(false) }
    val surfaceColor by animateColorAsState( targetValue =
        if (isExpanded) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.surface
    )

    Row(
        modifier = Modifier
            .padding(all = 5.dp)
    ) {

        Image(
            painter = painterResource(id = R.drawable.profile_picture1),
            contentDescription = "Profile picture",
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .border(1.5.dp, MaterialTheme.colorScheme.primary, CircleShape)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Column(modifier = Modifier.clickable { isExpanded = !isExpanded }) {
            Text(
                text = msg.author,
                color = MaterialTheme.colorScheme.secondary,
                style = MaterialTheme.typography.titleSmall
            )

            Spacer(
                modifier = Modifier.height(4.dp)
            )

            Surface(shape = MaterialTheme.shapes.medium,
                color = surfaceColor,
                modifier = Modifier.animateContentSize().padding(1.dp),
                shadowElevation = 1.dp) {
                Text(
                    text = msg.body,
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(all = 4.dp),
                    maxLines = if(isExpanded) Int.MAX_VALUE else 1
                )
            }
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

