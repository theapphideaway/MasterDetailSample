package com.ianschoenrock.masterdetailsample

import android.os.Bundle
import android.text.Layout
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.core.widget.NestedScrollView
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_list.view.*

class ListFragment : Fragment() {

    private val countries = arrayListOf("United States", "Canada", "Mexico", "Norway", "Sweeden", "Finland", "Russia", "France", "Germany", "Spain")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         return inflater.inflate(R.layout.fragment_list, container, false).apply {
             var twoPane = false
             main_list_rv.layoutManager = LinearLayoutManager(requireContext())
             if(findViewById<FrameLayout>(R.id.tablet_detail_container) != null){
                 twoPane = true
             }
             main_list_rv.adapter = ListAdapter(countries, requireActivity(), twoPane)
         }
    }
}