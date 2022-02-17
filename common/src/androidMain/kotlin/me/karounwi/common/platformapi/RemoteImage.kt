package me.karounwi.common.platformapi

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter

@ExperimentalCoilApi
@Composable
actual fun RemoteImage(
  url: String,
  contentDescription: String?,
  modifier: Modifier,
  contentScale: ContentScale
) {
  Image(
    painter = rememberImagePainter(url),
    modifier = modifier,
    contentDescription = contentDescription,
    contentScale = contentScale,
  )
}