package com.myapp.androidmaterialdesign3sample.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.myapp.androidmaterialdesign3sample.ui.component.*

@ExperimentalMaterial3Api
@Composable
fun ButtonDetailsScreen(navController: NavHostController) {
    ButtonDetailsContent(navController)
}

@ExperimentalMaterial3Api
@Composable
fun ButtonDetailsContent(navController: NavHostController) {
    val selected = remember { mutableStateOf(0) }
    val item = listOf("概要", "テキストボタン", "一覧")
    Column(modifier = Modifier.padding(horizontal = 16.dp)) {
        HeadLineTextM(text = "ボタンについて")
        Spacer(modifier = Modifier.size(8.dp))
        SegmentedControl(items = item, selectedIndex = selected)
        Spacer(modifier = Modifier.size(8.dp))
        when(selected.value) {
            0 -> ButtonOverviewScreen(navController)
            1 -> TextButtonDetailsScreen(navController)
            2 -> ButtonImageDetailsScreen(navController)
        }
    }
}
