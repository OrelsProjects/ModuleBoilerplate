package com.deepsiam.features.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.deepsiam.shared.models.interactors.GroupsInteractor
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job

abstract class BaseViewModel<S : BaseViewState>(
    val groupsInteractor: GroupsInteractor,
    private var viewState: S
) : ViewModel() {

    protected val stateLiveData = MutableLiveData<BaseViewState>()

    private val networkJob = Job()
    protected val networkScope = CoroutineScope(Dispatchers.IO + networkJob)

    fun getState(): MutableLiveData<BaseViewState> {
        return this.stateLiveData
    }

    fun updateUI() {
        stateLiveData.postValue(viewState)
    }
}