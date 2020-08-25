package com.deepsiam.features.base

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject

abstract class BaseFragment<V: BaseViewModel<S>, S: BaseViewState>(open var viewModel: V): Fragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    protected open fun onBindViewModel() {
        observeState()
    }

    protected open fun onUnbindViewModel() {
        // Empty lifecycle function to be overridden
    }

    abstract fun updateUI(state: S)

    abstract fun attachClickListeners()

    abstract fun getLayoutResourceFile(): Int

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(getLayoutResourceFile(), container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        attachClickListeners()
    }

    override fun onResume() {
        super.onResume()
        onBindViewModel()
    }

    override fun onPause() {
        super.onPause()
        onUnbindViewModel()
    }

    @Suppress("UNCHECKED_CAST")
    private fun observeState() {
        viewModel.getState().observe(this, Observer { state -> updateUI(state as S) })
    }

}