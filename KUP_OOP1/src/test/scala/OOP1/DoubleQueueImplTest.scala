//This class contains methods for performing queue.

package OOP1

import org.scalatest.flatspec.AnyFlatSpec

class DoubleQueueImplTest extends AnyFlatSpec {
  /* Below are the test cases where we are executing the test cases for doublequeue method
  * to check if method is giving valid results or not.
  */

  val doubleQueue = new DoubleQueue
  val squareQueue = new SquareQueue

  "It" should "double elements" in {
    val num2 = 2
    val res = doubleQueue.double(num2)
    assert(res == 4)
  }

  "It" should "square elements" in {
    val num3= 3
    val res = squareQueue.square(num3)
    assert(res == 9)
  }

  "DoubleQueueMain" should "be executed" in{
    val output: Unit = QueueMain.main(Array(""))
    assert(doubleQueue.isEmpty)
  }
}