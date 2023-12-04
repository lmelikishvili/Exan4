package com.example.exan4.messages

data class Message(
    val id: Int,
    val owner: String,
    val lastMessage: String,
    val lastActive: String,
    val isTyping: Boolean,
    val lastMessageType: String,
)
