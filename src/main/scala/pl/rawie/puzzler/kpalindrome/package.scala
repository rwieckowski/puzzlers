package pl.rawie.puzzler

package object kpalindrome {
  def kpalindrome(s: String, k: Int): Boolean = {
    if (s.length <= 1) true
    else if (s.head == s.last) kpalindrome(s substring(1, s.length - 1), k
    )
    else false
  }
}
