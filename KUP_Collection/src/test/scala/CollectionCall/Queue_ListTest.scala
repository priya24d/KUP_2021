//This class contains methods for performing collection.

package CollectionCall
import org.scalatest.EitherValues
import org.scalatest.flatspec.AnyFlatSpec

class Queue_ListTest extends AnyFlatSpec with EitherValues{

  /* Below are the test cases where we are executing the test cases for queue list method
  * to check if method is giving valid results or not.
  */
  var queueList=new Queue_List[Int]

  "Queue" should " be true returned for empty queue" in{
    val res=queueList.isEmpty
    assert(res)
  }

  "Queue" should " be true returned for enqueue" in{
    val res: Unit =queueList.enqueue(2)
    assert(queueList.front != res)
  }

  "Queue" should "be true returned for dequeue" in{
    val res=queueList.dequeue
    assert(res != false)
  }

  "Queue" should " not be true returned for dequeue when queue is empty" in{
    val res =queueList.dequeue
    assert(res=="No element found")
  }

  "Queue" should " be true returned for front when queue is empty" in{
    val res =queueList.front
    assert(res=="No element found")
  }

  "Queue" should " be true returned for empty queue print" in{
    val res =queueList.toString()
    assert(res.contains("("))
  }

  "Queue" should " be true returned for non empty queue print" in{
    queueList.enqueue(0)
    val res =queueList.toString()
    assert(res.contains("("))
  }

}
