package com.myapp.androidmaterialdesign3sample.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.myapp.androidmaterialdesign3sample.R
import com.myapp.androidmaterialdesign3sample.ui.NavigationScreens
import com.myapp.androidmaterialdesign3sample.ui.component.*
import com.myapp.androidmaterialdesign3sample.ui.theme.ColorType

@ExperimentalMaterial3Api
@Composable
fun HomeScreen(navController: NavHostController) {
    HomeContent(navController)
}

@ExperimentalMaterial3Api
@Composable
fun HomeContent(navController: NavHostController) {
    Column(modifier = Modifier.padding(8.dp).verticalScroll(rememberScrollState())) {
        HeadLineTextL(
            color =ColorType.TERTIARY.getColor(),
            text = "Material Design3"
        )
        val modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(top= 8.dp, bottom = 8.dp)
        FilledCardUtil(modifier = modifier) {
            Column {
                Image(
                    painter = painterResource(R.drawable.img_color_type),
                    contentDescription = "",
                )
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                ) {
                    TitleTextM(text = "色について")
                    Spacer(modifier = Modifier.size(8.dp))
                    FilledButtonUtil(
                        modifier = Modifier.align(Alignment.End),
                        text = "詳細へ",
                        onClick = { navController.navigate(NavigationScreens.COLOR_DETAILS_SCREEN.route) }
                    )
                }
            }
        }
        FilledCardUtil(modifier = modifier) {
            Column {
                Image(
                    painter = painterResource(R.drawable.img_typography),
                    contentDescription = "",
                )
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                ) {
                    TitleTextM(text = "文字について")
                    Spacer(modifier = Modifier.size(8.dp))
                    FilledButtonUtil(
                        modifier = Modifier.align(alignment = Alignment.End),
                        text = "詳細へ",
                        onClick = { navController.navigate(NavigationScreens.FONT_DETAILS_SCREEN.route) }
                    )
                }
            }
        }
        FilledCardUtil(modifier = modifier) {
            Column {
                Image(
                    painter = painterResource(R.drawable.img_card_details),
                    contentDescription = "",
                )
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                ) {
                    TitleTextM(text = "カードについて")
                    Spacer(modifier = Modifier.size(8.dp))
                    FilledButtonUtil(
                        modifier = Modifier.align(alignment = Alignment.End),
                        text = "詳細へ",
                        onClick = { navController.navigate(NavigationScreens.CARD_DETAILS_SCREEN.route) }
                    )
                }
            }
        }

        FilledCardUtil(modifier = modifier) {
            Column {
                Image(
                    painter = painterResource(R.drawable.img_button_details),
                    contentDescription = "",
                )
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                ) {
                    TitleTextM(text = "ボタンについて")
                    Spacer(modifier = Modifier.size(8.dp))
                    FilledButtonUtil(
                        modifier = Modifier.align(alignment = Alignment.End),
                        text = "詳細へ",
                        onClick = { navController.navigate(NavigationScreens.BUTTON_DETAILS_SCREEN.route) }
                    )
                }
            }
        }
    }
}