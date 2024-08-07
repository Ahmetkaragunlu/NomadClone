package com.ahmetkaragunlu.nomadclone

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Pager(modifier: Modifier=Modifier) {

    val pagerState= rememberPagerState(pageCount = {3})

    HorizontalPager(state = pagerState, contentPadding = PaddingValues(horizontal = 32.dp)) { page->
            Card (modifier.clickable {  }){
                when(page){
                    0-> Image(painter = painterResource(id = R.drawable.card1), contentDescription =null)
                    1-> Image(painter = painterResource(id = R.drawable.card2), contentDescription =null)
                    2-> Image(painter = painterResource(id = R.drawable.card3), contentDescription =null)
                }
            }
    }
        Spacer(modifier.height(12.dp) )

        Row (modifier.fillMaxWidth(),horizontalArrangement = Arrangement.Center){
            repeat(pagerState.pageCount) {iteration->
            val color=if(pagerState.currentPage==iteration) Color.Gray else Color.DarkGray
                Box(
                    modifier
                        .padding(2.dp)
                        .clip(shape = RoundedCornerShape(12.dp))
                        .background(color)
                        .size(16.dp, 8.dp))
            }
        }

}
