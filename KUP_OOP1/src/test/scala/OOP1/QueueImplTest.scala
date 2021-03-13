//This class contains methods for performing queue.

package OOP1

import org.scalatest.flatspec.AnyFlatSpec

class QueueImplTest extends AnyFlatSpec {
  /* Below are the test cases where we are executing the test cases for queue method
  * to check if method is giving valid results or not.
  */

  val queue = new Object with Queue[Int]

  "Success" should " be returned for empty queue" in{
    val result = queue.isEmpty
    assert(result)
  }

  "Success" should " be returned for dequeue" in{
    val num2 = 2
    queue.enqueue(num2)
    val result = queue.dequeue
    assert(queue.isEmpty)
  }

  "Failure" should " be returned for dequeue when queue is empty" in{
    val result =queue.dequeue
    assert(result == "No element found")
  }

  "Success" should "be returned fo successful print" in{
    val num2 = 2
    val num4 = 4
    val num6 = 6
    queue.enqueue(num2)
    queue.enqueue(num4)
    queue.enqueue(num6)
    queue.toString()
    assert(!queue.isEmpty)
  }
}