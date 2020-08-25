package com.deepsiam.injection.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.deepsiam.features.groups.GroupsViewModel
import com.deepsiam.ViewModelFactory
import com.deepsiam.injection.ViewModelKey
import com.deepsiam.injection.scope.AppScoped
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    @AppScoped
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(GroupsViewModel::class)
    abstract fun bindGroupsViewModel(viewModel: GroupsViewModel): ViewModel
}