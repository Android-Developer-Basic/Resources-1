package otus.gpb.appresources

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.time.LocalDate

class MainActivity : AppCompatActivity() {

    private lateinit var catsInHouse: TextView
    private lateinit var animalName: TextView
    private lateinit var weightOfCat: TextView
    private lateinit var bdOfCat: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        catsInHouse = findViewById(R.id.cats_in_house)
        setCatsInHouse()

        animalName = findViewById(R.id.animal_name)
        setAnimalName()

        weightOfCat = findViewById(R.id.cat_weight)
        setCatWeight()

        bdOfCat = findViewById(R.id.cat_birthday)
        setCatBd()
    }

    private fun setCatsInHouse() {
        catsInHouse.text = getString(R.string.cats_in_house, 25)
    }

    private fun setAnimalName() {
        animalName.text = getString(R.string.animal_name, "Cat", "Tom")
    }

    private fun setCatWeight() {
        weightOfCat.text = getString(R.string.cat_weight, 7.546534F)
    }

    private fun setCatBd() {
        bdOfCat.text = getString(
            R.string.cats_birthday,
            LocalDate.of(2007, 10, 17)
        )
    }
}