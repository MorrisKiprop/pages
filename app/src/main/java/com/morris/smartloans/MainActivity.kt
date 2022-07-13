package com.morris.smartloans

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnAnnual:Button=findViewById(R.id.btnAnnualCompoundment)
        val btnSemiAnnual:Button=findViewById(R.id.btnSemiAnnualCompoundment)
        val btnQuartely:Button=findViewById(R.id.btnQuartelyCompoundment)
        val btnMonthly:Button=findViewById(R.id.btnMonthlyCompoundment)

        btnAnnual.setOnClickListener {
            val intent= Intent(this,AnnualCompoundmentActivity::class.java)
            startActivity(intent)
        }
        btnSemiAnnual.setOnClickListener {
            val intent= Intent(this,SemiAnnualCompoundmentActivity::class.java)
            startActivity(intent)
        }
        btnQuartely.setOnClickListener {
            val intent= Intent(this,QuartelyCompoundmentActivity::class.java)
            startActivity(intent)
        }
        btnMonthly.setOnClickListener {
            val intent= Intent(this,MonthlyCompoundmentActivity::class.java)
            startActivity(intent)
        }
    }
}