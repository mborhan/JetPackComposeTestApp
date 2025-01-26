package com.example.testjetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomPopupExample() {
    // State to control the visibility of the bottom sheet
    var isBottomSheetVisible by remember { mutableStateOf(false) }

    // State for the bottom sheet
    val bottomSheetState = rememberModalBottomSheetState()

    // Handling the bottom sheet visibility
    LaunchedEffect(isBottomSheetVisible) {
        if (isBottomSheetVisible) {
            bottomSheetState.show()
        } else {
            bottomSheetState.hide()
        }
    }

    // ModalBottomSheet for the bottom sheet layout
    ModalBottomSheet(
        sheetState = bottomSheetState,
        onDismissRequest = { isBottomSheetVisible = false }, // Close on outside click
        content = { BottomSheetContent(onDismiss = { isBottomSheetVisible = false }) }
    )

    // Main content
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Button(onClick = { isBottomSheetVisible = true }) {
            Text(text = "Open Bottom Popup")
        }
    }
}

@Composable
fun BottomSheetContent(onDismiss: () -> Unit) {
    // Bottom sheet content with title, progress indicator, and buttons
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clip(MaterialTheme.shapes.medium) // Rounded corners for the bottom sheet
    ) {
        // Title
        Text(
            text = "Loading, please wait...",
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // Progress indicator
        CircularProgressIndicator(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(bottom = 16.dp)
        )

        // Buttons: Cancel and Confirm
        ActionButtons(onDismiss = onDismiss)
    }
}

@Composable
fun ActionButtons(onDismiss: () -> Unit) {
    // Row to hold Cancel and Confirm buttons
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        // Cancel button
        Button(
            onClick = onDismiss,
            modifier = Modifier.weight(1f)
        ) {
            Text(text = "Cancel")
        }

        Spacer(modifier = Modifier.width(8.dp)) // Space between buttons

        // Confirm button
        Button(
            onClick = onDismiss,
            modifier = Modifier.weight(1f)
        ) {
            Text(text = "Confirm")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBottomPopup() {
    BottomPopupExample()
}
