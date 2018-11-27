package com.example.fauziw97.footballclub.api

import com.example.fauziw97.footballclub.BuildConfig

object TheSportDBApi {

    fun getLeagues(): String {
        return "${BuildConfig.BASE_URL}${BuildConfig.TSDB_API_KEY}" +
                "/all_leagues.php"
    }

    fun getTeams(leagueId: String?): String {
        return "${BuildConfig.BASE_URL}${BuildConfig.TSDB_API_KEY}" +
                "/search_all_teams.php?l=$leagueId"
    }
}
