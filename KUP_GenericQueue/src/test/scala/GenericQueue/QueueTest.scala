//This class contains methods for performing generic queue class.

package GenericQueue

import org.scalatest.flatspec.AnyFlatSpec

class QueueTest extends AnyFlatSpec {

  /* Below are the test cases where we are executing the test cases for methods of generic queue class method
  * to check if method is giving valid results or not.
  */

  "Generic Queue" should "return only enqueued value as the list was empty initially" in{
    val queue = new Queue[String](List())
    val enqueued = queue.enqueue("Priya").toString
    assertResult("List(Priya)")(enqueued)
  }

  it should "return enqueued list of string" in{
    val queue = new Queue[String](List("Hello"))
    val result=queue.enqueue("Priya").toString
    assertResult("List(Hello, Priya)")(result)
  }

  it should "return dequeued list of string" in{
    val queue = new Queue[String](List("Hello"))
    val enqueued = queue.enqueue("Priya")
    val dequeued=enqueued.dequeue.toString
    assertResult("Success(List(Priya))")(dequeued)
  }

  it should "return enqueued list of int" in{
    val queue = new Queue[Int](List(1,2))
    val result=queue.enqueue(3).toString
    assertResult("List(1, 2, 3)")(result)
  }

  it should "return dequeued list of int" in{
    val queue = new Queue[Int](List(1,2))
    val enqueued = queue.enqueue(3)
    val dequeued=enqueued.dequeue.toString
    assertResult("Success(List(2, 3))")(dequeued)
  }

  it should "return nothing" in{
    val queue = new Queue[String](List())
    val dequeued=queue.dequeue.toString
    assertResult("Failure(java.lang.UnsupportedOperationException: tail of empty list)")(dequeued)
  }

}
