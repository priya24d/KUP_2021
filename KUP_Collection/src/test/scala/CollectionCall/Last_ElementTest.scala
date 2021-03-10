//This class contains methods for performing collection.

package CollectionCall
import org.scalatest.flatspec.AnyFlatSpec

import scala.collection.immutable.List

class Last_ElementTest extends AnyFlatSpec {

  /* Below are the test cases where we are executing the test cases for finding last element method
  * to check if method is giving valid results or not.
  */
  val num1 = 1
  val num2 = 3
  val num3 = 6
  val num4 = 9
  val num5 = 11

  "last element" should "be found for the list of int" in{
    val res = Last_Element.getLastElement(List(num1,num2,num3,num4,num5))
    assert(res === 11)
  }

  "last element" should "not be found for the list of int" in{
    val res = Last_Element.getLastElement(List(num1,num2,num3,num4,num5))
    assert(res != 12)
  }

  "last element" should "be found for the list of String" in{
    val res=Last_Element.getLastElement(List("priya","anjali","alka","daminee"))
    assert(res === "daminee")
  }

  "last element" should "not be found for the list of String" in{
    val res=Last_Element.getLastElement(List("priya","anjali","alka","daminee"))
    assert(res != "kirti")
  }


}
