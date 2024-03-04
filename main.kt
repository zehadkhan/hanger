import java.io.File
import java.util.*

fun main() {
    val imagePath = "path/to/image.jpg"
    val base64String = encodeFileToBase64Binary(imagePath)
    println(base64String)
    println("Conversion done,complte file")
}

fun encodeFileToBase64Binary(filePath: String): String {
    val file = File(filePath)
    val bytes = file.readBytes()
    return Base64.getEncoder().encodeToString(bytes)
}