package com.example.fauziw97.footballclub

import com.example.fauziw97.footballclub.api.ApiRepository
import com.example.fauziw97.footballclub.api.TheSportDBApi
import com.example.fauziw97.footballclub.model.LeagueResponse
import com.example.fauziw97.footballclub.model.TeamResponse
import com.google.gson.Gson
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class MainPresenter(private val view: MainView) {

    private val apiRepository = ApiRepository()
    private val gson = Gson()

    fun getTeamList(league: String?) {
        view.showLoading()
        doAsync {
            val data = gson.fromJson(apiRepository.doRequest(TheSportDBApi.getTeams(league)),
                    TeamResponse::class.java)

            uiThread {
                view.hideLoading()
                view.showTeamList(data.teams)
            }
        }
    }

    fun getLeagueList() {
        view.showLoading()
        doAsync {
            val data = gson.fromJson(apiRepository.doRequest(TheSportDBApi.getLeagues()),
                    LeagueResponse::class.java)

            uiThread {
                view.hideLoading()
                view.showLeagueList(data.leagues)
            }
        }
    }
}