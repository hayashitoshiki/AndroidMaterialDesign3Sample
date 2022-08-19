package com.myapp.androidmaterialdesign3sample.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.myapp.androidmaterialdesign3sample.ui.component.*

@ExperimentalMaterial3Api
@Composable
fun FontDetailsScreen(navController: NavHostController) {
    FontDetailsContent(navController)
}

@ExperimentalMaterial3Api
@Composable
fun FontDetailsContent(navController: NavHostController) {
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        HeadLineTextL(text = "文字について")

        Column(modifier = Modifier.padding(8.dp)) {
            TitleTextL(text = "文字サイズの種類について")
            BodyTextL(
                text = "文字サイズは主に下記の５種類に分類されます。\n" +
                        "　1.Display\n" +
                        "　2.HeadLine\n" +
                        "　3.Title\n" +
                        "　4.Body\n" +
                        "　5.Label\n" +
                        "そしてその中でも「大」「中」「小」のサイズに分類されます。\n" +
                        "アプリではこの計１５種類を使い分けてデザインしていきます。"
            )

            Spacer(modifier = Modifier.size(8.dp))
            TitleTextL(text = "1.Display")
            BodyTextL(
                text = "Displayは、画面内部で一番インパクトを残したい文章を記載する際に使用します。"
            )

            Spacer(modifier = Modifier.size(8.dp))
            TitleTextL(text = "2.HeadLine")
            BodyTextL(
                text = "HeadLineは、画面のトップテーマを記載する際に使用します。"
            )

            Spacer(modifier = Modifier.size(8.dp))
            TitleTextL(text = "3.Title")
            BodyTextL(
                text = "Displayは、ステータスバーの画面名や各小見出しを記載する際に使用します。"
            )

            Spacer(modifier = Modifier.size(8.dp))
            TitleTextL(text = "4.Body")
            BodyTextL(
                text = "Bodyは、本文を記載する際に使用します。"
            )

            Spacer(modifier = Modifier.size(8.dp))
            TitleTextL(text = "5.Label")
            BodyTextL(
                text = "Labelは、ボタンやキャプションを記載する際に使用します。"
            )
        }

        Column(modifier = Modifier.padding(8.dp)) {
            TitleTextL(text = "大サイズコンテンツ文字サイズ")

            DisplayTextL(text = "DisplayText")
            HeadLineTextL(text = "HeadLineText")
            TitleTextL(text = "TitleText")
            BodyTextL(text = "BodyText")
            LabelTextL(text = "LabelText")
        }

        Column(modifier = Modifier.padding(8.dp)) {
            TitleTextL(text = "中サイズコンテンツ文字サイズ")

            DisplayTextM(text = "DisplayText")
            HeadLineTextM(text = "HeadLineText")
            TitleTextM(text = "TitleText")
            BodyTextM(text = "BodyText")
            LabelTextM(text = "LabelText")
        }

        Column(modifier = Modifier.padding(8.dp)) {
            TitleTextL("小サイズコンテンツ文字サイズ")

            DisplayTextS("DisplayText")
            HeadLineTextS("HeadLineText")
            TitleTextS("TitleText")
            BodyTextS("BodyText")
            LabelTextS("LabelText")
        }
    }
}