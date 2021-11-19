package com.delnortedevs.checknetwork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.delnortedevs.checknetwork.databinding.ActivityMainBinding
import com.delnortedevs.checknetwork.utils.NetworkHelper


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnConnection.setOnClickListener{

                if (NetworkHelper.isNetworkConnected(this)){
                    Log.d("NETWORKTEST","Is connected")
                }
                else {
                    Log.d("NETWORKTEST","Not connected")
                }
        }
    }
}