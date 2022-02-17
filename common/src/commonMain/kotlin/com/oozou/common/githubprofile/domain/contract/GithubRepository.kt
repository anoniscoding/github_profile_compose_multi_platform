package com.oozou.common.githubprofile.domain.contract

import com.oozou.common.githubprofile.domain.model.Profile

interface GithubRepository {
    suspend fun getProfiles(): List<Profile>
}