//This class contains methods for performing various operations of a calculator.

package Calculator
// This object has some methods in which I implement the mathematical operations
object callCalculator {

  val result = 0

  def addition(number1:Double, number2:Double): Double = number1 + number2

  def subtraction(number1:Double, number2:Double): Double = number1 - number2

  def multiplication(number1:Double, number2:Double): Double = number1 * number2

  def division(number1:Double, number2:Double):Double= number1 / number2

  def power(number1:Double, number2:Double): Double = scala.math.pow(number1,number2)

  def absolute(number:Double): Double = number.abs

  def modulus(number1:Double, number2:Double):Double= {
    if(number2==0){
      result
    }
    else{
      number1 % number2
    }
  }

  def maximum(number1:Double, number2:Double):Double= {
    if (number1 > number2) {
      number1
    } else{
      number2
    }
  }

  def minimum(number1:Double, number2:Double):Double= {
    if (number1 < number2) {
      number1
    } else{
      number2
    }
  }

}
