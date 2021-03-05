//This class contains methods for performing selection sorting.

package Sorting

import scala.collection.immutable.List

//this class is to implement selection sort
class Sort_Impl {
  def selectionSort(list: List[Int]): List[Int] = {
    sortList(list)
  }

  def sortList(list: List[Int], newList: List[Int] = List[Int]()): List[Int] = {

    list match {
      case Nil => newList
      case _ => {
        val getMinimum = list.min
        val requiredList = list.filter(_ != getMinimum)
        sortList(requiredList, newList ::: List.fill(list.length - requiredList.length)(getMinimum))
      }
    }
  }
}
