import scala.io.Source

val filename: String = args(0)
val src: Source = Source.fromFile(filename) // オブジェクトを取得
var charCount: Int = 0
var lineCount: Int = 0
val lines: Iterator[String] = src.getLines
for (line: String <- lines) {
  charCount += line.length
  lineCount += 1
}
println("文字数 = " + charCount + ", 行数 = " + lineCount)
