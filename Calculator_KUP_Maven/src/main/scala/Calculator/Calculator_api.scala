//This class contains methods for performing various operations of a calculator.

package Calculator
import scala.io.StdIn.readLine

class Calculator_api {

    val ADD = 1
    val SUB = 2
    val MUL = 3
    val DIV = 4
    val POW = 5
    val ABS = 6
    val MOD = 7
    val MAX = 8
    val MIN = 9

    print("\n1. Addition")
    print("\n2. Subtraction")
    print("\n3. Multiplication")
    print("\n4. Division")
    print("\n5. Power")
    print("\n6. Absolute")
    print("\n7. Modulus")
    print("\n8. Maximum of Two Numbers")
    print("\n9. Minimum of Two Numbers")

    def operationNumber:(Double, Double)={
      print("Enter number 1: ")
      val number1: Double = readLine().toDouble

      print("Enter number 2: ")
      val number2: Double = readLine().toDouble

      (number1,number2)
    }

    var continue = "Y"
    while (continue == "Y") {
      try {
        print("\nEnter the number to perform the operation : ")
        val numberForOperation:Int = readLine().toInt

        numberForOperation match {
          case ADD =>
            val (number1,number2) = operationNumber
            val result = callCalculator.addition(number1, number2)
            print(s"Result :  $result")

          case SUB =>
            val (number1,number2) = operationNumber
            val result = callCalculator.subtraction(number1, number2)
            print(s"Result :  $result")

          case MUL =>
            val (number1,number2) = operationNumber
            val result = callCalculator.multiplication(number1, number2)
            print(s"Result :  $result")

          case DIV =>
            val (number1,number2) = operationNumber
            if(number2==0){
              print("Denominator cannot be zero")
            }
            else{
              val result = callCalculator.division(number1, number2)
              print(s"Result :  $result")
            }

          case POW =>
            val (number1,number2) = operationNumber
            val result = callCalculator.power(number1, number2)
            print(s"Result :  $result")

          case ABS =>
            print("Enter the value: ")
            val operationNumber: Double = readLine().toDouble
            val result = callCalculator.absolute(operationNumber)
            print(s"Result :  $result")

          case MOD =>
            val (number1,number2) = operationNumber
            if(number2==0){
              print("Denominator cannot be zero")
            }
            else{
              val result = callCalculator.division(number1, number2)
              print(s"Result :  $result")
            }

          case MAX =>
            val (number1,number2) = operationNumber
            if(number1 == number2){
              print("Both inputs are equal")
            }
            else{
              val result = callCalculator.maximum(number1, number2)
              print(s"Result :  $result")
            }

          case MIN =>
            val (number1,number2) = operationNumber
            if(number1 == number2){
              print("Both inputs are equal")
            }
            else{
              val result = callCalculator.minimum(number1, number2)
              print(s"Result :  $result")
            }

          case _ =>
            print("Invalid Input.")
        }
      }
      catch
        {
          case _: NumberFormatException => print("Enter valid inputs.")
        }
      print("\nWant to continue (Y or N): ")
      continue = readLine()
    }
  }
