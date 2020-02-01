package com.bombadu.blippy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private val fragmentManager = supportFragmentManager
    private val mainFragment = MainFrag()
    val myList = mutableListOf<String>()
    val meatList = mutableListOf<String>()
    var theList = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.my_fragment, mainFragment)
        fragmentTransaction.commit()




        //Build List
        myList.add("Apple")
        myList.add("Banana")
        myList.add("Pear")
        myList.add("Strawberry")
        myList.add("Mango")
        myList.add("Tomato")


        meatList.add("Steak")
        meatList.add("Pork Chops")
        meatList.add("Ground Beef")
        meatList.add("Chicken")
        meatList.add("Ribs")
        meatList.add("Sausage")



    }

    fun getMyList(food: String): MutableList<String> {
        if(food == "Produce") {
            theList = myList
        } else {
            theList = meatList
        }

        return theList

    }




}
