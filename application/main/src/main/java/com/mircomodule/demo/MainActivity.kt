package com.mircomodule.demo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.eastwood.demo.library.utils.Utils

/**
 * Created by pro on 19年12月16日.
 * Comment：
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = Utils.getText()
        val textView = findViewById<TextView>(R.id.text)
        textView.text = text
    }
}