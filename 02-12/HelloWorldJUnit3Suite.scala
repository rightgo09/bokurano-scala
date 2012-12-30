import org.scalatest.junit.JUnit3Suite
import org.scalatest.junit.ShouldMatchersForJUnit
import junit.framework.Assert._

class HelloWorld {
  def greeting(): String = {
    "Hello World"
  }

  def greeting(message: String): String = {
    "Hello " + message
  }
}

class HelloWorldTest extends JUnit3Suite with ShouldMatchersForJUnit {
  def testGreeting() {
    val hello = new HelloWorld()
    hello.greeting() should be ("Hello World")
  }

  def testGreetingWithArg() {
    val hello = new HelloWorld()
    hello.greeting("World!") should be ("Hello World!")
  }
}
