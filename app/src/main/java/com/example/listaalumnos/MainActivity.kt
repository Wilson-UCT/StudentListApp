package com.example.listaalumnos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listaAlumnos = ArrayList<Alumno>()
        listaAlumnos.add(Alumno("Juan", 22, R.drawable.avatar1))
        listaAlumnos.add(Alumno("María", 21, R.drawable.avatar2))

        recycler_view.layoutManager = LinearLayoutManager(this)
        val adapter = AlumnosAdapter(listaAlumnos)
        recycler_view.adapter = adapter
    }
}
