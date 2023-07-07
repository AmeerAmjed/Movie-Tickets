package com.ameer.tickets_mobile.ui.base

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

interface BaseUiState
abstract class BaseViewModel<T : BaseUiState>(state: T): ViewModel() {

    protected val _state = MutableStateFlow(state)
    val state = _state.asStateFlow()


}