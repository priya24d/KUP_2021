//This class contains methods for performing reverse.

package ReverseCall

import scala.collection.immutable.List
import scala.io.StdIn._

object Reverse {
  def main(args: Array[String]): Unit = {

    val emptyList = 4

    print("Enter four elements to the List ")
    val inputList = List.fill(emptyList) {
      readLine()
    }


    //creating object of reverseImpl class
    val reverse = new ReverseImpl()

    print("After Reversing the inputList")
    print(reverse.reverseList(inputList))


    print("Enter a string to reverse ")
    val inputString = readLine()
    print("After reversing the String ")
    print(reverse.reverseString(inputString))

  }

}
