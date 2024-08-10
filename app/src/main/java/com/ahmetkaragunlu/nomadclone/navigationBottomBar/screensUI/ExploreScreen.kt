package com.ahmetkaragunlu.nomadclone.navigationBottomBar.screensUI

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ahmetkaragunlu.nomadclone.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExploreScreen(innerPadding: PaddingValues, modifier: Modifier = Modifier) {

    Column(
        modifier
            .fillMaxSize()
            .padding(innerPadding)
    ) {
        TopAppBar(colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.background,
            titleContentColor = Color.White
        ),
            title = {
                Row {
                    Text(text = stringResource(id = R.string.explore))
                    Spacer(modifier.weight(1f))
                    Icon(imageVector = Icons.Default.Search, contentDescription = null,
                        modifier
                            .padding(end = 8.dp)
                            .clickable { }
                    )
                }
            })
        LazyColumn(modifier.padding(top = 8.dp)) {
            item {
                Text(
                    text = stringResource(id = R.string.popular_destination),
                    modifier.padding(start = 8.dp),
                    color = Color.White,
                    fontSize = 24.sp
                )
                Spacer(modifier.height(12.dp))
                PopularDestination()

                Spacer(modifier.height(18.dp))
                Text(
                    text = stringResource(id = R.string.popular_attractions),
                    modifier.padding(8.dp),
                    color = Color.White,
                    fontSize = 24.sp
                )
                Text(
                    text = stringResource(id = R.string.explore_text1),
                    modifier.padding(8.dp),
                    color = Color.Gray
                )
                Spacer(modifier.height(8.dp))
                PopularAttractions()
                Spacer(modifier.height(12.dp))
                Text(
                    text = stringResource(id = R.string.popular_tours),
                    modifier.padding(start = 8.dp),
                    color = Color.White,
                    fontSize = 24.sp
                )
                Text(
                    text = stringResource(id = R.string.explore_text2),
                    modifier.padding(start = 8.dp),
                    color = Color.Gray
                )
                Spacer(modifier.height(18.dp))
                PopularTours()
                Spacer(modifier.height(18.dp))
                Text(
                    text = stringResource(id = R.string.popular_destination_guides),
                    modifier.padding(start = 8.dp),
                    color = Color.White,
                    fontSize = 24.sp
                )
                Spacer(modifier.height(12.dp))
                PopularDestinationGuides()
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PopularDestination(modifier: Modifier = Modifier) {

    val pagerState = rememberPagerState(pageCount = { 4 })

    HorizontalPager(
        state = pagerState,
        contentPadding = PaddingValues(horizontal = 32.dp)
    ) { page ->
        Card(
            modifier
                .clickable { }
                .width(300.dp)) {
            when (page) {
                0 -> Image(
                    painter = painterResource(id = R.drawable.tokyo),
                    contentDescription = null,
                    modifier.fillMaxWidth(),
                    contentScale = ContentScale.FillBounds
                )
                1 -> Image(
                    painter = painterResource(id = R.drawable.singapore_card),
                    contentDescription = null,
                    modifier.fillMaxWidth(),
                    contentScale = ContentScale.FillBounds
                )
                2 -> Image(
                    painter = painterResource(id = R.drawable.london),
                    contentDescription = null,
                    modifier.fillMaxWidth(),
                    contentScale = ContentScale.FillBounds
                )
                3 -> Image(
                    painter = painterResource(id = R.drawable.new_york),
                    contentDescription = null,
                    modifier.fillMaxWidth(),
                    contentScale = ContentScale.FillBounds
                )
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PopularAttractions(modifier: Modifier = Modifier) {
    val pagerState = rememberPagerState(pageCount = { 4 })

    HorizontalPager(
        state = pagerState,
        contentPadding = PaddingValues(horizontal = 32.dp)
    ) { page ->
        Card(
            modifier
                .clickable { }
                .width(300.dp)) {
            when (page) {
                0 -> Image(
                    painter = painterResource(id = R.drawable.barcelona),
                    contentDescription = null,
                    modifier.fillMaxWidth(),
                    contentScale = ContentScale.FillBounds
                )
                1 -> Image(
                    painter = painterResource(id = R.drawable.berlin),
                    contentDescription = null,
                    modifier.fillMaxWidth(),
                    contentScale = ContentScale.FillBounds
                )
                2 -> Image(
                    painter = painterResource(id = R.drawable.amsterdam),
                    contentDescription = null,
                    modifier.fillMaxWidth(),
                    contentScale = ContentScale.FillBounds
                )
                3 -> Image(
                    painter = painterResource(id = R.drawable.budapest),
                    contentDescription = null,
                    modifier.fillMaxWidth(),
                    contentScale = ContentScale.FillBounds
                )
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PopularTours(modifier: Modifier = Modifier) {
    val pagerState = rememberPagerState(pageCount = { 4 })

    HorizontalPager(
        state = pagerState,
        contentPadding = PaddingValues(horizontal = 32.dp)
    ) { page ->
        Card(
            modifier
                .clickable { }
                .width(300.dp)) {
            when (page) {
                0 -> Image(
                    painter = painterResource(id = R.drawable.popular_tours1),
                    contentDescription = null,
                    modifier.fillMaxWidth(),
                    contentScale = ContentScale.FillBounds
                )
                1 -> Image(
                    painter = painterResource(id = R.drawable.popular_tours2),
                    contentDescription = null,
                    modifier.fillMaxWidth(),
                    contentScale = ContentScale.FillBounds
                )
                2 -> Image(
                    painter = painterResource(id = R.drawable.popular_tours3),
                    contentDescription = null,
                    modifier.fillMaxWidth(),
                    contentScale = ContentScale.FillBounds
                )
                3 -> Image(
                    painter = painterResource(id = R.drawable.popular_tours4),
                    contentDescription = null,
                    modifier.fillMaxWidth(),
                    contentScale = ContentScale.FillBounds
                )
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PopularDestinationGuides(modifier: Modifier = Modifier) {
    val pagerState = rememberPagerState(pageCount = { 4 })

    HorizontalPager(
        state = pagerState,
        contentPadding = PaddingValues(horizontal = 32.dp)
    ) { page ->
        Card(
            modifier
                .clickable { }
                .width(300.dp)) {
            when (page) {
                0 -> Image(
                    painter = painterResource(id = R.drawable.popular_guides1),
                    contentDescription = null,
                    modifier.fillMaxWidth(),
                    contentScale = ContentScale.FillBounds
                )
                1 -> Image(
                    painter = painterResource(id = R.drawable.popular_guides2),
                    contentDescription = null,
                    modifier.fillMaxWidth(),
                    contentScale = ContentScale.FillBounds
                )
                2 -> Image(
                    painter = painterResource(id = R.drawable.popular_guides3),
                    contentDescription = null,
                    modifier.fillMaxWidth(),
                    contentScale = ContentScale.FillBounds
                )
                3 -> Image(
                    painter = painterResource(id = R.drawable.popular_guides4),
                    contentDescription = null,
                    modifier.fillMaxWidth(),
                    contentScale = ContentScale.FillBounds
                )
            }
        }
    }
}