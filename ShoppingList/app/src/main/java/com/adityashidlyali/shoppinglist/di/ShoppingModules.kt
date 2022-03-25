package com.adityashidlyali.shoppinglist.di

import com.adityashidlyali.shoppinglist.db.ShoppingDatabase
import com.adityashidlyali.shoppinglist.repositories.ShoppingRepository
import com.adityashidlyali.shoppinglist.viewmodels.ShoppingViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val ShoppingModule: Module = module {
    single { ShoppingDatabase(get()) }
    single { ShoppingRepository(get()) }
    viewModel { ShoppingViewModel(get()) }
}