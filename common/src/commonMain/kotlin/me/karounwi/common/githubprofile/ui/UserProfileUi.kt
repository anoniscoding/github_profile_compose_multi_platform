package me.karounwi.common.githubprofile.ui


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.layout.ContentScale
import me.karounwi.common.platformapi.RemoteImage
import androidx.compose.ui.Modifier
import androidx.compose.runtime.Composable
import me.karounwi.common.githubprofile.domain.model.Profile

@Composable
fun UserProfileUi(profile: Profile) {
    Card(
        modifier = Modifier.fillMaxWidth()
            .padding(top = 10.dp, start = 16.dp, end = 16.dp)
    ) {
        Row(modifier = Modifier.fillMaxSize()) {
            RemoteImage(
                url = profile.avatarUrl,
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier.width(60.dp).height(60.dp).padding(5.dp).clip(CircleShape)
            )
            Text(text = profile.name, modifier = Modifier.padding(20.dp))
        }
    }
}