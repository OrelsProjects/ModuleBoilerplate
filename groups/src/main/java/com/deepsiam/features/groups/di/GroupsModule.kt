package com.deepsiam.features.groups.di

import com.deepsiam.features.groups.AddGroupFragment
import com.deepsiam.features.groups.GroupsActivity
import com.deepsiam.injection.providers.BaseResourceProvider
import com.deepsiam.injection.providers.ResourceProvider
import com.deepsiam.injection.scope.ActivityScoped
import com.deepsiam.injection.scope.FragmentScoped
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module(includes = [GroupsModule.GroupsAbstractModule::class])
class GroupsModule {
    @ActivityScoped
    @Provides
    internal fun provideResourceProvider(context: GroupsActivity): BaseResourceProvider {
        return ResourceProvider(context)
    }

    @Module
    interface GroupsAbstractModule {
        @FragmentScoped
        @ContributesAndroidInjector
        fun addGroupsFragment(): AddGroupFragment
    }
}
