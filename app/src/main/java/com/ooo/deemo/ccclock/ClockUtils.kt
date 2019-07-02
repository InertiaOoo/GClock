package com.ooo.deemo.ccclock

import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.invoke.ConstantCallSite
import java.lang.reflect.Type

/**
 * Author by Deemo, Date on 2019/7/1.
 * Have a good day
 */
object ClockUtils {
     var sp: SharedPreferences? = null
    val CLOCK_BEAN: String = "clockValue"
    fun setClockBean(ctx: Context,clockBeanList: List<ClockBean> ) {
        if (sp == null){
sp =ctx.getSharedPreferences("clockData",Context.MODE_PRIVATE)
        }
var editor: SharedPreferences.Editor = sp!!.edit()
var json: String = Gson().toJson(clockBeanList)
editor.putString(CLOCK_BEAN,json)
editor.apply()
    }


    fun getClockBean(ctx: Context): List<ClockBean> {
if (sp == null){
    sp =ctx.getSharedPreferences("clockData",Context.MODE_PRIVATE)
}
var json: String = sp!!.getString(CLOCK_BEAN,null)

        val type = object : TypeToken<List<ClockBean>>() {

        }.type
var arrayList: List<ClockBean> = Gson().fromJson(json,type)

        return arrayList
    }



}