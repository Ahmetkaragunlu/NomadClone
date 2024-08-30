package com.ahmetkaragunlu.nomadclone

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.ahmetkaragunlu.nomadclone.navigationBottomBar.Screens
import com.ahmetkaragunlu.nomadclone.navigationBottomBar.navItems
import com.ahmetkaragunlu.nomadclone.navigationBottomBar.screensUI.DataScreen
import com.ahmetkaragunlu.nomadclone.navigationBottomBar.screensUI.ExploreScreen
import com.ahmetkaragunlu.nomadclone.navigationBottomBar.screensUI.ManageScreen
import com.ahmetkaragunlu.nomadclone.navigationBottomBar.screensUI.SmsScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NomadApp(modifier: Modifier = Modifier) {

    var currentScreen by remember { mutableStateOf(Screens.DATA) }
    Scaffold(topBar = {
        if (currentScreen == Screens.DATA) {
            TopAppBar(colors = TopAppBarDefaults.topAppBarColors(
                containerColor = MaterialTheme.colorScheme.background,
                titleContentColor = Color.White
            ),
                title = {
                    Row {
                        Text(text = stringResource(id = R.string.data_plan))
                        Spacer(modifier.weight(1f))
                        Icon(imageVector = Icons.Filled.Search, contentDescription = null,
                            modifier
                                .padding(end = 8.dp)
                                .clickable { })
                    }
                })
        }
    },
        bottomBar = {
            NavigationBar(containerColor = Color(0xFF121529)) {
                navItems.forEach { item ->
                    NavigationBarItem(
                        icon = { Icon(imageVector = item.icon, contentDescription = null) },
                        label = {
                            Text(
                                text = item.label
                            )
                        },
                        selected = currentScreen == item.screens,
                        onClick = { currentScreen = item.screens },
                        colors = NavigationBarItemDefaults.colors(
                            selectedTextColor = Color.White,
                            unselectedTextColor = Color.Gray,
                            selectedIconColor = Color.White,
                            unselectedIconColor = Color.Gray,
                            indicatorColor = Color(0xFF121529)
                        )
                    )
                }
            }
        }
    ) { innerPadding ->
        Column (modifier= Modifier.fillMaxSize().padding(innerPadding)){

            if (currentScreen == Screens.DATA) {
                DataScreen()
            } else {
                when (currentScreen) {
                    Screens.SMS -> SmsScreen()
                    Screens.MANAGE -> ManageScreen()
                    Screens.EXPLORE -> ExploreScreen()
                    else -> Unit
                }
            }
        }

    }

}
