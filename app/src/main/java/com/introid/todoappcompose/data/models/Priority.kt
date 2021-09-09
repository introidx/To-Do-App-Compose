package com.introid.todoappcompose.data.models

import androidx.compose.ui.graphics.Color
import com.introid.todoappcompose.ui.theme.highPriorityColor
import com.introid.todoappcompose.ui.theme.lowPriorityColor
import com.introid.todoappcompose.ui.theme.mediumPriorityColor
import com.introid.todoappcompose.ui.theme.nonePriorityColor

enum class Priority(val color : Color) {
    HIGH(highPriorityColor),
    MEDIUM(mediumPriorityColor),
    LOW(lowPriorityColor),
    NONE(nonePriorityColor)
}