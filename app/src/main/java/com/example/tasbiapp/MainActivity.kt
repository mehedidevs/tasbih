package com.example.tasbiapp

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tasbiapp.databinding.TasbiBinding
import com.example.tasbiapp.ui.theme.TasbiAppTheme

class MainActivity : ComponentActivity() {

    lateinit var binding: TasbiBinding
    lateinit var CounterTv: TextView
    lateinit var increasebtn: TextView
    lateinit var Resetbtn: TextView
    lateinit var Dcrease: TextView

    val viewmodel: tasbi by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = TasbiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewmodel._livescore.observe(this){
            binding.counterTv.text = "$it"
        }

        CounterTv = findViewById(R.id.counterTv)
        increasebtn = findViewById(R.id.increasebtn)
        Resetbtn = findViewById(R.id.resetbtn)
        Dcrease = findViewById(R.id.dcrease)

        increasebtn.setOnClickListener{
            viewmodel.increase()
        }
        Resetbtn.setOnClickListener{
            viewmodel.reset()
        }
        Dcrease.setOnClickListener{
            viewmodel.Dcrease()
        }
        Log.d("TAG","onCreate: ")
    }
    override fun onStart() {
        super.onStart()
        Log.d("TAG","onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG","onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG","onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAG","onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAG","onDestroy: ")
    }
}
