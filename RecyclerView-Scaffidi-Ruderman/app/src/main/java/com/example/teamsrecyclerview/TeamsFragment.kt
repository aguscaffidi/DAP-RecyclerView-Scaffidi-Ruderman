package com.example.teamsrecyclerview

import adapter.TeamsAdapter
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import entities.TeamsRepository


class TeamsFragment : Fragment() {

    companion object {
        fun newInstance() = TeamsFragment()
    }

    private lateinit var viewModel: TeamsViewModel
    private lateinit var v : View
    private lateinit var recTeams : RecyclerView
    private var repository = TeamsRepository()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.teams_list_fragments, container, false)
        recTeams = v.findViewById(R.id.recTeams)
        return v
    }

    override fun onStart() {
        super.onStart()

        recTeams.setHasFixedSize(true)

        recTeams.layoutManager  = LinearLayoutManager(context)

        recTeams.adapter = TeamsAdapter(repository.getTeams()){ teams ->
            Snackbar.make(v, teams.name, Snackbar.LENGTH_SHORT).show()
        }
    }
}