package com.example.calendar_view_zadanie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var kalendarz = findViewById<CalendarView>(R.id.calendarView)
        var wyjazd = findViewById<Button>(R.id.button)
        var powrot = findViewById<Button>(R.id.button2)
        var wyjazdview = findViewById<TextView>(R.id.textView)
        var powrotview = findViewById<TextView>(R.id.textView2)

        kalendarz.minDate = System.currentTimeMillis()
        kalendarz.maxDate = System.currentTimeMillis() + (kalendarz.maxDate - System.currentTimeMillis())



    }
}