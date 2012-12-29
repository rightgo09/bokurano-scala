import junit.framework.TestCase
import junit.framework.Assert._

class HelloWorld {
  def greeting(): String = {
    sys.error("greeting")
  }

  def greeting(message: String): String = {
    sys.error("greeting(String)")
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
