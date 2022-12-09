package com.example.calendar_view_zadanie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import android.widget.TextView
import java.text.DateFormat
import java.util.Date

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var kalendarz = findViewById<CalendarView>(R.id.calendarView)
        var wyjazd = findViewById<Button>(R.id.button)
        var powrot = findViewById<Button>(R.id.button2)
        var wyjazdview = findViewById<TextView>(R.id.textView)
        var powrotview = findViewById<TextView>(R.id.textView2)
        var policz = findViewById<TextView>(R.id.button4)
        var policzview = findViewById<TextView>(R.id.textView3)

        kalendarz.minDate = System.currentTimeMillis()
        kalendarz.maxDate = System.currentTimeMillis(720)

        var data_odjazdu = mutableListOf<Int>(0,0,0)
        var data_powrotu= mutableListOf<Int>(0,0,0)
        var data = arrayListOf<Int>(0,0,0)
        kalendarz.setOnDateChangeListener() { CalendarView , i, i2, i3 ->
            data[0] = i
            data[1] = i2+1
            data[2] = i3

        }

        wyjazd.setOnClickListener {
            data_odjazdu[0] = data[0]
            data_odjazdu[1] = data[1]
            data_odjazdu[2] = data[2]
            wyjazdview.text = "Data wyjazdu:  "+data[0].toString()+"-"+data[1].toString()+"-"+data[2].toString();
        }
        powrot.setOnClickListener {
            data_powrotu[0] = data[0]
            data_powrotu[1] = data[1]
            data_powrotu[2] = data[2]
            powrotview.text = "Data powrotu:  "+data[0].toString()+"-"+data[1].toString()+"-"+data[2].toString();
        }
        policz.setOnClickListener {Int
            var temp1 = (data_powrotu[0]*360) + (data_powrotu[1]*30) + data_powrotu[2]
            var temp2 = (data_odjazdu[0]*360) + (data_odjazdu[1]*30) + data_odjazdu[2]
            var temp = temp1.toChar() - temp2.toChar()
            policzview.text = "Ilosc dni: "+temp.toString()
        }


    }
}