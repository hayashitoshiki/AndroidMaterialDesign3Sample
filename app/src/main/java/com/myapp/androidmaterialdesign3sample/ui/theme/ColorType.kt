package com.myapp.androidmaterialdesign3sample.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

/**
 * 色定義
 *
 * Component定義で使用できる色の種別を定義しています。
 *
 */
enum class ColorType {
    PRIMARY,
    PRIMARY_CONTAINER,
    SECONDARY,
    SECONDARY_CONTAINER,
    TERTIARY,
    TERTIARY_CONTAINER;

    /**
     * 各配色の背景色を返します。
     *
     * @return 背景色
     */
    @Composable
    fun getColor(): Color = when(this){
        PRIMARY -> MaterialTheme.colorScheme.primary
        SECONDARY -> MaterialTheme.colorScheme.secondary
        TERTIARY -> MaterialTheme.colorScheme.tertiary
        PRIMARY_CONTAINER -> MaterialTheme.colorScheme.primaryContainer
        SECONDARY_CONTAINER -> MaterialTheme.colorScheme.secondaryContainer
        TERTIARY_CONTAINER -> MaterialTheme.colorScheme.tertiaryContainer
    }


    /**
     * 各配色上のコンテンツ色を返します。
     *
     * @return コンテンツ色
     */
    @Composable
    fun getOnColor(): Color = when(this){
        PRIMARY -> MaterialTheme.colorScheme.onPrimary
        SECONDARY -> MaterialTheme.colorScheme.onSecondary
        TERTIARY -> MaterialTheme.colorScheme.onTertiary
        PRIMARY_CONTAINER -> MaterialTheme.colorScheme.onPrimaryContainer
        SECONDARY_CONTAINER -> MaterialTheme.colorScheme.onSecondaryContainer
        TERTIARY_CONTAINER -> MaterialTheme.colorScheme.onTertiaryContainer
    }
}