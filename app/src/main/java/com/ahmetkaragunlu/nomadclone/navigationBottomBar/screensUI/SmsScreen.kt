package com.ahmetkaragunlu.nomadclone.navigationBottomBar.screensUI

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Sms
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.ahmetkaragunlu.nomadclone.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SmsScreen(modifier: Modifier = Modifier) {

    Column(
        modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TopAppBar(colors = topAppBarColors(
            containerColor = MaterialTheme.colorScheme.background,
            titleContentColor = MaterialTheme.colorScheme.onBackground
        ),
            title = {
                Row {
                    Text(text = stringResource(id = R.string.sms_plan))
                    Spacer(modifier.weight(1f))
                    Icon(imageVector = Icons.Default.Sms, contentDescription = null,
                        modifier
                            .padding(end = dimensionResource(id = R.dimen.padding_large))
                            .clickable { })
                }
            })
        Card(modifier.clickable {}) {
            Image(painter = painterResource(id = R.drawable.sms_card), contentDescription = null)
        }
    }
}


