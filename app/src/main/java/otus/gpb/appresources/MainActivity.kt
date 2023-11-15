package otus.gpb.appresources

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import java.time.LocalDate

class MainActivity : AppCompatActivity() {

    private lateinit var catsInHouse: TextView
    private lateinit var animalName: TextView
    private lateinit var weightOfCat: TextView
    private lateinit var bdOfCat: TextView
    private lateinit var catName: TextView
    private lateinit var catCount: TextView
    private lateinit var vector: ImageView

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

        catName = findViewById(R.id.cat_name)
        setArrayElement()

        catCount = findViewById(R.id.cat_count)
        fillCatCount()

        vector = findViewById(R.id.vector)
        setImage()
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

    private fun setArrayElement() {
        catName.text = getString(
            R.string.cat_name_prefix,
            resources.getStringArray(R.array.cat_names)[1]
        )
    }

    private fun fillCatCount() {
        val counts = listOf(0, 1, 3, 4, 5, 10, 102)
        catCount.text = counts.joinToString("\n") { i ->
            resources.getQuantityString(R.plurals.cats_quantity, i, i)
        }
    }

    private fun setImage() {
        val drawable = ContextCompat.getDrawable(this, R.drawable.satisfied)
        vector.setImageDrawable(drawable)
    }
}