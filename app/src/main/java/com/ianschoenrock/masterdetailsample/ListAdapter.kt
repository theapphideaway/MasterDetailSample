package com.ianschoenrock.masterdetailsample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class ListAdapter(private val list: ArrayList<String>, private val activity: FragmentActivity, private val twoPane: Boolean): RecyclerView.Adapter<ListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListAdapter.ViewHolder {
        val inflater = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ViewHolder(inflater)
    }

    override fun onBindViewHolder(holder: ListAdapter.ViewHolder, position: Int) {
        holder.setData(list[position])
        holder.view.setOnClickListener {
            val fragment = DetailFragment()
            fragment.item = list[position]
            if(twoPane) {
                activity.supportFragmentManager.beginTransaction()
                    .replace(R.id.tablet_detail_container, fragment)
                    .commit()
            }
            else {
                activity.supportFragmentManager.beginTransaction()
                    .addToBackStack("")
                    .replace(R.id.main_fragment_container, fragment)
                    .commit()
            }

        }
    }

    override fun getItemCount(): Int = list.count()

    inner class ViewHolder(val view: View): RecyclerView.ViewHolder(view) {
        fun setData(item: String){
            view.list_item_tv.text = item
        }
    }
}