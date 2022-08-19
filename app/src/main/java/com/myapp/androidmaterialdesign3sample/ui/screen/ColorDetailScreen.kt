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
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.myapp.androidmaterialdesign3sample.R
import com.myapp.androidmaterialdesign3sample.ui.component.UtilButton
import com.myapp.androidmaterialdesign3sample.ui.component.UtilFilter
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
        Text(
            fontSize = 18.sp,
            text = "色について"
        )
        Text(
            fontSize = 18.sp,
            text = "色の分類"
        )
        Text(
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

        Text(
            fontSize = 18.sp,
            text = "Primary"
        )
        Text(
            fontSize = 12.sp,
            text = "Primaryは主に下記に使用されます。\n"+
                    "　1.FABボタン（FAB)\n" +
                    "　2.選択肢（CheckBox,RadioButton)\n" +
                    "　3.バー（SneakBar)\n" +
                    "　4. 目立たせたいボタン(Button)" +
                    "　5.アクティブ状態（FAB)\n" +
                    "　6.竜騎した表面状態)\n"
        )

        Text(
            fontSize = 18.sp,
            text = "Secondary"
        )
        Text(
            fontSize = 12.sp,
            text = "Secondaryは主に下記に使用されます。\n"+
                    "　1.フィルタ（Chips)\n" +
                    "　2. フッター(BottomNavigation)"
        )

        Text(
            fontSize = 18.sp,
            text = "Tertiary"
        )
        Text(
            fontSize = 12.sp,
            text = "Tertiaryは主に下記に使用されます。\n"+
                    "　1.アクセントとして注目させたいもの（Button)\n"
        )

        Text(
            fontSize = 18.sp,
            text = "Button一覧"
        )
        Column() {
            ColorType.values().forEach {
                UtilButton(it.name, it)
            }
        }

        Text(
            fontSize = 18.sp,
            text = "Filterサンプル"
        )
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

        Text(
            fontSize = 18.sp,
            text = "色の実装方法"
        )
        Text(
            fontSize = 14.sp,
            text = "色を実装するときは下記のリンクから色を選択して「Color.kt」「Theme.kt」を貼り付けてください。\n" +
                    "https://m3.material.io/theme-builder#/custom"
        )

    }
}
