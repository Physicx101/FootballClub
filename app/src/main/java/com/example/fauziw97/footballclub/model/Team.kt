package com.example.fauziw97.footballclub.model

data class Team(val idTeam: String?, val strTeam: String?, val strTeamBadge: String?)

data class TeamResponse(val teams: List<Team>)


