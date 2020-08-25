package com.deepsiam.injection.module

import com.deepsiam.core.services.groups.GroupsServiceImpl
import com.deepsiam.injection.scope.AppScoped
import com.deepsiam.shared.models.services.GroupsService
import dagger.Module
import dagger.Provides

@Module
class ServicesModule {
    @Provides
    @AppScoped
    fun provideGroupsService(groupsServiceImpl: GroupsServiceImpl): GroupsService =
        groupsServiceImpl
}