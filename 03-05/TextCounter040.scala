import scala.io.Source

val filename = args(0)
val src = Source.fromFile(filename) // オブジェクトを取得
var charCount = 0
var lineCount = 0
val lines = src.getLines
for (line <- lines) {
  charCount += line.length
  lineCount += 1
}
println("文字数 = " + charCount + ", 行数 = " + lineCount)
