package com.deepsiam.injection.component

import com.deepsiam.Application
import com.deepsiam.injection.module.*
import com.deepsiam.injection.scope.AppScoped
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@AppScoped
@Component(
    modules = [
        AppModule::class,
        ActivityBindingModule::class,
        AndroidSupportInjectionModule::class,
        ViewModelModule::class,
        ViewStateModule::class,
        InteractorsModule::class,
        ServicesModule::class
    ]
)
interface AppComponent : AndroidInjector<Application> {
    override fun inject(application: Application)
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}