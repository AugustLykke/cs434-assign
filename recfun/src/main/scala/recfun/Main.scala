package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = 
    if (c == 0 || c == r) 1 else pascal(c-1, r-1) + pascal(c, r-1)

  /**
   * Exercise 2
   */

  def balance(chars: List[Char]): Boolean = {

    def balanceCounter(counter: Int, chars: List[Char]): Boolean = {
      if (chars.isEmpty && counter == 0) true
      else if (chars.isEmpty && counter != 0 || counter < 0) false
      else {
        val newPar = if (chars.head == '(') 1 else if (chars.head == ')') -1 else 0
        balanceCounter(counter + newPar, chars.tail)
      }
    }

    balanceCounter(0, chars)
  }
  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    def countChangeRec(money: Int, coins: List[Int]): Int = {
      if (money == 0) 1
      else if (coins.isEmpty || money < 0) 0
      else{
        val diff = money - coins.head
        countChangeRec(diff, coins) + countChangeRec(money, coins.tail)
    }
  }
   countChangeRec(money, coins.sorted.reverse)
  }
}
