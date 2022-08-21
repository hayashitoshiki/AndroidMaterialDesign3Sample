package com.myapp.androidmaterialdesign3sample.ui.component

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector


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
