package $organization$.$name;format="word-only,lower"$

import org.scalatest._

class $name;format="word-space,upper-camel"$Spec extends FlatSpec with Matchers {
  val $name;format="word-space,lower-camel"$ = new $name;format="word-space,upper-camel"$()

  "greet" should "greet bob" in {
    $name;format="word-space,lower-camel"$.greet("bob") shouldBe "hello, bob"
  }

}
