import scala.io.Source

val filename = args(0)
val src = Source.fromFile(filename) // オブジェクトを取得
var charCount = 0
var wordCount = 0
var lineCount = 0
val lines = src.getLines
for (line <- lines) {
  charCount += line.length
  val words = line.split(" ") // 単語に分解
  wordCount += words.length
  lineCount += 1
}
println("文字数 = %s, 単語数 = %s, 行数 = %s".format(charCount, wordCount, lineCount))
