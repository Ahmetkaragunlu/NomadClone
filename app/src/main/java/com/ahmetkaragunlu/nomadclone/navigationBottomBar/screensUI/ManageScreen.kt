package com.ahmetkaragunlu.nomadclone.navigationBottomBar.screensUI

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.ahmetkaragunlu.nomadclone.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ManageScreen(modifier: Modifier = Modifier, paddingValues: PaddingValues) {

    var isSelected by remember { mutableIntStateOf(1) }

    Column(
        modifier
            .fillMaxSize()
            .padding(paddingValues)
    ) {

        TopAppBar(colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.background,
            titleContentColor = Color.White
        ), title = { Text(text = stringResource(id = R.string.manage)) })
        Row(modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Button(
                onClick = { isSelected = 1 }, modifier.size(180.dp, 40.dp),
                colors = ButtonDefaults.buttonColors(if (isSelected == 1) Color.Blue else Color.Gray)
            ) {
                Text(text = stringResource(id = R.string.current))
            }
            Button(
                onClick = { isSelected = 2 }, modifier.size(180.dp, 40.dp),
                colors = ButtonDefaults.buttonColors(if (isSelected == 2) Color.Blue else Color.Gray)
            ) {
                Text(text = stringResource(id = R.string.expired))
            }
        }
        Box(
            modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                if (isSelected == 1) {
                    Image(
                        painter = painterResource(id = R.drawable.manage_image),
                        contentDescription = null
                    )
                    Spacer(modifier.height(16.dp))
                    Text(
                        text = stringResource(id = R.string.no_plan_yet),
                        color = Color.White
                    )
                    Spacer(modifier.height(8.dp))
                    Text(
                        text = stringResource(id = R.string.manage_text),
                        color = Color.White
                    )
                } else {
                    Image(
                        painter = painterResource(id = R.drawable.manage_image),
                        contentDescription = null
                    )
                    Spacer(modifier.height(16.dp))
                    Text(
                        text = stringResource(id = R.string.no_plan_yet),
                        color = Color.White
                    )
                    Spacer(modifier.height(8.dp))
                    Text(
                        text = stringResource(id = R.string.manage_text2),
                        color = Color.White
                    )
                }
            }
        }
    }
}