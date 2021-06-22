package uz.texnopos.lesson4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sanlar()
        znak()
    }



    fun sanlar() {
        var a = Random.nextInt(1, 10)
        var b = Random.nextInt(1, 10)
        san1.text = a.toString()
        san2.text = b.toString()
    }

    fun znak() {
        var array = arrayListOf(button1, button2, button3, button4)
        array.shuffle()
        var c = Random.nextInt(0, 4)
        when (c) {
            0 -> {
                znak.text = "+"
                array[0].text =
                    (san1.text.toString().toInt() + san2.text.toString().toInt()).toString()
                array[1].text =
                    (array[0].text.toString().toInt() + 2).toString()
                array[2].text =
                    (array[0].text.toString().toInt() - 1).toString()
                array[3].text =
                    (array[0].text.toString().toInt() + 3).toString()
            }
            1 -> {
                znak.text = "/"
                array[0].text =
                    (san1.text.toString().toInt() / san2.text.toString().toInt()).toString()
                array[1].text =
                    (array[0].text.toString().toInt() + 2).toString()
                array[2].text =
                    (array[0].text.toString().toInt() - 1).toString()
                array[3].text =
                    (array[0].text.toString().toInt() + 3).toString()
            }
            2 -> {
                znak.text = "-"
                array[0].text =
                    (san1.text.toString().toInt() - san2.text.toString().toInt()).toString()
                array[1].text =
                    (array[0].text.toString().toInt() + 2).toString()
                array[2].text =
                    (array[0].text.toString().toInt() - 1).toString()
                array[3].text =
                    (array[0].text.toString().toInt() + 3).toString()
            }
            3 -> {
                znak.text = "*"
                array[0].text =
                    (san1.text.toString().toInt() * san2.text.toString().toInt()).toString()
                array[1].text =
                    (array[0].text.toString().toInt() + 2).toString()
                array[2].text =
                    (array[0].text.toString().toInt() - 1).toString()
                array[3].text =
                    (array[0].text.toString().toInt() + 3).toString()
            }
        }

        button1.setOnClickListener {
            if (button1.text == array[0].text) {
                val intent = Intent(this, Tick::class.java)
                startActivity(intent)

            } else {
                val intent = Intent(this, Kres::class.java)
                startActivity(intent)
            }
        }
        button2.setOnClickListener {
            if (button2.text == array[0].text) {
                val intent = Intent(this, Tick::class.java)
                startActivity(intent)
            } else {
                val intent = Intent(this, Kres::class.java)
                startActivity(intent)
            }
        }
        button3.setOnClickListener {
            if (button3.text == array[0].text) {
                val intent = Intent(this, Tick::class.java)
                startActivity(intent)
            } else {
                val intent = Intent(this, Kres::class.java)
                startActivity(intent)
            }
        }
        button4.setOnClickListener {
            if (button4.text == array[0].text) {
                val intent = Intent(this, Tick::class.java)
                startActivity(intent)
            } else {
                val intent = Intent(this, Kres::class.java)
                startActivity(intent)
            }
        }
    }
}