package eslam.emad.imageslider

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.smarteist.autoimageslider.SliderViewAdapter
import eslam.emad.imageslider.databinding.ImageSliderLayoutItemBinding

class SliderAdapterExample(private val context: Context) :
    SliderViewAdapter<SliderAdapterExample.SliderAdapterVH>() {

    private var mSliderItems: ArrayList<SliderItem> = ArrayList()

    fun renewItems(sliderItems: ArrayList<SliderItem>) {
        mSliderItems = sliderItems
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup): SliderAdapterVH {
        val binding: ImageSliderLayoutItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.image_slider_layout_item,
            parent, false
        )
        return SliderAdapterVH(binding)
    }

    override fun onBindViewHolder(viewHolder: SliderAdapterVH, position: Int) {
        viewHolder.itemBinding.sliderItem = mSliderItems[position]
    }

    override fun getCount(): Int {
        return mSliderItems.size
    }

    class SliderAdapterVH(var itemBinding: ImageSliderLayoutItemBinding) :
        ViewHolder(itemBinding.root)
}