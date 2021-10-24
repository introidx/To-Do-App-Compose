package com.introid.todoappcompose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.introid.todoappcompose.navigation.destiations.listComposable
import com.introid.todoappcompose.navigation.destiations.taskComposable
import com.introid.todoappcompose.ui.viewmodels.SharedViewModel
import com.introid.todoappcompose.util.Constants.LIST_SCREEN

@Composable
fun SetupNavigation(
    navController: NavHostController,
    sharedViewModel : SharedViewModel
) {
    val screen = remember(navController) {
        Screens(navController = navController)
    }
    NavHost(
        navController = navController,
        startDestination = LIST_SCREEN
    ) {
        listComposable(
            navigateToTaskScreen = screen.task,
            sharedViewModel = sharedViewModel
        )
        taskComposable(
            navigateToListScreen = screen.list
        )
    }

}