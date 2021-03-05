//This class contains methods for performing selection sorting.

package Sorting

import scala.io.StdIn.readInt
import scala.collection.immutable.List

object Sort_api
{
  def main(args: Array[String]): Unit = {

    print("Enter elements of list ")
    val sizeList:Int = readInt()

    print(s"Enter $sizeList elements: \n")
    val inputList = List.fill(sizeList){
      readInt()
    }

    print("List after sorting using selection sort ...")
    val sort =new  Sort_Impl()
    print(sort.selectionSort(inputList))
  }

}

