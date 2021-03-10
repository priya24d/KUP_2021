//This class contains methods for performing collection.

package CollectionCall

import scala.collection.immutable.List
import scala.io.StdIn.readInt

object Last_Element extends App {

  def listLength[A](list: List[A]): Int = list match {
    case Nil => 0
    case _ :: hasValue => 1 + listLength(hasValue)
  }

  def getLastElement[A](list:List[A]):A =list(listLength(list)-1)

  print("Enter elements of list ")
  val sizeList:Int = readInt()

  print(s"Enter $sizeList elements: \n")
  val inputList = List.fill(sizeList){
    readInt()
  }

  val listOfString=List("priya","anjali","alka","daminee","kirti")

  print(s"Last element of $inputList : " + getLastElement(inputList))
  print(s"Last element of $listOfString : " + getLastElement(listOfString))
}
