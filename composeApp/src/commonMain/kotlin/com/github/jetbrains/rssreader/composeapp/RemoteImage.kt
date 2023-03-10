package com.github.jetbrains.rssreader.composeapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
//import com.seiko.imageloader.ImageLoader
//import com.seiko.imageloader.LocalImageLoader
//import com.seiko.imageloader.rememberAsyncImagePainter

//expect fun buildImageLoader(): ImageLoader

@Composable
internal fun RemoteImage(
    imageUrl: String,
    contentDescription: String?,
    modifier: Modifier,
    alignment: Alignment,
    contentScale: ContentScale
) {
    CompositionLocalProvider(
//        LocalImageLoader provides buildImageLoader(),
    ) {
//        val painter = rememberAsyncImagePainter(imageUrl)
//        Image(painter, contentDescription, modifier, alignment, contentScale)
        Box(modifier.background(Color.Yellow)) {
            Text("TODO RemoteImage")
        }
    }
}