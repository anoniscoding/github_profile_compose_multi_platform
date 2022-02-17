package com.oozou.common.githubprofile.data.repository

import com.oozou.common.githubprofile.data.remote.GithubService
import com.oozou.common.githubprofile.domain.contract.GithubRepository
import com.oozou.common.githubprofile.domain.model.Profile
import com.oozou.common.util.tryApiCall

class GithubRepositoryImpl constructor(private val api: GithubService): GithubRepository {
    override suspend fun getProfiles(): List<Profile> {
        return tryApiCall { api.getProfiles() }
    }
}