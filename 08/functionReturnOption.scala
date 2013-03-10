def foo(value: Int): Option[String] = {
  if (value > 50) {
    Some(value.toString)
  }
  else {
    None
  }
}
