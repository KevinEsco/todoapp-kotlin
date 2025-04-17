package com.juandgaines.todoapp.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.tooling.preview.PreviewParameterProvider

class IconProvider:PreviewParameterProvider<IconContainer> {
    override val values: Sequence<IconContainer>
        get() = sequenceOf(
            IconContainer(icon = Icons.Default.Favorite),
            IconContainer(icon = Icons.Default.Search),
            IconContainer(icon = Icons.Default.Star),
            IconContainer(icon = Icons.Default.Notifications)
        )
}
