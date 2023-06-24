package com.example.sample10activitylifecycle

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.sample10activitylifecycle.databinding.ActivityMainBinding
import com.example.sample10activitylifecycle.databinding.ActivitySecondBinding
import kotlin.random.Random

class SecondActivity : AppCompatActivity() {

    private val TAG: String = "SecondActivityLC ${Random.nextInt(0, 100)}"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d(TAG, "onCreate")

        ActivitySecondBinding.inflate(layoutInflater,null,false)
            .also { setContentView(it.root) }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }
}
