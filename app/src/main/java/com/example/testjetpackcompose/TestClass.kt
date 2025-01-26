///********************************************/
//package com.example.testjetpackcompose
//
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.PaddingValues
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//import androidx.compose.foundation.layout.width
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.foundation.shape.CircleShape
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.KeyboardArrowLeft
//import androidx.compose.material.icons.filled.MoreVert
//import androidx.compose.material3.Button
//import androidx.compose.material3.DropdownMenu
//import androidx.compose.material3.DropdownMenuItem
//import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.Icon
//import androidx.compose.material3.IconButton
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Text
//import androidx.compose.material3.TopAppBar
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.res.stringResource
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        setContent {
//            SamplePage()
////            CustomNavigationBar(onBackClicked = { /*TODO*/ }) {
////
////            }
//        }
//    }
//}
//
//@Composable
//fun SamplePage() {
//    val moreMenuItems = listOf("Option 1", "Option 2", "Option 3")
//    var isMenuExpanded by remember { mutableStateOf(false) }
//
//    Scaffold(
////        topBar = {
////            TopAppBarWithBackAndMore(
////                onBackPressed = { /* Handle back press */ },
////                onMoreOptionsClicked = { isMenuExpanded = !isMenuExpanded },
////                isMenuExpanded = isMenuExpanded,
////                menuItems = moreMenuItems,
////                onMenuItemClick = { selectedItem -> println("Selected item: $selectedItem") }
////            )
////        },
//        content = { paddingValues ->
//            SamplePageContent(paddingValues = paddingValues)
//        },
//        bottomBar = {
//            BottomButton(
//                onClick = { /* Handle bottom button click */ }
//            )
//        },
////        containerColor = Color(0xFF6200EE)
//        containerColor = Color(0xFF808080)
//
//    )
//}
//
////@Composable
////fun CustomNavigationBar(
////    onBackClicked: () -> Unit,
////    onMoreClicked: () -> Unit
////) {
////    Row(
////        modifier = Modifier
////            .fillMaxWidth()
////            .padding(16.dp),
////        horizontalArrangement = Arrangement.SpaceBetween,
////        verticalAlignment = Alignment.CenterVertically
////    ) {
////        // Back icon (left side)
////        IconButton(onClick = onBackClicked) {
////            Icon(
////                imageVector = Icons.Filled.KeyboardArrowLeft,
////                contentDescription = "Back",
////                tint = Color.Black
////            )
////        }
////
////        // Spacer to create space between the icons
////        Spacer(modifier = Modifier.weight(1f))
////
////        // More icon (right side)
////        IconButton(onClick = onMoreClicked) {
////            Icon(
////                imageVector = Icons.Filled.MoreVert,
////                contentDescription = "More",
////                tint = Color.Black
////            )
////        }
////    }
////}
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun CustomNavigationBar(
//    onBackClicked: () -> Unit,
//    onMoreClicked: () -> Unit
//) {
//    var isMenuExpanded by remember { mutableStateOf(false) }  // State to manage dropdown menu visibility
//    val menuItems = listOf("Option 1", "Option 2", "Option 3")
//
//    Row(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(16.dp),
//        horizontalArrangement = Arrangement.SpaceBetween,
//        verticalAlignment = Alignment.CenterVertically
//    ) {
//        // Back icon (left side)
//        IconButton(onClick = onBackClicked) {
//            Icon(
//                imageVector = Icons.Filled.KeyboardArrowLeft,
//                contentDescription = "Back",
//                tint = Color.Black
//            )
//        }
//
//        // Spacer to create space between the icons
//        Spacer(modifier = Modifier.weight(1f))
//
//        DropdownMenu(
//            expanded = isMenuExpanded,
//            onDismissRequest = { isMenuExpanded = false },
//            modifier = Modifier
//                .clip(RoundedCornerShape(16.dp)) // Apply rounded corners to the entire dropdown menu
//                .background(MaterialTheme.colorScheme.surface)
//        ) {
//            menuItems.forEach { item ->
//                DropdownMenuItem(
//                    text = { Text(text = item) },
//                    onClick = {
////                        onMenuItemClick(item)
////                        onMoreOptionsClicked()
//                        isMenuExpanded = false
//                    }
//                )
//            }
//        }
//    }
//
////        // More icon (right side)
////        IconButton(onClick = { expanded = !expanded }) {  // Toggle dropdown menu visibility
////            Icon(
////                imageVector = Icons.Filled.MoreVert,
////                contentDescription = "More",
////                tint = Color.Black
////            )
////        }
//    }
//
////    // Dropdown Menu
////    DropdownMenu(
////        expanded = expanded,
////        onDismissRequest = { expanded = false }  // Dismiss menu when clicked outside
////    ) {
//////        DropdownMenuItem(onClick = {
//////            // Handle item 1 action
//////            onMoreClicked()
//////            expanded = false
//////        }) {
//////            Text("Option 1")
//////        }
//////        DropdownMenuItem(onClick = {
//////            // Handle item 2 action
//////            expanded = false
//////        }) {
//////            Text("Option 2")
//////        }
//////        DropdownMenuItem(onClick = {
//////            // Handle item 3 action
//////            expanded = false
//////        }) {
//////            Text("Option 3")
//////        }
////
////        DropdownMenuItem(text = { Text(text = "Option1") }, onClick = { /*TODO*/ })
////        DropdownMenuItem(text = { Text(text = "Option2") }, onClick = { /*TODO*/ })
////        DropdownMenuItem(text = { Text(text = "Option3") }, onClick = { /*TODO*/ })
////    }
//
//
//
//@Composable
//fun SamplePageContent(paddingValues: PaddingValues) {
//
//    LazyColumn(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(paddingValues)
//    ) {
//        item {
//            CustomNavigationBar(
//                onBackClicked = { /* Handle back button click */ },
//                onMoreClicked = { /* Handle more button click */ }
//            )
//        }
//
//        item {
//            CenteredImage(modifier = Modifier.padding(top = 16.dp))
//            Spacer(modifier = Modifier.height(10.dp)) // Gap between image and text
//        }
//        item {
//            DeviceAliasName(text = "ABED")
//            Spacer(modifier = Modifier.height(10.dp)) // Gap between image and text
//        }
//        item {
//            DeviceModelName(text = "SM-R975")
//            Spacer(modifier = Modifier.height(10.dp)) // Gap between image and text
//        }
//        item {
//            ContentText("This is the first text.")
//            Spacer(modifier = Modifier.height(10.dp)) // Gap between texts
//        }
//        item {
//            ContentText("This is the second text.")
//            Spacer(modifier = Modifier.height(10.dp)) // Gap between texts
//        }
//        items(2) { index ->
//            Box(modifier = Modifier.background(Color(0xFFFF0000))) {
//                ListItem(item = "Item ${index + 1}", paddingValues)
//            }
//        }
//    }
//}
//
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun TopAppBarWithBackAndMore(
//    onBackPressed: () -> Unit,
//    onMoreOptionsClicked: () -> Unit,
//    isMenuExpanded: Boolean,
//    menuItems: List<String>,
//    onMenuItemClick: (String) -> Unit // Add a callback to handle item click
//) {
//    TopAppBar(
//        title = { Text(text = stringResource(id = R.string.sample_page_title)) },
//        navigationIcon = {
//            IconButton(onClick = onBackPressed) {
//                Icon(Icons.Filled.KeyboardArrowLeft, contentDescription = "Back")
//            }
//        },
//        actions = {
//            IconButton(onClick = onMoreOptionsClicked) {
//                Icon(Icons.Filled.MoreVert, contentDescription = "More Options")
//            }
//            DropdownMenu(
//                expanded = isMenuExpanded,
//                onDismissRequest = { onMoreOptionsClicked() },
//                modifier = Modifier
//                    .clip(RoundedCornerShape(16.dp)) // Apply rounded corners to the entire dropdown menu
//                    .background(MaterialTheme.colorScheme.surface)
//            ) {
//                menuItems.forEach { item ->
//                    DropdownMenuItem(
//                        text = { Text(text = item) },
//                        onClick = {
//                            onMenuItemClick(item)
//                            onMoreOptionsClicked()
//                        }
//                    )
//                }
//            }
//        }
//    )
//}
//
//@Composable
//fun CenteredImage(modifier: Modifier = Modifier) {
//    Box(
//        modifier = modifier.fillMaxWidth()
//    ) {
//        Image(
//            painter = painterResource(id = R.drawable.sample_image), // Replace with your image
//            contentDescription = stringResource(id = R.string.sample_image_description),
//            modifier = Modifier
//                .size(100.dp)
//                .clip(CircleShape)
//                .align(Alignment.Center) // This centers the image inside the Box
//        )
//    }
//}
//
//@Composable
//fun DeviceAliasName(text: String) {
//    Row(
//        modifier = Modifier
//            .fillMaxWidth() // Ensures that the Row takes up the full width
//            .padding(horizontal = 16.dp),
//        horizontalArrangement = Arrangement.Center // Centers the content horizontally within the Row
//    ) {
//        Text(text = text)
//    }
//}
//
//@Composable
//fun DeviceModelName(text: String) {
//    Row(
//        modifier = Modifier
//            .fillMaxWidth() // Ensures that the Row takes up the full width
//            .padding(horizontal = 16.dp),
//        horizontalArrangement = Arrangement.Center // Centers the content horizontally within the Row
//    ) {
//        Text(text = text)
//    }
//}
//
//@Composable
//fun ContentText(text: String) {
//    Text(
//        text = text,
//        modifier = Modifier.padding(horizontal = 16.dp)
//    )
//}
//
//@Composable
//fun ListItem(item: String, paddingValues: PaddingValues) {
//    Row(
//        modifier = Modifier
//            .fillMaxWidth() // Fill the width to allow centering
//            .padding(vertical = 8.dp), // Vertical padding for each item
//        horizontalArrangement = Arrangement.Start, // Center items horizontally in the row
//        verticalAlignment = Alignment.CenterVertically // Align items vertically
//    ) {
//        Box(
//            modifier = Modifier
//                .padding(start = 16.dp)
//                .background(Color(0xFFFFEB3B))
//        ) {
//            Image(
//                painter = painterResource(id = R.drawable.sample_image), // Replace with your image
//                contentDescription = stringResource(id = R.string.sample_image_description),
//                modifier = Modifier
//                    .size(24.dp)
//                    .clip(CircleShape)
//                    .align(Alignment.Center) // This centers the image inside the Box
//            )
//        }
//
//        Spacer(modifier = Modifier.width(16.dp)) // Space between image and text
//
//        Box(modifier = Modifier.background(Color(0xFF4CAF50))) {
//            Column(
//                horizontalAlignment = Alignment.Start
//            ) {
//                Text(text = item, style = MaterialTheme.typography.bodyLarge)
//                Text(text = "Backup data time", style = MaterialTheme.typography.bodySmall)
//                Text(text = "Backup data size", style = MaterialTheme.typography.bodySmall)
//            }
//        }
//    }
//}
//
//@Composable
//fun BottomButton(onClick: () -> Unit) {
//    Button(
//        onClick = onClick,
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(16.dp)
//    ) {
//        Text(stringResource(id = R.string.bottom_button_text))
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun PreviewSamplePage() {
//    SamplePage()
//}
