package com.felix.retrofitkoin.data

class Repository(private val apiHelper: ApiHelper) {

    suspend fun getPopularMovies() = apiHelper.getPopularMovies()
}
//pusatnya data