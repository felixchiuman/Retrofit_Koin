package com.felix.retrofitkoin.data

import com.felix.retrofitkoin.data.pojo.PopularMoviesResponse
import retrofit2.http.GET

interface ApiService {
    @GET("movie/popular")
    suspend fun getALLPopularMovies(): PopularMoviesResponse
}