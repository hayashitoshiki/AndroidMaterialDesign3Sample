package com.myapp.androidmaterialdesign3sample.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.myapp.androidmaterialdesign3sample.ui.NavigationScreens
import com.myapp.androidmaterialdesign3sample.ui.component.*

@ExperimentalMaterial3Api
@Composable
fun ButtonDetailsScreen(navController: NavHostController) {
    ButtonDetailsContent(navController)
}

@ExperimentalMaterial3Api
@Composable
fun ButtonDetailsContent(navController: NavHostController) {
    Column(modifier = Modifier
        .padding(8.dp)
        .verticalScroll(rememberScrollState())
    ) {
        HeadLineTextM(text = "ボタンについて")
        Spacer(modifier = Modifier.size(8.dp))
        Divider()
        Spacer(modifier = Modifier.size(8.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            TitleTextM(
                modifier = Modifier.align(alignment = Alignment.CenterStart),
                text = "概要"
            )
            FilledTonalButtonUtil(
                modifier = Modifier.align(alignment = Alignment.CenterEnd),
                text = "次へ",
                onClick = { navController.navigate(NavigationScreens.BUTTON_OVERVIEW_SCREEN.route) }
            )
        }
        Spacer(modifier = Modifier.size(8.dp))
        Divider()
        Spacer(modifier = Modifier.size(8.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            TitleTextM(
                modifier = Modifier.align(alignment = Alignment.CenterStart),
                text = "テキストボタンについて"
            )
            FilledTonalButtonUtil(
                modifier = Modifier.align(alignment = Alignment.CenterEnd),
                text = "次へ",
                onClick = { navController.navigate(NavigationScreens.TEXT_BUTTON_DETAILS_SCREEN.route) }
            )
        }
        Spacer(modifier = Modifier.size(8.dp))
        Divider()
        Spacer(modifier = Modifier.size(8.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            TitleTextM(
                modifier = Modifier.align(alignment = Alignment.CenterStart),
                text = "イメージ一覧"
            )
            FilledTonalButtonUtil(
                modifier = Modifier.align(alignment = Alignment.CenterEnd),
                text = "次へ",
                onClick = { navController.navigate(NavigationScreens.BUTTON_IMAGE_DETAILS_SCREEN.route) }
            )
        }


    }
}
