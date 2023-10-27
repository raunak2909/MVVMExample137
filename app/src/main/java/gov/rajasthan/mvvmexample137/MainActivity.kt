package gov.rajasthan.mvvmexample137

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import gov.rajasthan.mvvmexample137.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val maViewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]


        //var count = 0
        binding.txtCount.text = "${maViewModel.getCountValue()}"

        binding.btnInc.setOnClickListener {
            //count++
            maViewModel.incrementCount()
            binding.txtCount.text = "${maViewModel.getCountValue()}"
        }


    }
}