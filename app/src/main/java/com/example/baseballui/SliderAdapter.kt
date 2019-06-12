package com.example.baseballui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.viewpager.widget.PagerAdapter

class SliderAdapter (var context:Context):PagerAdapter() {

    private var layoutInflater: LayoutInflater
    init {
        layoutInflater = LayoutInflater.from(context)
    }

    var slide_background:IntArray = intArrayOf(R.drawable.gradientintro1,R.drawable.gradientintro2,R.drawable.gradient)
    var slide_images:IntArray = intArrayOf(R.drawable.ic_baseball_intro1,R.drawable.ic_baseball_intro2,R.drawable.ic_baseball_intro3)
    var slide_headings = arrayOf(R.string.intro_bienvenido,R.string.intro_disfruta,R.string.intro_redsocial)
    var slide_descriptions = arrayOf(R.string.intro_bienvenido_des,R.string.intro_disfruta_des,R.string.intro_redsocial_des)


    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object` as (RelativeLayout)
    }

    override fun getCount(): Int {
        return slide_headings.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view = layoutInflater.inflate(R.layout.sli)
    }

}