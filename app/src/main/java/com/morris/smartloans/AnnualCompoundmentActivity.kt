package com.morris.smartloans

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.math.pow

class AnnualCompoundmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_annual_compoundment1)
        var LOANAMOUNT: EditText =findViewById(R.id.loanamount)
        var INTERESTRATE: EditText =findViewById(R.id.interestrate)
        var REPAYMENTPERIOD: EditText =findViewById(R.id.repaymentperriod)
        var CALCULATEBUTTON: Button =findViewById(R.id.calculatebutton)
        var MYRESULT: TextView =findViewById(R.id.totalrepaymentamount)


        CALCULATEBUTTON.setOnClickListener {

            var firsttText= LOANAMOUNT.text.toString()
            var secondText=INTERESTRATE.text.toString()
            var thirdText=REPAYMENTPERIOD.text.toString()



            if(firsttText.isEmpty()||secondText.isEmpty()||thirdText.isEmpty()){
                Toast.makeText(applicationContext, "Please enter all values", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            try {

                var firstNumber=firsttText.toDouble()
                var secondNumber=secondText.toDouble()
                var thirdNumber=thirdText.toDouble()



                fun accountafterinterest() = firstNumber * (1 + secondNumber / 100) .pow(thirdNumber)
                var COMPOUNDINTEREST=accountafterinterest()


                MYRESULT.text="The total amount to be repaid by the end of $thirdNumber years is $COMPOUNDINTEREST"

            }catch (e:Exception){
                Toast.makeText(applicationContext, "Enter valid input", Toast.LENGTH_SHORT).show()
            }
        }
    }
}