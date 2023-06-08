package com.example.tutorialrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tutorialrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private  var listapersonajes:MutableList<Personaje> = mutableListOf()
    private lateinit var recycler:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        listapersonajes.add(Personaje(("Naruto Uzumaki")))
        listapersonajes.add(Personaje(("Sasuke Uchiha")))
        listapersonajes.add(Personaje(("Personaje")))
        listapersonajes.add(Personaje(("Sakura Haruno")))
        listapersonajes.add(Personaje(("Sai")))
        listapersonajes.add(Personaje(("Hinata Hyūga")))
        listapersonajes.add(Personaje(("Kiba Inuzuka")))
        listapersonajes.add(Personaje(("Chōji Akimichi")))
        listapersonajes.add(Personaje(("Rock Lee")))

        establecerAdaptador()

    }

    private  fun establecerAdaptador(){
        recycler = binding.lista
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = RecyclerPersonaje(this, listapersonajes)
    }



}