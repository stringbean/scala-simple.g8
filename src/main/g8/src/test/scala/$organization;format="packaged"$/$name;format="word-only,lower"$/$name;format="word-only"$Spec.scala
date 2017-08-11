package $organization$.$name;format="word-only,lower"$

import org.scalatest._

class $name;format="word-only"$Spec extends FlatSpec with Matchers {
  val $name;format="word-only,lower"$ = new $name;format="word-only"$

  "greet" should "greet bob" in {
    $name;format="word-only,lower"$.greet("bob") shouldBe "hello, bob"
  }

}
