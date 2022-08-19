package com.myapp.androidmaterialdesign3sample.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import com.myapp.androidmaterialdesign3sample.R
import com.myapp.androidmaterialdesign3sample.ui.component.*
import com.myapp.androidmaterialdesign3sample.ui.theme.ColorType

@ExperimentalMaterial3Api
@Composable
fun ColorDetailsScreen(navController: NavHostController) {
    ColorDetailsContent(navController)
}

@ExperimentalMaterial3Api
@Composable
fun ColorDetailsContent(navController: NavHostController) {
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        HeadLineTextM(text = "色について")
        TitleTextM(text = "色の分類")
        BodyTextM(
            text = "配色は主に下記のように分類されます。\n"+
                    "　1.プライマリ(Primary)\n" +
                    "　2.セカンダリ(Secondary)\n" +
                    "　3.アクセント(Tertiary)\n" +
                    "さらにその中で下記に分類されます。\n" +
                    "　1.メインの色(○○)\n" +
                    "　2.1の上にあるコンテンツの色(On ○○)\n" +
                    "　3.メインの中でも強調されない色(○○ Container)\n" +
                    "　4.3の上にあるコンテンツの色(On ○○ Container)"
        )

        Image(
            painter = painterResource(R.drawable.img_color_type),
            contentDescription = "",
        )

        TitleTextM(
            text = "Primary"
        )
        BodyTextM(
            text = "Primaryは主に下記に使用されます。\n"+
                    "　1.FABボタン（FAB)\n" +
                    "　2.選択肢（CheckBox,RadioButton)\n" +
                    "　3.バー（SneakBar)\n" +
                    "　4. 目立たせたいボタン(Button)" +
                    "　5.アクティブ状態（FAB)\n" +
                    "　6.竜騎した表面状態)\n"
        )

        TitleTextM(text = "Secondary")
        BodyTextM(
            text = "Secondaryは主に下記に使用されます。\n"+
                    "　1.フィルタ（Chips)\n" +
                    "　2. フッター(BottomNavigation)"
        )

        TitleTextM(text = "Tertiary")
        BodyTextM(
            text = "Tertiaryは主に下記に使用されます。\n"+
                    "　1.アクセントとして注目させたいもの（Button)\n"
        )

        TitleTextM(text = "Button一覧")
        Column {
            ColorType.values().forEach {
                UtilButton(it.name, it) {}
            }
        }

        TitleTextM(text = "Filterサンプル")
        UtilFilter(
            selected = true,
            label = "選択状態"
        ){}
        UtilFilter(
            selected = false,
            label = "非選択状態"
        ){}
        UtilFilter(
            enabled = false,
            selected = false,
            label = "非活性状態"
        ){}

        TitleTextM(text = "色の実装方法")
        BodyTextM(
            text = "色を実装するときは下記のリンクから色を選択して「Color.kt」「Theme.kt」を貼り付けてください。\n" +
                    "https://m3.material.io/theme-builder#/custom"
        )

    }
}
