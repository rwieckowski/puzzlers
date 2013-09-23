package pl.rawie.puzzler

package object fizzbuzz {
  private def isDivisible(n: Int, m: Int): Boolean = n % m == 0

  private def has(n: Int, m: Int): Boolean = n.toString contains(m.toString)

  def fizzbuzz(n: Int): Any = n match {
    case n if isDivisible(n, 15) || (has(n, 3) && has(n, 5)) => "fizzbuzz"
    case n if isDivisible(n, 3) || has(n, 3) => "fizz"
    case n if isDivisible(n, 5) || has(n, 5) => "buzz"
    case _ => n
  }
}
