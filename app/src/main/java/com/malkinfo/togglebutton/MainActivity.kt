package com.malkinfo.togglebutton

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout
import android.widget.ToggleButton
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    private lateinit var reLayout: RelativeLayout
    private lateinit var toggleBtn:ToggleButton

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /**set find Id*/
        reLayout = findViewById(R.id.relativeL)

        reLayout.setBackgroundResource(R.drawable.light__02)

        toggleBtn = findViewById(R.id.toggleBtn)

        /**set Button view*/
        toggleBtn.setOnClickListener { clickButton() }
    }


    @RequiresApi(Build.VERSION_CODES.M)
    private fun clickButton() {
        /**set click Button*/
        if (toggleBtn.isChecked){
            reLayout.setBackgroundResource(R.drawable.light__03)
            toggleBtn.setTextColor(getColor(R.color.green))

        }
        else{
            reLayout.setBackgroundResource(R.drawable.light__02)
            toggleBtn.setTextColor(getColor(R.color.red))
        }
    }
    /**ok now run it*/


}