//This class contains methods for performing reverse.

package ReverseCall

import org.scalatest.flatspec.AnyFlatSpec

class ReverseImplTest extends AnyFlatSpec {
  val reverseimpl = new ReverseImpl
  /* Below are the test cases where we are executing the test cases for Reverse method
  * to check if method is giving valid results or not.
  */
  "Reverse" should "be valid" in {
    val actualResult = reverseimpl.reverseString("Priya")
    val expectedResult = "ayirP"
    assert(actualResult === expectedResult)
  }

  "Reverse" should "be valid if numbers are entered" in {
    val actualResult = reverseimpl.reverseString("24081996")
    val expectedResult = "69918042"
    assert(actualResult === expectedResult)
  }

  "Reverse" should "be valid if special symbols are entered" in {
    val actualResult = reverseimpl.reverseString("24/08/1996")
    val expectedResult = "6991/80/42"
    assert(actualResult === expectedResult)
  }

  "Reverse" should "be valid if tabs/spaces are entered" in {
    val actualResult = reverseimpl.reverseString("Date of Birth - 24/08/1996")
    val expectedResult = "6991/80/42 - htriB fo etaD"
    assert(actualResult === expectedResult)
  }

  "Reverse" should "be valid if decimal numbers are entered" in {
    val actualResult = reverseimpl.reverseString("24.08.1996")
    val expectedResult = "6991.80.42"
    assert(actualResult === expectedResult)
  }

  "Reverse" should "be valid if empty string is " in {
    val actualResult = reverseimpl.reverseString("")
    val expectedResult = ""
    assert(actualResult === expectedResult)
  }

  "Reverse" should "be invalid" in {
    val actualResult = reverseimpl.reverseString("Priya Dahiya")
    val expectedResult = "Priya Dahiya"
    assert(actualResult != expectedResult)
  }



}