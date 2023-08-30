package nu.paheco.kotlinviewbindingdemo

/*
Remember to add ViewBinding to app build.gradle:
  android {
  ..
    buildFeatures {
        viewBinding true
    }
 */

import android.os.Bundle
import androidx.activity.ComponentActivity
import nu.paheco.kotlinviewbindingdemo.databinding.MainBinding

class MainActivity : ComponentActivity() {
    private lateinit var binding:MainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var btn = binding.button
        var txt = binding.textView
        txt.text = "Hello"

        btn.setOnClickListener() {
            txt.text = "OK"
        }
    }
}