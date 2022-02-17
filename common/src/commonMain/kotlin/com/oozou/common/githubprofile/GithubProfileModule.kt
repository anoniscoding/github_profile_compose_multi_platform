package com.oozou.common.githubprofile

import com.oozou.common.githubprofile.data.remote.GithubService
import com.oozou.common.githubprofile.data.repository.GithubRepositoryImpl
import com.oozou.common.githubprofile.domain.contract.GithubRepository
import com.oozou.common.githubprofile.domain.usecase.GetProfilesUseCase
import com.oozou.common.util.NetworkModule

object GithubProfileModule {
    private fun getGithubRepository(): GithubRepository {
        return GithubRepositoryImpl(NetworkModule.getRetrofit().create(GithubService::class.java))
    }

    fun getProfileUseCase(): GetProfilesUseCase {
        return GetProfilesUseCase(getGithubRepository())
    }
}