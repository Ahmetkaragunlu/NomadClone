package com.ahmetkaragunlu.nomadclone.contients

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ahmetkaragunlu.nomadclone.R

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun EuropeList(modifier: Modifier = Modifier) {
    val pagerState = rememberPagerState(pageCount = { 7 })

    val description = listOf(
        R.string.united_kingdom,
        R.string.italy,
        R.string.türkiye,
        R.string.france,
        R.string.greece,
        R.string.faroe_ıslands,
        R.string.see_all
    )
    HorizontalPager(
        state = pagerState,
        contentPadding = PaddingValues(horizontal = dimensionResource(id = R.dimen.pager_padding)),
        pageSize = PageSize.Fixed(80.dp)
    ) { page ->
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Card(
                modifier
                    .clickable { }
                    .size(80.dp)
                    .padding(dimensionResource(id = R.dimen.padding_small)),
                    shape = CircleShape,
                    colors = CardDefaults.cardColors(Color.Gray)

            ) {
                Box(modifier.fillMaxSize(),contentAlignment = Alignment.Center){
                when (page) {
                    0 -> Image(
                        modifier = Modifier.clip(CircleShape),
                        painter = painterResource(id = R.drawable.united_kingdom_flag),
                        contentDescription = null
                    )
                    1 -> Image(
                        modifier = Modifier.clip(CircleShape),
                        painter = painterResource(id = R.drawable.italy),
                        contentDescription = null
                    )
                    2 -> Image(
                        modifier = Modifier.clip(CircleShape),
                        painter = painterResource(id = R.drawable.turkey),
                        contentDescription = null
                    )
                    3 -> Image(
                        modifier = Modifier.clip(CircleShape),
                        painter = painterResource(id = R.drawable.france),
                        contentDescription = null
                    )
                    4 -> Image(
                        modifier = Modifier.clip(CircleShape),
                        painter = painterResource(id = R.drawable.greece),
                        contentDescription = null
                    )
                    5 -> Image(
                        modifier = Modifier.clip(CircleShape),
                        painter = painterResource(id = R.drawable.faroe_slands),
                        contentDescription = null
                    )
                    6 -> Icon(
                        imageVector = Icons.Filled.Search, contentDescription = null,
                        modifier
                            .size(60.dp)
                            .background(Color.Gray), tint = Color.White)
                }
                }
            }
            Spacer(modifier.height(dimensionResource(id = R.dimen.spacer_padding)))
            Text(
                text = stringResource(id = description[page]),
                color = Color.White,
                style = MaterialTheme.typography.labelSmall
            )
        }
    }
}
