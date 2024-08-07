package com.ahmetkaragunlu.nomadclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ahmetkaragunlu.nomadclone.contients.AmericasList
import com.ahmetkaragunlu.nomadclone.contients.AsiaList
import com.ahmetkaragunlu.nomadclone.contients.EuropeList
import com.ahmetkaragunlu.nomadclone.popularDestinations.PopularCards
import com.ahmetkaragunlu.nomadclone.regionalPlanData.regionalPlanList
import com.ahmetkaragunlu.nomadclone.ui.theme.NomadCloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NomadCloneTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                }
                NomadApp()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NomadApp(modifier: Modifier=Modifier) {
    Scaffold(topBar = {
        TopAppBar(colors = topAppBarColors(
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
            }
        )
    }
    ) {innerPadding->
        var isSelected by remember {
            mutableIntStateOf(1)
        }
          LazyColumn(contentPadding = innerPadding) {
              item {
                  Pager()
              }
              item {
                  Spacer(modifier.height(24.dp))
                  Row ( modifier.fillMaxWidth(),horizontalArrangement = Arrangement.Center){
                      Button(onClick = { isSelected=1}
                          ,modifier.size(width = 180.dp,40.dp),
                          colors = ButtonDefaults.buttonColors(containerColor = if(isSelected==1) Color.Blue else Color.Gray)
                      ) {
                          Text(text = stringResource(id = R.string.single_country))
                      }
                      Button(onClick = { isSelected=2}
                          ,modifier.size(width = 180.dp,40.dp),
                          colors = ButtonDefaults.buttonColors(containerColor = if (isSelected==2) Color.Blue else Color.Gray)
                      ) {
                          Text(text = stringResource(id = R.string.regional_plan))

                      }
                  }
              }
              item {
                  Spacer(modifier.height(12.dp))
              }
              if (isSelected==1) {
                  item {
                      Text(text = stringResource(id = R.string.popular_destinations),
                          modifier.padding(8.dp),
                          color = Color.White,
                          fontSize =24.sp
                      )
                      Spacer(modifier.height(18.dp))
                      PopularCards()
                      Spacer(modifier.height(18.dp))
                      Text(text = stringResource(id = R.string.americas),
                          modifier.padding(start = 8.dp),
                          color = Color.White,
                          fontSize = 18.sp
                      )
                      Spacer(modifier.height(8.dp))
                      AmericasList()
                      Spacer(modifier.height(18.dp))
                      Text(text = stringResource(id = R.string.europe),
                          modifier.padding(start = 8.dp),
                          color = Color.White,
                          fontSize = 18.sp
                      )
                      Spacer(modifier.height(8.dp))
                      EuropeList()
                      Spacer(modifier.height(18.dp))
                      Text(text = stringResource(id = R.string.asia),
                          modifier.padding(start = 8.dp),
                          color = Color.White,
                          fontSize = 18.sp
                      )
                      Spacer(modifier.height(8.dp))
                      AsiaList()
                  }
              }
             if (isSelected==2) {
                 items(regionalPlanList.imageList) { images->
                     Card(
                         Modifier
                             .padding(start = 24.dp, end = 24.dp, top = 2.dp, bottom = 2.dp)
                             .clickable { }){
                         Image(painter = painterResource(id = images), contentDescription =null)
                     }
                 }
             }

          }
    }
}
