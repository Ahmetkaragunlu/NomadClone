package com.ahmetkaragunlu.nomadclone.navigationBottomBar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Chat
import androidx.compose.material.icons.filled.Equalizer
import androidx.compose.material.icons.filled.Explore
import androidx.compose.material.icons.filled.Work
import androidx.compose.ui.graphics.vector.ImageVector

data class NavItem(
    val icon: ImageVector,
    val label: String,
    val screens: Screens
)

val navItems= listOf(
    NavItem(icon = Icons.Filled.Equalizer, label = "Data", screens = Screens.DATA),
    NavItem(icon = Icons.Filled.Chat, label = "SMS", screens = Screens.SMS),
    NavItem(icon = Icons.Filled.Work, label = "Manage", screens = Screens.MANAGE),
    NavItem(icon = Icons.Filled.Explore, label = "Explore", screens = Screens.EXPLORE),
    NavItem(icon = Icons.Filled.AccountCircle, label = "Profile", screens = Screens.PROFILE),
)
