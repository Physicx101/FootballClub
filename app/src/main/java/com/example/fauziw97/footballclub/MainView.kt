package com.example.fauziw97.footballclub

import com.example.fauziw97.footballclub.model.League
import com.example.fauziw97.footballclub.model.Team

interface MainView {
    fun showLoading()
    fun hideLoading()
    fun showLeagueList(data: List<League>)
    fun showTeamList(data: List<Team>)
}