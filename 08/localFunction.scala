def make10List(numbers: List[Int]): String = {
  val buf = new StringBuilder

  def build(num: Int) { // ローカル関数
    buf.append((num * 10).toString)
  }

  if (!numbers.isEmpty) {
    build(numbers(0))
    for (num <- numbers.drop(1)) {
      buf.append(", ")
      build(num)
    }
  }
  buf.toString
}
