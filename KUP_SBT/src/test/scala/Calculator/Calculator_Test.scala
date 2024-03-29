//This class contains methods for performing various operations of a calculator.

package Calculator

import org.scalatest.flatspec.AnyFlatSpec

class Calculator_Test extends AnyFlatSpec {

  val positiveInput1:Double = 39
  val positiveInput2:Double = 110
  val negativeInput1:Double = -39
  val negativeInput2:Double = -110

  /* Below are the test cases where we are executing the test cases for Addition method
  * to check if method is giving valid results or not.
  */
  val callcalulator = new callCalculator()

  "Addition" should "be valid if both positive input entered" in {
    val actualResult = callcalulator.addition(positiveInput1, positiveInput2)
    val expectedResult = 149
    assert(actualResult === expectedResult)
  }
  "Addition" should "be valid if both negative input entered" in {
    val actualResult= callcalulator.addition(negativeInput1, negativeInput2)
    val expectedResult = -149
    assert(actualResult === expectedResult)
  }
  "Addition" should "be valid if one negative input entered before the sign" in {
    val actualResult= callcalulator.addition( negativeInput2, positiveInput1)
    val expectedResult = -71
    assert(actualResult === expectedResult)
  }
  "Addition" should "be valid if negative input entered after the sign" in {
    val actualResult= callcalulator.addition( positiveInput1, negativeInput2)
    val expectedResult = -71
    assert(actualResult === expectedResult)
  }
  "Addition" should "be invalid" in {
    val actualResult= callcalulator.addition( positiveInput1, negativeInput2)
    val expectedResult = 71
    assert(actualResult != expectedResult)
  }

  /* Below are the test cases where we are executing the test cases for Subtraction method
  * to check if method is giving valid results or not.
  */
  "Subtraction" should "be valid if both positive input entered" in {
    val actualResult= callcalulator.subtraction(positiveInput1, positiveInput2)
    val expectedResult = -71
    assert(actualResult === expectedResult)
  }
  "Subtraction" should "be valid if both negative input entered" in {
    val actualResult= callcalulator.subtraction(negativeInput1, negativeInput2)
    val expectedResult = 71
    assert(actualResult === expectedResult)
  }
  "Subtraction" should "be valid if one negative input entered before the operator" in {
    val actualResult= callcalulator.subtraction( negativeInput2, positiveInput1)
    val expectedResult = -149
    assert(actualResult === expectedResult)
  }
  "Subtraction" should "be valid if negative input entered after the operator" in {
    val actualResult= callcalulator.subtraction( positiveInput1, negativeInput2)
    val expectedResult = 149
    assert(actualResult === expectedResult)
  }
  "Subtraction" should "be invalid" in {
    val actualResult= callcalulator.subtraction( positiveInput1, negativeInput2)
    val expectedResult = -149
    assert(actualResult != expectedResult)
  }

  /* Below are the test cases where we are executing the test cases for Multiplication method
  * to check if method is giving valid results or not.
  */
  "Multiplication" should "be valid if positive number entered" in {
    val actualResult= callcalulator.multiplication(positiveInput1, positiveInput2)
    val expectedResult = 4290
    assert(actualResult === expectedResult)
  }
  "Multiplication" should "be valid if negative number entered" in {
    val actualResult= callcalulator.multiplication(negativeInput1, negativeInput2)
    val expectedResult = 4290
    assert(actualResult === expectedResult)
  }
  "Multiplication" should "be valid if one negative input entered before the operator" in {
    val actualResult= callcalulator.multiplication( negativeInput2, positiveInput1)
    val expectedResult = -4290
    assert(actualResult === expectedResult)
  }
  "Multiplication" should "be valid if negative input entered after the operator" in {
    val actualResult= callcalulator.multiplication( positiveInput1, negativeInput2)
    val expectedResult = -4290
    assert(actualResult === expectedResult)
  }
  "Multiplication" should "be invalid" in {
    val actualResult= callcalulator.multiplication( positiveInput1, negativeInput2)
    val expectedResult = 4290
    assert(actualResult != expectedResult)
  }

  /* Below are the test cases where we are executing the test cases for Division method
  * to check if method is giving valid results or not.
  */
  "Division" should "be valid if positive number entered" in {
    val actualResult= callcalulator.division(positiveInput1, positiveInput2)
    val expectedResult = 0.35454545454545455
    assert(actualResult === expectedResult)
  }
  "Division" should "be valid if negative input entered" in {
    val actualResult= callcalulator.division(negativeInput1, negativeInput2)
    val expectedResult = 0.35454545454545455
    assert(actualResult === expectedResult)
  }
  "Division" should "be valid if one negative input entered before the operator" in {
    val actualResult= callcalulator.division( negativeInput2, positiveInput1)
    val expectedResult = -2.8205128205128207
    assert(actualResult === expectedResult)
  }
  "Division" should "be valid if negative input entered after the operator" in {
    val actualResult= callcalulator.division( positiveInput1, negativeInput2)
    val expectedResult = -0.35454545454545455
    assert(actualResult === expectedResult)
  }
  "Division" should "be invalid" in {
    val actualResult= callcalulator.division( positiveInput1, negativeInput2)
    val expectedResult = 0.35454545454545455
    assert(actualResult != expectedResult)
  }
  "Division" should "be invalid if denominator is 0 " in {
    val actualResult= callcalulator.division( 0, positiveInput1 )
    val expectedResult = 0
    assert(actualResult === expectedResult)
  }

