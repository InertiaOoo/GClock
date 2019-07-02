package com.ooo.deemo.ccclock

import android.app.AlarmManager
import android.content.Context
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.yydcdut.sdlv.SlideAndDragListView


import java.util.*

class MainActivity : AppCompatActivity() , View.OnClickListener{

    lateinit var alarmManager: AlarmManager
    internal var clockList: MutableList<ClockBean> = ArrayList()
    internal var calendar: Calendar = Calendar.getInstance()
    private var modeShare: SharedPreferences? = null

    //控件
    lateinit var bt_setClock: Button
    lateinit var lv_showClock: SlideAndDragListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager

        modeShare = getSharedPreferences("mode", Context.MODE_PRIVATE)

        clockList = ClockUtils.getClockBean(applicationContext) as MutableList<ClockBean>



    }

    fun initView() {
        bt_setClock = findViewById(R.id.bt_setClock)
        bt_setClock.setOnClickListener(this)

    }


    override fun onClick(v: View?) {
       when(v?.id) {
           R.id.bt_setClock -> {
               Toast.makeText(this, "", Toast.LENGTH_SHORT)
               calendar.setTimeInMillis(System.currentTimeMillis())
               var mHhour: Int = calendar.get(Calendar.HOUR_OF_DAY)
               var mMinute: Int = calendar.get(Calendar.MINUTE)
           }

       }
    }


    override fun onDestroy() {
        super.onDestroy()
    }
}
