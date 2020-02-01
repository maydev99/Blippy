package com.bombadu.blippy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment.*

class MainFrag : Fragment(){

    lateinit var myAdapter: ArrayAdapter<String>
    lateinit var listView : ListView
    lateinit var activity : MainActivity
    lateinit var fragList : MutableList<String>
    var isProduceList = true

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment, container, false)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listView = view.findViewById(R.id.list_view)
        activity = context as MainActivity
        fragList = activity.getMyList("Produce")
        myAdapter = ArrayAdapter(view.context, android.R.layout.simple_list_item_1, fragList)
        listView.adapter = myAdapter

        title_text_view.setOnClickListener {
            if (isProduceList){
                title_text_view.text = "Meat"
                fragList = activity.getMyList("Meat")
                isProduceList = false
                myAdapter.notifyDataSetChanged()



            } else {
                title_text_view.text = "Produce"
                fragList = activity.getMyList("Produce")
                isProduceList = true
                myAdapter.notifyDataSetChanged()
                



            }
            println("LIST:: $fragList")


        }






    }


}