package com.ahmetkaragunlu.nomadclone.popularDestinations

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.ahmetkaragunlu.nomadclone.R

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PopularCards(modifier: Modifier=Modifier) {

    val pagerState= rememberPagerState(pageCount = {3})

    HorizontalPager(state = pagerState, contentPadding = PaddingValues(horizontal = 32.dp)) { page->
        Card (modifier.clickable {  }.fillMaxWidth().padding(start = 8.dp).height(200.dp)){

            when(page) {
             0-> Image(painter = painterResource(id = R.drawable.united_states), contentDescription = null,
                 modifier = Modifier.fillMaxSize(),
                 contentScale = ContentScale.FillBounds)
             1-> Image(painter = painterResource(id = R.drawable.china), contentDescription = null,
                 modifier = Modifier.fillMaxSize(),
                 contentScale = ContentScale.FillBounds)
             2-> Image(painter = painterResource(id = R.drawable.united_kingdom), contentDescription = null,
                 modifier = Modifier.fillMaxSize(),
                 contentScale = ContentScale.FillBounds)
            }
        }
    }

}