import scala.io.Source

val filename = args(0)
val src = Source.fromFile(filename) // オブジェクトを取得
val lines = src.getLines
for (line <- lines) {
  println(line)
}
