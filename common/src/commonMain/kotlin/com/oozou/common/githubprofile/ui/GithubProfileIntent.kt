package com.oozou.common.githubprofile.ui

import com.oozou.common.githubprofile.domain.model.Profile

data class GithubProfileViewData(
    val profiles: List<Profile> = emptyList(),
)