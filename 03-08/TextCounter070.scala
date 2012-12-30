import scala.io.Source

def countChar(filename: String): Int = { // 関数countChar
  val src = Source.fromFile(filename) // オブジェクトを取得
  var charCount = 0
  val lines = src.getLines
  for (line <- lines) {
    charCount += line.length
  }
  charCount
}

def countWord(filename: String): Int = { // 関数countWord
  val src = Source.fromFile(filename) // オブジェクトを取得
  var wordCount = 0
  val lines = src.getLines
  for (line <- lines) {
    val words = line.split(" ") // 単語に分解
    wordCount += words.length
  }
  wordCount
}

def countLine(filename: String): Int = { // 関数countLine
  val src = Source.fromFile(filename) // オブジェクトを取得
  var lineCount = 0
  val lines = src.getLines
  for (line <- lines) {
    lineCount += 1
  }
  lineCount
}

val filename = args(0)
val charCount = countChar(filename)
val wordCount = countWord(filename)
val lineCount = countLine(filename)
println("文字数 = %s, 単語数 = %s, 行数 = %s".format(charCount, wordCount, lineCount))
