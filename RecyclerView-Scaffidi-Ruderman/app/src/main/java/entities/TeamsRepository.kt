package entities

class TeamsRepository {

    private var teamsList : MutableList<Teams> = mutableListOf()

    init{
        teamsList.add(Teams("Los Angeles Lakers","Western","California", "Kobe Bryant"))
        teamsList.add(Teams("Boston Celtics","Eastern","Massachusetts", "Bill Russel"))
        teamsList.add(Teams("Chicago Bulls","Eastern","Illinois", "Michael Jordan"))
        teamsList.add(Teams("Golden State Warriors","Western","California", "Stephen Curry"))
        teamsList.add(Teams("Philadelphia 76ers","Eastern","Pennsylvania", "Julius Erving"))
        teamsList.add(Teams("San Antonio Spurs","Western","Texas", "Tim Duncan"))
        teamsList.add(Teams("Milwaukee Bucks","Eastern","Wisconsin", "Kareem Abdul-Jabbar"))
        teamsList.add(Teams("Dallas Mavericks","Western","Texas", "Dirk Nowitzki"))
    }

    fun getTeams () : MutableList<Teams>{
        return teamsList
    }
}