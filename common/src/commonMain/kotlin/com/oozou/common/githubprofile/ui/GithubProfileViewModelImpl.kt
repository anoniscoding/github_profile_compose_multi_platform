package com.oozou.common.githubprofile.ui

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import com.oozou.common.githubprofile.GithubProfileModule
import com.oozou.common.githubprofile.domain.usecase.GetProfilesUseCase
import com.oozou.common.util.DataState
import com.oozou.common.util.Event

class GithubProfileViewModelImpl constructor(private val getProfilesUseCase: GetProfilesUseCase): GithubProfileViewModel {
    private val _dataStates: MutableStateFlow<DataState<GithubProfileViewData>> = MutableStateFlow(DataState.Success(null))
    override val dataStates: StateFlow<DataState<GithubProfileViewData>> = _dataStates

    private lateinit var scope: CoroutineScope

    override fun provideScope(coroutineScope: CoroutineScope) {
        scope = coroutineScope
    }

    override fun getProfiles() {
        scope.launch {
            val currentViewData = _dataStates.value.toData()
            try {
                _dataStates.value = DataState.Loading(currentViewData)
                val profiles = getProfilesUseCase()
                _dataStates.value = DataState.Success(GithubProfileViewData(profiles))
            } catch (exception: Exception) {
                _dataStates.value = DataState.Error(currentViewData, Event(exception))
            }
        }
    }

    companion object {
        fun getInstance(): GithubProfileViewModelImpl {
            return GithubProfileViewModelImpl(GithubProfileModule.getProfileUseCase())
        }
    }
}