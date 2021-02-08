package activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.concrete.R
import java.util.*


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        Objects.requireNonNull(supportActionBar)!!.hide()

        val buttonEnter = findViewById<Button>(R.id.button_enter)



        buttonEnter.setOnClickListener {
            val intent = Intent(applicationContext, AnnotationsActivity::class.java)

            startActivity(intent)
        }
    }

}