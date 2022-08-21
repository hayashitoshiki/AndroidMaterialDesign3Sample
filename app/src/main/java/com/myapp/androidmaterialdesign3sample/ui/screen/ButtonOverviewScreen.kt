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
import com.myapp.androidmaterialdesign3sample.ui.component.BodyTextM
import com.myapp.androidmaterialdesign3sample.ui.component.HeadLineTextM
import com.myapp.androidmaterialdesign3sample.ui.component.TitleTextM

@ExperimentalMaterial3Api
@Composable
fun ButtonOverviewScreen(navController: NavHostController) {
    ButtonOverviewContent(navController)
}

@ExperimentalMaterial3Api
@Composable
fun ButtonOverviewContent(navController: NavHostController) {
    Column(
        modifier = Modifier
            .padding(8.dp)
            .verticalScroll(rememberScrollState())
    ) {
        HeadLineTextM(text = "ボタンについて")
        Spacer(modifier = Modifier.size(8.dp))
        TitleTextM(text = "ボタンの種類")
        BodyTextM(
            text = "ボタンは大きく下記の３種類に分類されます。\n" +
                    "　1.High emphasis\n" +
                    "　2.Medium emphasis\n" +
                    "　3.Low emphasis"
        )
        Spacer(modifier = Modifier.size(8.dp))
        TitleTextM(text = "1.High emphasis")
        BodyTextM(
            text = "High emphasisは画面で最も重要であったり、主要なアクションに用いるボタンです。下記のボタンが該当します。\n" +
                    "　1.Extended FAB\n" +
                    "　2.FAB\n" +
                    "　3.Filled button"
        )
        Spacer(modifier = Modifier.size(8.dp))
        TitleTextM(text = "2.Medium emphasis")
        BodyTextM(
            text = "Medium emphasisは画面の他の要素を邪魔しないために用いるボタンです。下記のボタンが該当します。\n" +
                    "　1.Filled tonal button\n" +
                    "　2.Elevated button\n" +
                    "　3.Outlined button"
        )
        Spacer(modifier = Modifier.size(8.dp))
        TitleTextM(text = "3.Low emphasis")
        BodyTextM(
            text = "Low emphasisは画面上で目立たない、オプションや補助用のアクションに用いるボタンです。下記のボタンが該当します。\n" +
                    "　1.Text button\n" +
                    "　2.Segmented button\n" +
                    "　3.Icon button"
        )
    }
}
