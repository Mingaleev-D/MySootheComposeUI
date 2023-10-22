package com.example.mysoothecomposeui.ui.home_screen

import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.FabPosition
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Spa
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mysoothecomposeui.model.alignYourBodyCollections
import com.example.mysoothecomposeui.model.alignYourMindCollections
import com.example.mysoothecomposeui.model.favoriteCollectionsOne
import com.example.mysoothecomposeui.model.favoriteCollectionsTwo
import com.example.mysoothecomposeui.ui.home_screen.components.CollectionRow
import com.example.mysoothecomposeui.ui.home_screen.components.FavoriteCollectionRow
import com.example.mysoothecomposeui.ui.login_screen.components.MySootheTextField
import com.example.mysoothecomposeui.ui.theme.MySootheComposeUITheme

/**
 * @author : Mingaleev D
 * @data : 22.10.2023
 */

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeScreen() {

   Scaffold(
       bottomBar = {
          BottomNavBar()
       },
       floatingActionButton = {
          FloatingActionButton(onClick = { /*TODO*/ }) {
             Icon(
                 imageVector = Icons.Default.PlayArrow,
                 contentDescription = null
             )
          }
       },
       floatingActionButtonPosition = FabPosition.Center,
       isFloatingActionButtonDocked = true
   ) {
      HomeScreenContent(
          modifier = Modifier.padding(paddingValues = it)
      )
   }


}

@Composable
private fun HomeScreenContent(
    modifier: Modifier = Modifier
) {
   Surface(
       modifier = modifier.fillMaxSize(),
       color = MaterialTheme.colors.background
   ) {

      Column {

         Spacer(modifier = Modifier.height(56.dp))

         MySootheTextField(
             label = "Search",
             icon = Icons.Default.Search,
             modifier = Modifier.padding(horizontal = 16.dp)
         )

         FavoriteCollectionSelection()

         AlignYorBodySection()

         AlignYourMindSection()
      }

   }
}

@Composable
private fun BottomNavBar() {

   BottomAppBar(
       backgroundColor = MaterialTheme.colors.background
   ) {

      BottomNavigationItem(
          selected = true,
          onClick = { /*TODO*/ },
          icon = {
             Icon(
                 imageVector = Icons.Default.Spa,
                 contentDescription = null
             )
          },
          label = {
             Text(text = "Spa")
          }
      )

      BottomNavigationItem(
          selected = true,
          onClick = { /*TODO*/ },
          icon = {
             Icon(
                 imageVector = Icons.Default.AccountCircle,
                 contentDescription = null
             )
          },
          label = {
             Text(text = "Profile")
          }
      )
   }

}

@Composable
private fun AlignYourMindSection() {

   Column(
       verticalArrangement = Arrangement.spacedBy(8.dp)
   ) {
      Text(
          text = "ALIGN YOUR MIND",
          modifier = Modifier
              .paddingFromBaseline(40.dp)
              .padding(horizontal = 16.dp),
          style = MaterialTheme.typography.h2
      )

      CollectionRow(collections = alignYourMindCollections)

   }
}

@Composable
private fun AlignYorBodySection() {

   Column(
       verticalArrangement = Arrangement.spacedBy(8.dp)
   ) {
      Text(
          text = "ALIGN YOUR BODY",
          modifier = Modifier
              .paddingFromBaseline(40.dp)
              .padding(horizontal = 16.dp),
          style = MaterialTheme.typography.h2
      )

      CollectionRow(collections = alignYourBodyCollections)

   }
}

@Composable
private fun FavoriteCollectionSelection() {

   Column(
       verticalArrangement = Arrangement.spacedBy(8.dp)
   ) {
      Text(
          text = "FAVORITE COLLECTIONS",
          modifier = Modifier
              .paddingFromBaseline(40.dp)
              .padding(horizontal = 16.dp),
          style = MaterialTheme.typography.h2
      )

      FavoriteCollectionRow(collections = favoriteCollectionsOne)

      FavoriteCollectionRow(collections = favoriteCollectionsTwo)
   }

}

@Preview(
    name = "Ночь-Night Mode",
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Preview(
    name = "День-Day Mode",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    showBackground = true
)
@Composable
private fun HomeScreenPreview() {
   MySootheComposeUITheme {
      HomeScreen()
   }
}