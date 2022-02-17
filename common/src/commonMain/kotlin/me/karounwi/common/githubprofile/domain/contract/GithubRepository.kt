package me.karounwi.common.githubprofile.domain.contract

import me.karounwi.common.githubprofile.domain.model.Profile

interface GithubRepository {
    suspend fun getProfiles(): List<Profile>
}