package kimura.norihiko.techacademy.calcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)

    }

    override fun onClick(v: View) {

        if (editText1.text.toString() != "" && editText2.text.toString() != "") {
            val num1 = editText1.text.toString().toDouble()
            val num2 = editText2.text.toString().toDouble()

            when (v.id) {
                R.id.button1 -> sumCalc(num1, num2)
                R.id.button2 -> differenceCalc(num1, num2)
                R.id.button3 -> productCalc(num1, num2)
                R.id.button4 -> quotientCalc(num1, num2)
            }

        }

    }


    private fun sumCalc(num1: Double, num2: Double) {
        val result = num1 + num2
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("VALUE", result)
        startActivity(intent)
    }

    private fun differenceCalc(num1: Double, num2: Double) {
        val result = num1 - num2
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("VALUE", result)
        startActivity(intent)
    }

    private fun productCalc(num1: Double, num2: Double) {
        val result = num1 * num2
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("VALUE", result)
        startActivity(intent)
    }

    private fun quotientCalc(num1: Double, num2: Double) {
        val result = num1 / num2
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("VALUE", result)
        startActivity(intent)
    }


}