package com.juandgaines.todoapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.juandgaines.todoapp.ui.theme.TodoAppTheme

@Composable
fun HelloWorld(
    modifier: Modifier = Modifier
){

    Text(
        modifier = modifier
            .background(Color.Yellow)
            ,
        text = "CABJ",
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 24.sp,
        color = Color.Blue,
    )
}
@Preview(showBackground = true)
@Composable
fun HelloWorldPreview() {
    TodoAppTheme{
        HelloWorld()
    }
}

@Composable
fun ClickableTextExample(
    modifier: Modifier = Modifier) {
    var text by remember { mutableStateOf("This is a text")}
    Text(
        text = text,
        fontSize = 16.sp,
        modifier = modifier.clickable {
            text = "You clicked this is a text again"
        }

    )

}

@Preview(showBackground = true)
@Composable
fun ClickableTextExamplePreview() {
    TodoAppTheme {
        ClickableTextExample()
    }
}



@Composable
fun RowView(){
    Row(modifier = Modifier.background(Color.Yellow).padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)

    ) {
        HelloWorld()
        IconExample( iconContainer = IconContainer(Icons.Default.Star,  Color.Blue))
    }
}

@Preview(showBackground = true)
@Composable
fun RowViewPreview() {
    TodoAppTheme {
        RowView()
    }
}

@Composable
fun IconExample(
    modifier: Modifier= Modifier,
    iconContainer: IconContainer,
){
    Icon(
        imageVector = iconContainer.icon,
        contentDescription = "Favorite Icon",
        tint = iconContainer.color,
        modifier = modifier
            .size(48.dp)
            .border(width = 1.dp, Color.Blue, shape = CircleShape)
            .padding(4.dp))
}
@Preview
@Composable
fun IconExamplePreview(
    @PreviewParameter(IconProvider::class) icon: IconContainer
) {
    TodoAppTheme {
        IconExample(
            iconContainer = icon
        )
    }
}

@Composable
fun ColumnView(){
    Column(modifier = Modifier.background(Color.Yellow).padding(8.dp),verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        HelloWorld()
        Row{
            IconExample( iconContainer = IconContainer(Icons.Default.Star, Color.Red))
            IconExample( iconContainer = IconContainer(Icons.Default.Favorite, Color.White))
            IconExample( iconContainer = IconContainer(Icons.Default.Star, Color.Black))
            IconExample( iconContainer = IconContainer(Icons.Default.Favorite,  Color.Black))
        }

    }
}

@Preview
@Composable
fun ColumnViewPreview() {
    TodoAppTheme {
        ColumnView()
    }
}