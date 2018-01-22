package net.buildbox.sample.buildbox_textview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val messageView: TextView = findViewById(R.id.message_view)
        messageView.text = "サンプルメッセージ表示"
    }
}
