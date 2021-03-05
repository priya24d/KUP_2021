//This class contains methods for performing selection sorting.

package Sorting

import org.scalatest.flatspec.AnyFlatSpec

class SortImplTest extends AnyFlatSpec {

  val sort_Impl = new Sort_Impl
  /* Below are the test cases where we are executing the test cases for selection sort method
  * to check if method is giving valid results or not.
  */

  val input1 = 340
  val input2 = 409
  val input3 = 54
  val input4 = 10

  "Selection Sorting" should "be valid" in {
    val actualResult = sort_Impl.selectionSort(List(input1,input2,input3,input4))
    val expectedResult = List(input4,input3,input1,input2)
    assert(actualResult === expectedResult)
  }

  "Selection Sorting" should "be invalid" in {
    val actualResult = sort_Impl.selectionSort(List(input1,input2,input3,input4))
    val expectedResult = List(input1,input2,input3,input4)
    assert(actualResult != expectedResult)
  }

}

