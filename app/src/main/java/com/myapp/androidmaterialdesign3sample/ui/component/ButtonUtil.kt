package com.myapp.androidmaterialdesign3sample.ui.component

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.myapp.androidmaterialdesign3sample.ui.theme.ColorType


/**
 * M3用Buttonコンポーネント
 *
 * @param text
 * @param colorType
 */
@Composable
fun UtilButton(
    text: String,
    colorType: ColorType,
    onClick: () -> Unit
) {
    Button(
        colors = ButtonDefaults.textButtonColors(
            containerColor = colorType.getColor(),
            contentColor =  colorType.getOnColor()
        ),
        onClick = { onClick() }) {
        LabelTextL(text = text)
    }
}

/**
 * M3用Filterコンポーネント
 *
 * @param modifier
 * @param enabled
 * @param selected
 * @param onClick
 * @param label
 */
@ExperimentalMaterial3Api
@Composable
fun UtilFilter(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    selected: Boolean,
    label: String,
    onClick: () -> Unit,
) {
    FilterChip(
        modifier = modifier,
        enabled = enabled,
        selected = selected,
        onClick = onClick,
        label = { LabelTextS(text = label) }
    )
}

