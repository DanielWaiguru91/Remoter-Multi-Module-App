package com.danielwaiguru.remoter.dashboard.di

import com.danielwaiguru.remoter.core.di.coreLibModules
import com.danielwaiguru.remoter.dashboard.presentation.views.dashboard.DashBoardViewModel
import org.koin.dsl.module

val viewModelModules = module {
    single { DashBoardViewModel(get(), get()) }
}
val appModules = listOf(viewModelModules) + coreLibModules