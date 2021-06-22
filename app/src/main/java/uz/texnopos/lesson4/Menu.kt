package uz.texnopos.lesson4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_menu.*

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        start.setOnClickListener {
            if (e1.text.isEmpty()) {
                e1.error = "Введите имя!"
            }else if (e1.text.length<3){
                e1.error ="Не менее 3 букв"
            }else{
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}