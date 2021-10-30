package com.introid.todoappcompose.navigation.destiations

import android.util.Log
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import com.introid.todoappcompose.util.Action
import com.introid.todoappcompose.util.Constants
import com.introid.todoappcompose.util.Constants.TASK_ARGUMENT_KEY
import com.introid.todoappcompose.util.Constants.TASK_SCREEN

fun NavGraphBuilder.taskComposable(
    navigateToListScreen : (Action) -> Unit
){
    composable(
        route = TASK_SCREEN,
        arguments = listOf(navArgument(TASK_ARGUMENT_KEY){
            type = NavType.IntType
        })
    ){ navBackStackEntry ->
        val taskId = navBackStackEntry.arguments!!.getInt(TASK_ARGUMENT_KEY)
        Log.d("TaskComposable",  taskId.toString())


    }
}