package eslam.emad.imageslider

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType
import com.smarteist.autoimageslider.SliderAnimations
import com.smarteist.autoimageslider.SliderView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = ArrayList<SliderItem>()
        list.add(SliderItem("https://images.pexels.com/photos/2929246/pexels-photo-2929246.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500","Image 1"))
        list.add(SliderItem("https://images.pexels.com/photos/2983126/pexels-photo-2983126.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500","Image 2"))
        list.add(SliderItem("https://images.pexels.com/photos/5333441/pexels-photo-5333441.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940","Image 3"))
        list.add(SliderItem("https://images.pexels.com/photos/4333554/pexels-photo-4333554.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940","Image 4"))
        list.add(SliderItem("https://images.pexels.com/photos/2686045/pexels-photo-2686045.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940","Image 5"))
        list.add(SliderItem("https://images.pexels.com/photos/4796777/pexels-photo-4796777.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500","Image 6"))

        val sliderView: SliderView = findViewById(R.id.imageSlider)

        val adapter = SliderAdapterExample(this)
        adapter.renewItems(list)

        sliderView.setSliderAdapter(adapter)

        sliderView.setIndicatorAnimation(IndicatorAnimationType.SCALE) //set indicator animation by using IndicatorAnimationType. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.ZOOMOUTTRANSFORMATION)
        sliderView.autoCycleDirection = SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH
        sliderView.indicatorSelectedColor = Color.WHITE
        sliderView.indicatorUnselectedColor = Color.GRAY
    }
}