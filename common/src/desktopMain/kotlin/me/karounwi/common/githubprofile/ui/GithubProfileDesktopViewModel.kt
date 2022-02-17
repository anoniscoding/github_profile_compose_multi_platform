package me.karounwi.common.githubprofile.ui

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch

class GithubProfileDesktopViewModel(delegate: GithubProfileViewModelImpl): GithubProfileViewModel by delegate  {
    init {
        provideScope(CoroutineScope(SupervisorJob() + Dispatchers.Main.immediate))
        getProfiles()
    }

    companion object {
        fun getInstance() = GithubProfileDesktopViewModel(GithubProfileViewModelImpl.getInstance())
    }
}