package otus.gpb.appresources

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var catsInHouse: TextView
    private lateinit var animalName: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        catsInHouse = findViewById(R.id.cats_in_house)
        setCatsInHouse()

        animalName = findViewById(R.id.animal_name)
        setAnimalName()
    }

    private fun setCatsInHouse() {
        catsInHouse.text = getString(R.string.cats_in_house, 25)
    }

    private fun setAnimalName() {
        animalName.text = getString(R.string.animal_name, "Cat", "Tom")
    }
}