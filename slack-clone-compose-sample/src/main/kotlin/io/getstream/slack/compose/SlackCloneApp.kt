package io.getstream.slack.compose

import android.app.Application
import io.getstream.chat.android.client.ChatClient
import io.getstream.chat.android.client.logger.ChatLogLevel
import io.getstream.chat.android.client.models.User
import io.getstream.chat.android.livedata.ChatDomain

class SlackCloneApp : Application() {

    override fun onCreate() {
        super.onCreate()
        setupStreamSdk()
        connectUser()
    }

    private fun setupStreamSdk() {
        val client = ChatClient.Builder("qx5us2v6xvmh", applicationContext)
            .logLevel(ChatLogLevel.ALL)
            .build()
        ChatDomain.Builder(client, applicationContext).build()
    }

    private fun connectUser() {
        ChatClient.instance().connectUser(
            user = User(
                id = "1f37e58d-d8b0-476a-a4f2-f8611e0d85d9",
                extraData = mutableMapOf(
                    "name" to "Jc",
                    "image" to "https://firebasestorage.googleapis.com/v0/b/stream-chat-internal.appspot.com/o/users%2FJc.png?alt=media",
                ),
            ),
            token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoiMWYzN2U1OGQtZDhiMC00NzZhLWE0ZjItZjg2MTFlMGQ4NWQ5In0.l3u9P1NKhJ91rI1tzOcABGh045Kj69-iVkC2yUtohVw"
        ).enqueue()
    }
}