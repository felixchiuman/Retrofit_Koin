package com.felix.retrofitkoin.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.felix.retrofitkoin.data.Repository
import com.felix.retrofitkoin.data.Resource
import com.felix.retrofitkoin.data.pojo.PopularMoviesResponse
import kotlinx.coroutines.launch
import java.lang.Exception

class MainActivityViewModel(private val repository: Repository):ViewModel() {
    private val _movies = MutableLiveData<Resource<PopularMoviesResponse>>()
    val movies: LiveData<Resource<PopularMoviesResponse>>
    get() = _movies

    fun getAllPopularMovies(){
        viewModelScope.launch {
            _movies.postValue(Resource.loading())
            try {
                _movies.postValue(Resource.success(repository.getPopularMovies()))
            }catch (expection: Exception){
                _movies.postValue(Resource.error(expection.message ?: "Error Occured"))
            }
        }
    }


}