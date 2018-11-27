package com.example.fauziw97.footballclub.model

data class League(val idLeague: String?, val strLeague: String?) {
    override fun toString(): String {
        return strLeague.toString()
    }
}

data class LeagueResponse(val leagues: List<League>)