  /* Below are the test cases where we are executing the test cases for Power method
   * to check if method is giving valid results or not.
   */
  "Power" should "be valid if both positive input entered" in {
    val actualResult= callcalulator.power(positiveInput1, positiveInput2)
    val expectedResult = 1.0401758655037036E175
    assert(actualResult === expectedResult)
  }
  "Power" should "be valid if both negative input entered" in {
    val actualResult= callcalulator.power(negativeInput1, negativeInput2)
    val expectedResult = 9.613758914851879E-176
    assert(actualResult === expectedResult)
  }
  "Power" should "be valid if one negative input entered before the operator" in {
    val actualResult= callcalulator.power( negativeInput2, positiveInput1)
    val expectedResult = -4.1144777789250867E79
    assert(actualResult === expectedResult)
  }
  "Power" should "be valid if negative number entered after the operator" in {
    val actualResult= callcalulator.power( positiveInput1, negativeInput2)
    val expectedResult = 9.613758914851879E-176
    assert(actualResult === expectedResult)
  }
  "Power" should "be invalid" in {
    val actualResult= callcalulator.power( positiveInput1, negativeInput2)
    val expectedResult = 149
    assert(actualResult != expectedResult)
  }

  /* Below are the test cases where we are executing the test cases for Absolute method
  * to check if method is giving valid results or not.
  */
  "Absolute" should "be valid if positive input entered" in {
    val actualResult= callcalulator.absolute(positiveInput1)
    val expectedResult = 39
    assert(actualResult === expectedResult)
  }
  "Absolute" should "be valid if negative input entered" in {
    val actualResult= callcalulator.absolute(negativeInput1)
    val expectedResult = 39
    assert(actualResult === expectedResult)
  }
  "Absolute" should "be invalid" in {
    val actualResult= callcalulator.absolute( positiveInput1)
    val expectedResult = 110
    assert(actualResult != expectedResult)
  }

  /* Below are the test cases where we are executing the test cases for Modulus method
  * to check if method is giving valid results or not.
  */
  "Modulus" should "be valid if both positive input entered" in {
    val actualResult= callcalulator.modulus(positiveInput1, positiveInput2)
    val expectedResult = 39
    assert(actualResult === expectedResult)
  }
  "Modulus" should "be valid if both negative input entered" in {
    val actualResult= callcalulator.modulus(negativeInput1, negativeInput2)
    val expectedResult = -39
    assert(actualResult === expectedResult)
  }
  "Modulus" should "be valid if one negative input entered before the operator" in {
    val actualResult= callcalulator.modulus( negativeInput2, positiveInput1)
    val expectedResult = -32
    assert(actualResult === expectedResult)
  }
  "Modulus" should "be valid if negative input entered after the operator" in {
    val actualResult= callcalulator.modulus( positiveInput1, negativeInput2)
    val expectedResult = 39
    assert(actualResult === expectedResult)
  }
  "Modulus" should "be invalid" in {
    val actualResult= callcalulator.modulus( positiveInput1, negativeInput2)
    val expectedResult = 149
    assert(actualResult != expectedResult)
  }
  "Modulus" should "be invalid if denominator is 0 " in {
    val actualResult= callcalulator.modulus(0, positiveInput1)
    val expectedResult = 0
    assert(actualResult === expectedResult)
  }

  /* Below are the test cases where we are executing the test cases for Maximum method
  * to check if method is giving valid results or not.
  */
  "Maximum" should "be valid if both positive input entered" in {
    val actualResult= callcalulator.maximum(positiveInput1, positiveInput2)
    val expectedResult = 110
    assert(actualResult === expectedResult)
  }
  "Maximum" should "be valid if both negative input entered" in {
    val actualResult= callcalulator.maximum(negativeInput1, negativeInput2)
    val expectedResult = -39
    assert(actualResult === expectedResult)
  }
  "Maximum" should "be valid if one negative input entered before the operator" in {
    val actualResult= callcalulator.maximum( negativeInput2, positiveInput1)
    val expectedResult = 39
    assert(actualResult === expectedResult)
  }
  "Maximum" should "be valid if negative input entered after the operator" in {
    val actualResult= callcalulator.maximum( positiveInput1, negativeInput2)
    val expectedResult = 39
    assert(actualResult === expectedResult)
  }
  "Maximum" should "be invalid" in {
    val actualResult= callcalulator.maximum( positiveInput1, negativeInput2)
    val expectedResult = 110
    assert(actualResult != expectedResult)
  }

  /* Below are the test cases where we are executing the test cases for Minimum method
  * to check if method is giving valid results or not.
  */
  "Minimum" should "be valid if both positive input entered" in {
    val actualResult= callcalulator.minimum(positiveInput1, positiveInput2)
    val expectedResult = 39
    assert(actualResult === expectedResult)
  }
  "Minimum" should "be valid if both negative input entered" in {
    val actualResult= callcalulator.minimum(negativeInput1, negativeInput2)
    val expectedResult = -110
    assert(actualResult === expectedResult)
  }
  "Minimum" should "be valid if one negative input entered before the operator" in {
    val actualResult= callcalulator.minimum( negativeInput2, positiveInput1)
    val expectedResult = -110
    assert(actualResult === expectedResult)
  }
  "Minimum" should "be valid if negative input entered after the operator" in {
    val actualResult= callcalulator.minimum( positiveInput1, negativeInput2)
    val expectedResult = -110
    assert(actualResult === expectedResult)
  }
  "Minimum" should "be invalid" in {
    val actualResult= callcalulator.minimum( positiveInput1, negativeInput2)
    val expectedResult = 39
    assert(actualResult != expectedResult)
  }

}