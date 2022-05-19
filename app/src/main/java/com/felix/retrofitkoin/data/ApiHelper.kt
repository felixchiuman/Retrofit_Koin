package com.felix.retrofitkoin.data

class ApiHelper(val apiService: ApiService) {

    suspend fun getPopularMovies() = apiService.getALLPopularMovies()
}

//jembatan api service ke repository