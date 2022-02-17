package com.oozou.common.githubprofile.ui

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.StateFlow
import com.oozou.common.util.DataState

interface GithubProfileViewModel {
   val dataStates: StateFlow<DataState<GithubProfileViewData>>
   fun provideScope(coroutineScope: CoroutineScope)
   fun getProfiles()
}