package com.felix.retrofitkoin.di

import com.felix.retrofitkoin.ui.MainActivityViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val viewModelModule = module {
    viewModelOf(::MainActivityViewModel)
}
