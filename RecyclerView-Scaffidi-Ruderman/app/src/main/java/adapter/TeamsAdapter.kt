package adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.teamsrecyclerview.R
import entities.Teams

class TeamsAdapter (
    var teamsList: MutableList <Teams>,
    var onClick : (Teams) -> Unit) :


    RecyclerView.Adapter<TeamsAdapter.TeamsHolder>(){

class TeamsHolder (v: View) : RecyclerView.ViewHolder(v) {
    private var view: View
    init {
        this.view = v
    }
    fun setName (title : String){
        var txtTitle : TextView = view.findViewById(R.id.TeamTitle)
        txtTitle.text = title
    }

    fun getView () : ConstraintLayout {
        return view.findViewById(R.id.teams_layout)
    }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamsHolder {
        val view =  LayoutInflater.from(parent.context).inflate(R.layout.item_teams,parent,false)
        return (TeamsHolder(view))
    }

    override fun getItemCount(): Int {
        return teamsList.size
    }

    override fun onBindViewHolder(holder: TeamsHolder, position: Int) {
    holder.setName(teamsList[position].name)
        holder.getView().setOnClickListener {
            onClick(teamsList[position])
        }
    }
}