package com.juanje1.feedmemvvm.base

import androidx.lifecycle.ViewModel
import com.juanje1.feedmemvvm.injection.component.DaggerViewModelInjector
import com.juanje1.feedmemvvm.injection.component.ViewModelInjector
import com.juanje1.feedmemvvm.injection.module.NetworkModule
import com.juanje1.feedmemvvm.ui.post.PostListViewModel

abstract class BaseViewModel: ViewModel(){
    private val injector: ViewModelInjector = DaggerViewModelInjector
        .builder()
        .networkModule(NetworkModule)
        .build()

    init {
        inject()
    }

    /**
     * Injects the required dependencies
     */
    private fun inject() {
        when (this) {
            is PostListViewModel -> injector.inject(this)
        }
    }
}