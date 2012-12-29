object HelloWorld { // オブジェクトHelloWorldの定義
  def main(args: Array[String]) {
    val greeting = new Greeting()
    greeting.hello()
  }
}

class Greeting { // クラスGreetingの定義
  def hello() {
    println("Hello World")
  }
}
