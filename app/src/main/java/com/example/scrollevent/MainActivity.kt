package com.example.scrollevent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.example.scrollevent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), SwipeRefreshLayout.OnRefreshListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_main)

        binding.refreshLayout.setOnRefreshListener {
            onRefresh()
        }


    }

    override fun onRefresh() {
        Toast.makeText(this, "Refresh Activity", Toast.LENGTH_SHORT ).show()
        binding.refreshLayout.isRefreshing = false
    }

}
