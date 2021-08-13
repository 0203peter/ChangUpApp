package com.example.jusochangcupapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter


class ViewPagerAdapter(private  val context : Context) : PagerAdapter(){


    private var layoutInflater : LayoutInflater? = null
    override fun isViewFromObject(view: View, `object`: Any): Boolean {

        val Image = arrayOf(
            R.drawable.ai,
            R.drawable.css,
            R.drawable.html
        )

        return view === 'object'
    }

    override fun getCount(): Int {
        return Image.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        layoutInflater =context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val v = layoutInflater!!.

        return super.instantiateItem(container, position)
    }

}