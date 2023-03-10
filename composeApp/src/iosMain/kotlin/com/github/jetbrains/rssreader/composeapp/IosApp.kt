package com.github.jetbrains.rssreader.composeapp

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Application
import androidx.compose.ui.window.ComposeUIViewController
import kotlinx.cinterop.*
import platform.Foundation.NSStringFromClass
import platform.UIKit.*

import com.github.jetbrains.rssreader.app.FeedStore
import com.github.jetbrains.rssreader.core.RssReader
import com.github.jetbrains.rssreader.core.create
actual val AppStore = FeedStore(RssReader.create(true))

fun MainViewController(): UIViewController =
    ComposeUIViewController {
        Column {
            Box(modifier = Modifier.height(50.dp))
            Text("Hello Compose iOS")
            App()
        }
    }
