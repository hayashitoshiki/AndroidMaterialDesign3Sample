package com.myapp.androidmaterialdesign3sample.ui.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex


@Composable
fun FilledButtonUtil(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    text: String
) {
    Button(
        modifier = modifier,
        onClick = { onClick() }
    ) {
        LabelTextL(text = text)
    }
}

@Composable
fun OutlinedButtonUtil(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    text: String
) {
    OutlinedButton(
        modifier = modifier,
        onClick = { onClick() }
    ) {
        LabelTextL(text = text)
    }
}

@Composable
fun ElevatedButtonUtil(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    text: String
) {
    ElevatedButton(
        modifier = modifier,
        onClick = { onClick() }
    ) {
        LabelTextL(text = text)
    }
}

@Composable
fun FilledTonalButtonUtil(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    text: String
) {
    FilledTonalButton(
        modifier = modifier,
        onClick = { onClick() }
    ) {
        LabelTextL(text = text)
    }
}
@Composable
fun TextButtonUtil(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    text: String
) {
    TextButton(
        modifier = modifier,
        onClick = { onClick() }
    ) {
        LabelTextL(text = text)
    }
}

@Composable
fun IconButtonUtil(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    icons: ImageVector,
    contentDescription: String = "",
) {
    IconButton(
        modifier = modifier,
        onClick = { onClick() }
    ) {
        Icon(icons, contentDescription = contentDescription)
    }
}

@Composable
fun FloatingActionButtonUtil(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    icons: ImageVector,
    contentDescription: String = "",
    size: FabSize = FabSize.MEDIUM,
    color: FabColor = FabColor.SECONDARY
) {
    when(size) {
        FabSize.LARGE -> {
            LargeFloatingActionButton(
                modifier = modifier,
                containerColor = color.containerColor,
                contentColor = color.contentColor,
                onClick = { onClick() }
            ) {
                Icon(icons, contentDescription = contentDescription)
            }
        }
        FabSize.MEDIUM -> {
            FloatingActionButton(
                modifier = modifier,
                containerColor = color.containerColor,
                contentColor = color.contentColor,
                onClick = { onClick() }
            ) {
                Icon(icons, contentDescription = contentDescription)
            }
        }
        FabSize.SMALL -> {
            SmallFloatingActionButton(
                modifier = modifier,
                containerColor = color.containerColor,
                contentColor = color.contentColor,
                onClick = { onClick() }
            ) {
                Icon(icons, contentDescription = contentDescription)
            }
        }
    }
}

@Composable
fun ExtendedFloatingActionButtonUtil(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    text: String = "",
    icons: ImageVector,
    contentDescription: String = "",
    color: FabColor = FabColor.SECONDARY
) {
    ExtendedFloatingActionButton(
        modifier = modifier,
        containerColor = color.containerColor,
        contentColor = color.contentColor,
        onClick = { onClick() },
        icon = { Icon(icons, contentDescription = contentDescription) },
        text = { Text(text) }
    )
}

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

enum class FabSize {
    LARGE,
    MEDIUM,
    SMALL
}

enum class FabColor {
    SURFACE,
    SECONDARY,
    TERTIARY;

    val containerColor: Color
        @Composable
        get() = when(this) {
            SURFACE -> MaterialTheme.colorScheme.surface
            SECONDARY -> MaterialTheme.colorScheme.secondaryContainer
            TERTIARY -> MaterialTheme.colorScheme.tertiary
        }

    val contentColor: Color
        @Composable
        get() = when(this) {
            SURFACE -> MaterialTheme.colorScheme.primary
            SECONDARY -> MaterialTheme.colorScheme.onSecondaryContainer
            TERTIARY -> MaterialTheme.colorScheme.onTertiaryContainer
        }
}


@Composable
fun SegmentedControl(
    items: List<String>,
    selectedIndex: MutableState<Int>
) {
    Row(
        modifier = Modifier
    ) {
        items.forEachIndexed { index, item ->
            OutlinedButton(
                modifier = when (index) {
                    0 -> {
                        Modifier
                            .height(40.dp)
                            .wrapContentWidth()
                            .offset(0.dp, 0.dp)
                            .zIndex(if (selectedIndex.value == index) 1f else 0f)
                    } else -> {
                        Modifier
                            .height(40.dp)
                            .wrapContentWidth()
                            .offset((-1 * index).dp, 0.dp)
                            .zIndex(if (selectedIndex.value == index) 1f else 0f)
                    }
                },
                onClick = { selectedIndex.value = index },
                shape = when (index) {
                    0 -> RoundedCornerShape(
                            topStartPercent = 100,
                        topEndPercent = 0,
                        bottomStartPercent = 100,
                        bottomEndPercent = 0
                    )
                    items.size - 1 -> RoundedCornerShape(
                        topStartPercent = 0,
                        topEndPercent = 100,
                        bottomStartPercent = 0,
                        bottomEndPercent = 100
                    )
                    else -> RoundedCornerShape(
                        topStartPercent = 0,
                        topEndPercent = 0,
                        bottomStartPercent = 0,
                        bottomEndPercent = 0
                    )
                },
                border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline),
                colors = if (selectedIndex.value == index) {
                    ButtonDefaults.outlinedButtonColors(containerColor = MaterialTheme.colorScheme.secondaryContainer)
                } else {
                    ButtonDefaults.outlinedButtonColors(containerColor = Color.Transparent)
                },
            ) {
                LabelTextL(
                    text = item,
                    color = if (selectedIndex.value == index) {
                        MaterialTheme.colorScheme.onSecondaryContainer
                    } else {
                        MaterialTheme.colorScheme.onSurface
                    },
                )
            }
        }
    }
}