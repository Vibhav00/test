package com.example.coroutinetest

import android.app.Application
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.example.coroutinetest.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread
import kotlin.system.measureNanoTime

class MainActivity : AppCompatActivity() {
    lateinit var activityMainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

//        activityMainBinding.btnMain.setOnClickListener {
//            lifecycleScope.launch (Dispatchers.Default){
//                Log.e("vibhav",coroutineContext.toString())
//            }

//            checkTwoCoroutines()
//        }



        val k= "this is the line from the fork  "







//        val intent = Intent(this, SecondActivity::class.java)
//
//        GlobalScope.launch {
//            delay(3003)
//            val TAG = "vibhav"
//            while (true) {
//
//                delay(1000)
////                Toast.makeText(Context, "from main activity", Toast.LENGTH_SHORT).show()
//                Log.e(TAG,"from main activity")
//            }
//        }
//
//        this.startActivity(intent)
    }

    override fun onResume() {
        super.onResume()

//        runBlocking {
//            Toast.makeText(this@MainActivity,"called from main thread ",Toast.LENGTH_SHORT).show()
//            activityMainBinding.btnMain.visibility = View.GONE
//            delay(2000)
//            activityMainBinding.btnMain.visibility = View.VISIBLE
//
//        }

    }

    private fun checkTwoCoroutines() {
//        lifecycleScope.launch {
//            Log.e("thisinew", "from coroutine ")
//            val time = measureNanoTime {
//                val f=async {
//                    apiCall(1)
//                }
//                val g = async {
//                    apiCall(2)
//                }
//                f.await()
//                g.await()
//
//            }
//            Log.e("thisinew", "total time = ${time} ")
//        }
    }

    suspend fun apiCall(no: Int) {
        delay(2000)
        Log.e("thisinew", "got the respose from api ${no}")
    }
}
