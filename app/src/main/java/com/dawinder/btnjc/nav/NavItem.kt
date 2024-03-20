package com.dawinder.btnjc.nav

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search

sealed class NavItem {
    object Home :
        Item(path = "Main", title = "Main", icon = Icons.Default.Person)

    object Search :
        Item(path = "Game", title = "Game", icon = Icons.Default.PlayArrow)

    object Game :
        Item(path = "Courses", title = "Courses", icon = Icons.Default.List)
}