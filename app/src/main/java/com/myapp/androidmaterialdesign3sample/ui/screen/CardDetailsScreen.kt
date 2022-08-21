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
import com.myapp.androidmaterialdesign3sample.ui.component.*

@ExperimentalMaterial3Api
@Composable
fun CardDetailsScreen(navController: NavHostController) {
    CardDetailsContent(navController)
}

@ExperimentalMaterial3Api
@Composable
fun CardDetailsContent(navController: NavHostController) {
    Column(modifier = Modifier.padding(horizontal = 16.dp).verticalScroll(rememberScrollState())) {
        HeadLineTextM(text = "カードについて")
        TitleTextM(text = "カードの分類")
        BodyTextM(
            text = "配色は主に下記のように分類されます。\n"+
                    "　1.FilledCard\n" +
                    "　2.ElevatedCard\n" +
                    "　3.OutlinedCard\n"
        )

        TitleTextM(text = "カードのイメージ")
        val modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(16.dp)
        FilledCardUtil(modifier = modifier) {
            Column {
                Image(
                    painter = painterResource(R.drawable.img_color_type),
                    contentDescription = "",
                )
                Column(modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)) {
                    HeadLineTextS(text = "FilledCard")
                    TitleTextM(text = "サブタイトルです")
                    BodyTextM(text = "本文です")
                    FilledButtonUtil(
                        modifier = Modifier.align(Alignment.End),
                        text = "ボタンです",
                        onClick = { }
                    )
                }
            }
        }
        ElevatedCardUtil(modifier = modifier) {
            Column {
                Image(
                    painter = painterResource(R.drawable.img_color_type),
                    contentDescription = "",
                )
                Column(modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)) {
                    HeadLineTextS(text = "ElevatedCard")
                    TitleTextM(text = "サブタイトルです")
                    BodyTextM(text = "本文です")
                    FilledButtonUtil(
                        modifier = Modifier.align(Alignment.End),
                        text = "ボタンです",
                        onClick = { }
                    )
                }
            }
        }
        OutlinedCardUtil(modifier = modifier) {
            Column {
                Image(
                    painter = painterResource(R.drawable.img_color_type),
                    contentDescription = "",
                )
                Column(modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)) {
                    HeadLineTextS(text = "OutlinedCard")
                    TitleTextM(text = "サブタイトルです")
                    BodyTextM(text = "本文です")
                    FilledButtonUtil(
                        modifier = Modifier.align(Alignment.End),
                        text = "ボタンです",
                        onClick = { }
                    )
                }
            }
        }

    }
}