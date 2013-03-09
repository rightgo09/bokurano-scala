def findValue(list: List[Int], value: Int): Int = {
  for (v <- list) {
    if (v >= value) {
      return v
    }
  }
  0
}
