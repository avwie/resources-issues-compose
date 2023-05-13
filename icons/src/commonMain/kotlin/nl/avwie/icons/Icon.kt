package nl.avwie.icons

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.*

@OptIn(ExperimentalResourceApi::class)
@Composable fun ComposeIcon() {
    Image(
            painterResource("icons/compose.xml"),
            contentDescription = "Delete",
            modifier = Modifier.size(32.dp)
    )
}