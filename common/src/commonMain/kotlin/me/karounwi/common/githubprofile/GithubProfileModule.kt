package me.karounwi.common.githubprofile

import me.karounwi.common.githubprofile.data.remote.GithubService
import me.karounwi.common.githubprofile.data.repository.GithubRepositoryImpl
import me.karounwi.common.githubprofile.domain.contract.GithubRepository
import me.karounwi.common.githubprofile.domain.usecase.GetProfilesUseCase
import me.karounwi.common.util.NetworkModule

object GithubProfileModule {
    private fun getGithubRepository(): GithubRepository {
        return GithubRepositoryImpl(NetworkModule.getRetrofit().create(GithubService::class.java))
    }

    fun getProfileUseCase(): GetProfilesUseCase {
        return GetProfilesUseCase(getGithubRepository())
    }
}