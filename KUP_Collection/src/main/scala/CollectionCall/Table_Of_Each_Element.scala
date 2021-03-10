//This class contains methods for performing collection.

package CollectionCall

class Table_Of_Each_Element {

  //Method to write the table

  def printtable(listOfElements : List[Int]):Unit = {

    for (element <- listOfElements) {
      print("Table of " + element + " ")

      //using loops to print table up to 10
      for (number <- 1 to 10) {
        print((number * element) + " ")
      }
      print(" ")
    }
  }
}

object Table_Element{
  def main (args: Array[String]): Unit = {
    val num1 = 3
    val num2 = 5
    val Table = new Table_Of_Each_Element
    Table.printtable(List(num1, num2))
  }

}
