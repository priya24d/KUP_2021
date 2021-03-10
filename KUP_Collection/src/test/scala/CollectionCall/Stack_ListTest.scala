//This class contains methods for performing collection.

package CollectionCall

import org.scalatest.flatspec.AnyFlatSpec

class Stack_ListTest extends AnyFlatSpec{

  /* Below are the test cases where we are executing the test cases for stack list method
  * to check if method is giving valid results or not.
  */

  val stackList=new Stack_List[Int]
  val num1 = 1
  val num2 = 6

  "Stack" should "be true found for empty stack" in{
    val res = stackList.isEmpty
    assert(res)
  }

  "Stack" should "be true found for successful push" in{
    val res: Unit = stackList.push(num1)
    val expectedRes = stackList.peek
    assert(res != expectedRes)
  }

  "Stack" should "be true found for successful get" in{
    val res: Unit = stackList.get()
    val expectedRes = stackList.peek
    assert(res != expectedRes)
  }

  "Stack" should "be returned for successful pop" in{
    val res = stackList.pop
    val expectedRes = stackList.isEmpty
    assert(res != expectedRes)
  }

  "Stack" should "be found for successful empty" in{
    val res: Unit = stackList.push(1)
    val expectedRes: Unit = stackList.empty()
    assert(res === expectedRes)
  }

  "Stack" should "be false found for peek when stack is empty" in{
    val res = stackList.peek
    assert(res == "Stack is empty")
  }

  "Stack" should "be false found for pop when stack is empty" in{
    val res = stackList.pop
    assert(res == "Stack is empty")
  }

}
