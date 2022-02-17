package com.oozou.common.githubprofile.domain.usecase

import com.oozou.common.githubprofile.domain.contract.GithubRepository
import com.oozou.common.githubprofile.domain.model.Profile

class GetProfilesUseCase constructor(private val repository: GithubRepository) {
    suspend operator fun invoke(): List<Profile> = repository.getProfiles()
}