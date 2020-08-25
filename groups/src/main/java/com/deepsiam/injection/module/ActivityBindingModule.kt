package com.deepsiam.injection.module

import com.deepsiam.features.groups.GroupsActivity
import com.deepsiam.features.groups.di.GroupsModule
import com.deepsiam.injection.scope.ActivityScoped
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = [GroupsModule::class])
    internal abstract fun groupsActivity() : GroupsActivity
}