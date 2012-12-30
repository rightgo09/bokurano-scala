import junit.framework.TestCase
import junit.framework.Assert._

class HelloWorld {
  def greeting(): String = {
    "Hello World"
  }

  def greeting(message: String): String = {
    "Hello " + message
  }
}

class HelloWorldTest extends TestCase {
  def testGreeting() {
    val hello = new HelloWorld()
    assertEquals("Hello World", hello.greeting())
  }

  def testGreetingWithArg() {
    val hello = new HelloWorld()
    assertEquals("Hello World!", hello.greeting("World!"))
  }
}
