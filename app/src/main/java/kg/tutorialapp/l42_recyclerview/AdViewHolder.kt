package kg.tutorialapp.l42_recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdViewHolder(itemView: View): BaseViewHolder<Any>(itemView) {



    override  fun bind(item: Any){
        item as String
        itemView.run {
            val tvUrl = findViewById<TextView>(R.id.tv_url)
            tvUrl.text = item
        }
    }

    companion object{
        fun create(parent: ViewGroup): AdViewHolder{
            val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_ad_viewholder, parent, false)
            return AdViewHolder(view)
        }
    }
}