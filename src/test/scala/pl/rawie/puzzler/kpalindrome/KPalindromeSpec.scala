package pl.rawie.puzzler.kpalindrome

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FunSpec

class KPalindromeSpec extends FunSpec with ShouldMatchers {
  describe("kpalindrome (k = 0)") {
    def kp(s: String): Boolean = kpalindrome(s, 0)

    it("should return true for palindrome") {
      kp("") should equal(true)
      kp("a") should equal(true)
      kp("aa") should equal(true)
      kp("aba") should equal(true)
      kp("abba") should equal(true)
      kp("abcba") should equal(true)
    }

    it("should return false for one step palindrome") {
      kp("aab") should equal(false)
      kp("abab") should equal(false)
      kp("abcab") should equal(false)
    }
  }

  describe("kpalindrome (k = 1)") {
    def kp(s: String): Boolean = kpalindrome(s, 1)

    it("should return true for palindrome") {
      kp("") should equal(true)
      kp("a") should equal(true)
      kp("aa") should equal(true)
      kp("aba") should equal(true)
      kp("abba") should equal(true)
      kp("abcba") should equal(true)
    }

    it("should return true for one step palindrome") {
      kp("aab") should equal(true)
      kp("abab") should equal(true)
      kp("abcab") should equal(true)
    }

    it("should return false for two step palindrome") {
      kp("baabc") should equal(false)
    }
  }

  describe("kpalindrome (k = 2)") {
    def kp(s: String): Boolean = kpalindrome(s, 2)

    it("should return true for palindrome") {
      kp("") should equal(true)
      kp("a") should equal(true)
      kp("aa") should equal(true)
      kp("aba") should equal(true)
      kp("abba") should equal(true)
      kp("abcba") should equal(true)
    }

    it("should return true for one step palindrome") {
      kp("aab") should equal(true)
      kp("abab") should equal(true)
      kp("abcab") should equal(true)
    }

    it("should return false for two step palindrome") {
      kp("baabc") should equal(true)
    }

    it("should return false for three step palindrome") {
      kp("aaccdedbb") should equal(false)
    }
  }
}
