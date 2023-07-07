package com.ameer.tickets_mobile.ui.details

import com.ameer.tickets_mobile.ui.base.BaseViewModel
import com.ameer.tickets_mobile.ui.details.composable.DetailsUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailsViewModel @Inject constructor() : BaseViewModel<DetailsUiState>(DetailsUiState()) {

}