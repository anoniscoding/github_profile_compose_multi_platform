package me.karounwi.common.githubprofile.ui

import me.karounwi.common.githubprofile.domain.model.Profile

data class GithubProfileViewData(
    val profiles: List<Profile> = emptyList(),
)