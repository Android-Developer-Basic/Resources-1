package otus.gpb.appresources

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var catsInHouse: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        catsInHouse = findViewById(R.id.cats_in_house)
        setCatsInHouse()
    }

    private fun setCatsInHouse() {
        catsInHouse.text = getString(R.string.cats_in_house, 25)
    }
}