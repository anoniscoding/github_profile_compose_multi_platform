package com.oozou.common.githubprofile.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

class GithubProfileAndroidViewModel(delegate: GithubProfileViewModelImpl): ViewModel(), GithubProfileViewModel by delegate  {
    init {
        provideScope(viewModelScope)
        getProfiles()
    }

    companion object {
        fun getInstance() = GithubProfileAndroidViewModel(GithubProfileViewModelImpl.getInstance())
    }
}