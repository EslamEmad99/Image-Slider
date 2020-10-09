package eslam.emad.imageslider

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class BindingAdapter {

    companion object {
        @JvmStatic
        @BindingAdapter("imageResource")
        fun setImageResource(view: ImageView, imageUrl: String?) {
            val context = view.context
            val option = RequestOptions()
                .placeholder(R.drawable.white_background)
                .error(R.drawable.ic_launcher_background)
            Glide.with(context)
                .setDefaultRequestOptions(option)
                .load(imageUrl)
                .into(view)
        }
    }
}