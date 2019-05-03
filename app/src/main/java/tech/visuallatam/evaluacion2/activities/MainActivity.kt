package tech.visuallatam.evaluacion2.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.fragment_static.*
import tech.visuallatam.evaluacion2.R

class MainActivity : AppCompatActivity() {

    lateinit var colors : ArrayList<Int>
    var count = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btn_next.setOnClickListener {

        }

        btn_previous.setOnClickListener {

        }
    }






}
