package com.introid.todoappcompose.navigation.destiations

import androidx.compose.material.ExperimentalMaterialApi
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import com.introid.todoappcompose.ui.screens.list.ListScreen
import com.introid.todoappcompose.ui.viewmodels.SharedViewModel
import com.introid.todoappcompose.util.Constants.LIST_ARGUMENT_KEY
import com.introid.todoappcompose.util.Constants.LIST_SCREEN

@ExperimentalMaterialApi
fun NavGraphBuilder.listComposable(
    navigateToTaskScreen : (taskId : Int) -> Unit,
    sharedViewModel: SharedViewModel
){
    composable(
        route = LIST_SCREEN,
        arguments = listOf(navArgument(LIST_ARGUMENT_KEY){
            type = NavType.StringType
        })
    ){
        ListScreen(
            navigateToTaskScreen = navigateToTaskScreen,
            sharedViewModel = sharedViewModel

            )
    }
}