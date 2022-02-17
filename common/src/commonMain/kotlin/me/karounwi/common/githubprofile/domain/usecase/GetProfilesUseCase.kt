package me.karounwi.common.githubprofile.domain.usecase

import me.karounwi.common.githubprofile.domain.contract.GithubRepository
import me.karounwi.common.githubprofile.domain.model.Profile

class GetProfilesUseCase constructor(private val repository: GithubRepository) {
    suspend operator fun invoke(): List<Profile> = repository.getProfiles()
}