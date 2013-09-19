package pl.rawie.puzzler

package object kpalindrome {
  def kpalindrome(s: String, k: Int): Boolean = {
    def indexes(s: String, c: Char): Seq[Int] =
      s.zipWithIndex filter(_._1 == c) map(_._2)
    def setChar(s: String, i: Int, c: Char): String = (s take i) + c + (s drop i + 1)

    if (s.length <= 1) true
    else if (s.head == s.last) kpalindrome(s substring(1, s.length - 1), k)
    else if (k > 0) {
      val inner = s substring(1, s.length - 1)
      val changes: List[(Char, Char)] = List((s.head, s.last), (s.last, s.head))
      val perms: List[String] = {
        for ((from, to) <- changes; i <- indexes(inner, from))
        yield setChar(inner, i, to)
      }
      perms
        .map(t => kpalindrome(t, k - 1))
        .foldRight(false)(_ || _)
    }
    else false
  }
}
