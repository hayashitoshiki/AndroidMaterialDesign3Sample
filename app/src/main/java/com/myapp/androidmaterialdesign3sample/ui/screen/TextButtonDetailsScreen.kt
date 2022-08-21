package com.myapp.androidmaterialdesign3sample.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
fun TextButtonDetailsScreen(navController: NavHostController) {
    TextButtonDetailsContent(navController)
}

@ExperimentalMaterial3Api
@Composable
fun TextButtonDetailsContent(navController: NavHostController) {
    Column(
        modifier = Modifier
            .padding(8.dp)
            .verticalScroll(rememberScrollState())
    ) {
        HeadLineTextM(text = "主なボタンの使い分け")
        Spacer(modifier = Modifier.size(16.dp))
        TitleTextM(text = "ボタンの優先順位")
        BodyTextM(
            text = "テキストボタンの優先順位は下記のようになっています。\n" +
                    "　1.FilledButton\n" +
                    "　2.FilledTonalButton\n" +
                    "　3.OutlinedButton\n" +
                    "　4.TextButton\n" +
                    "　例外：ElevatedButton"
        )
        Spacer(modifier = Modifier.size(16.dp))
        TitleTextM(text = "FilledButton")
        BodyTextM(
            text = "FilledButtonは一番強調されるアクションに使用します。\n"+
                    "例）\n" +
                    "　・カードコンテンツの重要アクション\n" +
                    "　・処理フローの決定アクション"
        )
        FilledButtonUtil(text = "FilledButton", onClick = {})
        Spacer(modifier = Modifier.size(16.dp))
        TitleTextM(text = "FilledTonalButton")
        BodyTextM(
            text = "FilledTonalButtonはFilledButtonの次に強調されるアクションに使用します。\n"+
                    "例）\n" +
                    "　・ナビゲーションバーの選択状態\n" +
                    "　・処理フローの次へ進む際のアクション"
        )
        FilledTonalButtonUtil(text = "FilledTonalButton", onClick = {})
        Spacer(modifier = Modifier.size(16.dp))
        TitleTextM(text = "OutlinedButton")
        BodyTextM(
            text = "OutlinedButtonはFilledTonalButtonの次に強調されるボタンです。FilledButtonと一緒に使用して２択のNegative遷移時や画面の流れを変える時に主に使用します。\n"+
                    "例）\n" +
                    "　・戻るボタン\n" +
                    "　・すべて表示ボタン\n" +
                    "　・処理フローの次へ進む際のアクション"
        )
        OutlinedButtonUtil(text = "OutlinedButton", onClick = {})
        Spacer(modifier = Modifier.size(16.dp))
        TitleTextM(text = "TextButton")
        BodyTextM(
            text = "TextButtonはテキストボタンの中で一番優先度の低いボタンです。主に最も優先度の低いアクションの際に使用します。\n"+
                    "例）\n" +
                    "　・カード内のもっと見るボタン\n" +
                    "　・ダイアログ内のボタン"
        )
        TextButtonUtil(text = "TextButton", onClick = {})
        Spacer(modifier = Modifier.size(16.dp))
        TitleTextM(text = "ElevatedButton")
        BodyTextM(
            text = "ElevatedButtonは上記の優先順位とは別で存在しています。パターン化されたり画像等で塗りつぶされた背景から視覚的に分岐するといった「絶対に必要な時のみ」使用してください。\n"+
                    "例）\n" +
                    "　・画像上に優先度高のボタンを表示させるとき\n" +
                    "　・パターン化された画面上に表示するとき"
        )
        ElevatedButtonUtil(text = "ElevatedButton", onClick = {})
        Spacer(modifier = Modifier.size(16.dp))
    }
}
