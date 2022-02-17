package me.karounwi.common.githubprofile.ui

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.StateFlow
import me.karounwi.common.util.DataState

interface GithubProfileViewModel {
   val dataStates: StateFlow<DataState<GithubProfileViewData>>
   fun provideScope(coroutineScope: CoroutineScope)
   fun getProfiles()
}