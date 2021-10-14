package com.aashis.demoproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class HomeActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var buttonFarg: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        buttonFarg = findViewById(R.id.btnFrag)

        buttonFarg.setOnClickListener(this)


    }

    override fun onClick(view: View?) {
        if (view == buttonFarg) {

            loadFragment()
        }
    }


    private fun loadFragment() {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.frameLayoutForm, FragmentForm())
//        fragmentTransaction.replace(R.id.frameLayoutForm, FragmentForm())
//        fragmentTransaction.replace(R.id.frameLayoutForm, FragmentForm()).addToBackStack(null)
        fragmentTransaction.commit()
    }
}