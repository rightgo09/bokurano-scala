def plus(numbers: Int*): Int = {
  var sum = 0
  for (number <- numbers) {
    sum += number
  }
  sum
}
