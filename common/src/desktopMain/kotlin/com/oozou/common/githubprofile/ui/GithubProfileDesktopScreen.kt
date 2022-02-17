package com.oozou.common.githubprofile.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember

@Composable
fun GithubProfileDesktopScreen() {
    val viewModel = remember { GithubProfileDesktopViewModel.getInstance() }
    val profiles = viewModel.dataStates.collectAsState().value.toData()?.profiles
    GithubProfileContent(profiles ?: emptyList())
}