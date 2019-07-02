package com.ooo.deemo.ccclock

import android.content.Context
import android.graphics.Canvas
import android.support.v7.widget.RecyclerView
import android.util.AttributeSet

/**
 * Author by Deemo, Date on 2019/7/2.
 * Have a good day
 */
class ScrollPickerView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyle: Int = 0): RecyclerView(context, attrs, defStyle) {
    private val mContext: Context = context

    init { }

    override fun onMeasure(widthSpec: Int, heightSpec: Int) {
        super.onMeasure(widthSpec, heightSpec)
    }

    override fun onDraw(c: Canvas?) {
        super.onDraw(c)

    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        initPaint()
    }

    fun initPaint() {

        }
}