package me.karounwi.common.githubprofile.data.repository

import me.karounwi.common.githubprofile.data.remote.GithubService
import me.karounwi.common.githubprofile.domain.contract.GithubRepository
import me.karounwi.common.githubprofile.domain.model.Profile
import me.karounwi.common.util.tryApiCall

class GithubRepositoryImpl constructor(private val api: GithubService): GithubRepository {
    override suspend fun getProfiles(): List<Profile> {
        return tryApiCall { api.getProfiles() }
    }
}