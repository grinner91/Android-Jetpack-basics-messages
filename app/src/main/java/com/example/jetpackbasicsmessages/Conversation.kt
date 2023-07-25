package com.example.jetpackbasicsmessages

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackbasicsmessages.data.MessageData
import com.example.jetpackbasicsmessages.ui.theme.JetpackBasicsMessagesTheme

@Composable
fun Conversation(messages: List<MessageData>) {
    LazyColumn {
        items(messages){ msg ->
            MessageCard(msg)
        }
    }
}

@Preview
@Composable
fun PreviewConversation() {
    JetpackBasicsMessagesTheme {
        Conversation(messages = getSampleMessages())
    }
}

fun getSampleMessages(): List<MessageData> {
    
    val msgList = mutableListOf<MessageData>(
        MessageData("Zaman1", "This is message body1 this " +
                "This is message body1 this" +
                "This is message body1 this" +
                "This is message body1 this" +
                "This is message body1 this" +
                "This is message body1 this" +
                "This is message body1 this" +
                "This is message body1 this" +
                "This is message body1 this" +
                "This is message body1 this" +
                "This is message body1 " +
                "thisThis is message body1 this" +
                "This is message body1 this" +
                "This is message body1 " +
                "thisThis is message body1 this"),
        MessageData("Zaman2", "This is message body2"),
        MessageData("Zaman3", "This is message body3"),
        MessageData("Zaman4", "This is message body4"),
        MessageData("Zaman5", "This is message body5"),
        MessageData("Zaman1", "This is message body1"),
        MessageData("Zaman2", "This is message body2"),
        MessageData("Zaman3", "This is message body3"),
        MessageData("Zaman4", "This is message body4"),
        MessageData("Zaman5", "This is message body5"),
        MessageData("Zaman1", "This is message body1"),
        MessageData("Zaman2", "This is message body2"),
        MessageData("Zaman3", "This is message body3"),
        MessageData("Zaman4", "This is message body4"),
        MessageData("Zaman5", "This is message body5"),
        MessageData("Zaman1", "This is message body1"),
        MessageData("Zaman2", "This is message body2"),
        MessageData("Zaman3", "This is message body3"),
        MessageData("Zaman4", "This is message body4"),
        MessageData("Zaman5", "This is message body5"),
        MessageData("Zaman1", "This is message body1"),
        MessageData("Zaman2", "This is message body2"),
        MessageData("Zaman3", "This is message body3"),
        MessageData("Zaman4", "This is message body4"),
        MessageData("Zaman5", "This is message body5"),
    )
    
    return msgList
}