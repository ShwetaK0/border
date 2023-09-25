package com.cscorner.border

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val spinner=findViewById<Spinner>(R.id.spinner_year)
        val data= arrayOf("2001","2005","2010","2015")
        val adapterView= ArrayAdapter(this,R.layout.spinner,data)
        spinner.adapter=adapterView

        val spinner2=findViewById<Spinner>(R.id.spinner_sex)
        val data2= arrayOf("Male","Female","Transgender")
        val adapter= ArrayAdapter(this,R.layout.spinner,data2)
        spinner2.adapter=adapter

        val spinner3=findViewById<Spinner>(R.id.spin_country)
        val data3= arrayOf("India","USA","Nepal")
        val adapter3= ArrayAdapter(this,R.layout.spinner,data3)
        spinner3.adapter=adapter3



    }
}