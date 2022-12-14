package com.example.calendar_view_zadanie

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import androidx.annotation.RequiresApi
import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import android.widget.TextView
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.ZoneId
import java.util.Date
import kotlin.math.absoluteValue

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var kalendarz = findViewById<CalendarView>(R.id.calendarView)
        var wyjazd = findViewById<Button>(R.id.button)
        var powrot = findViewById<Button>(R.id.button2)
        var wyjazdview = findViewById<TextView>(R.id.textView)
        var powrotview = findViewById<TextView>(R.id.textView2)
        var policzview = findViewById<TextView>(R.id.textView3)

        kalendarz.minDate = System.currentTimeMillis()
        kalendarz.maxDate = LocalDate.now().plusYears(2).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli()

        var data_odjazdu = mutableListOf<Int>(0,0,0)
        var data_powrotu= mutableListOf<Int>(0,0,0)
        var data = arrayListOf<Int>(czas(kalendarz.date)[0],czas(kalendarz.date)[1],czas(kalendarz.date)[2])
        kalendarz.setOnDateChangeListener() { CalendarView , i, i2, i3 ->
            data[0] = i
            data[1] = i2+1
            data[2] = i3

        }

        wyjazd.setOnClickListener {
            data_odjazdu[0] = data[0]
            data_odjazdu[1] = data[1]
            data_odjazdu[2] = data[2]
            wyjazdview.text = "Data wyjazdu:  "+data[0].toString()+"/"+data[1].toString()+"/"+data[2].toString();
        }
        powrot.setOnClickListener {
            data_powrotu[0] = data[0]
            data_powrotu[1] = data[1]
            data_powrotu[2] = data[2]
            powrotview.text = "Data powrotu:  "+data[0].toString()+"/"+data[1].toString()+"/"+data[2].toString();

            if (data_odjazdu[0] != 0 && data_powrotu[0] != 0)
                if(data_odjazdu[0] > data_powrotu[0] || data_odjazdu[2] > data_powrotu[2]  && data_odjazdu[1] == data_powrotu[1])
                    policzview.text = "Nie mo??esz wyjecha?? p????niej ni?? wr??cisz!"
                else
                    policz(data_odjazdu, data_powrotu, policzview)
        }
    }
}

fun czas(milli : Long) : List<Int>
{
    val date = Date(milli)
    val formatter = SimpleDateFormat("yyyy/MM/dd")
    val formattedDate = formatter.format(date)
    val ans = formattedDate.split("/").map { it.toInt() }
    return ans;
}

fun policz(data_powrotu : MutableList<Int>, data_odjazdu : MutableList<Int>, policzview : TextView)
{   var data1 = (data_powrotu[0]*360) + (data_powrotu[1]*30) + data_powrotu[2]
    var data2 = (data_odjazdu[0]*360) + (data_odjazdu[1]*30) + data_odjazdu[2]
    var datacalkowita = data1.toChar() - data2.toChar()
    policzview.text = "Ilosc dni: " +datacalkowita.absoluteValue.toString()}