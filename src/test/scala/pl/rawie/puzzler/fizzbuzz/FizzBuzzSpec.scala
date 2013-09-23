package pl.rawie.puzzler.fizzbuzz

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FunSpec

class FizzBuzzSpec extends FunSpec with ShouldMatchers {
  describe("fizzbuzz") {
    it("should return number for numbers not divisible by 3 or 5") {
      fizzbuzz(1) should equal(1)
      fizzbuzz(2) should equal(2)
      fizzbuzz(4) should equal(4)
      fizzbuzz(7) should equal(7)
      fizzbuzz(8) should equal(8)
    }

    it("should return fizz for numbers divisible by 3") {
      fizzbuzz(3) should equal("fizz")
      fizzbuzz(6) should equal("fizz")
      fizzbuzz(9) should equal("fizz")
      fizzbuzz(12) should equal("fizz")
    }

    it("should return buzz for numbers divisible by 5") {
      fizzbuzz(5) should equal("buzz")
      fizzbuzz(10) should equal("buzz")
      fizzbuzz(20) should equal("buzz")
    }

    it("should return fizzbuzz for numbers divisible by 3 and 5") {
      fizzbuzz(15) should equal("fizzbuzz")
      fizzbuzz(30) should equal("fizzbuzz")
    }

    it("should return fizz for number has 3 in it") {
      fizzbuzz(13) should equal("fizz")
      fizzbuzz(23) should equal("fizz")
      fizzbuzz(43) should equal("fizz")
    }

    it("should return buzz for numbers has 5 in it") {
      fizzbuzz(151) should equal("buzz")
      fizzbuzz(152) should equal("buzz")
      fizzbuzz(154) should equal("buzz")
    }

    it("should return buzz for numbers has 3 and 5 in it") {
      fizzbuzz(153) should equal("fizzbuzz")
      fizzbuzz(253) should equal("fizzbuzz")
    }
  }
}
