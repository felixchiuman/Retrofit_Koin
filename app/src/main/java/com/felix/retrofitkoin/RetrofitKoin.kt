package com.felix.retrofitkoin

import android.app.Application
import com.felix.retrofitkoin.di.networkModule
import com.felix.retrofitkoin.di.repositoryModule
import com.felix.retrofitkoin.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class RetrofitKoin: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@RetrofitKoin)
            modules(
                listOf(
                    networkModule,
                    repositoryModule,
                    viewModelModule
                )
            )
        }
    }

}