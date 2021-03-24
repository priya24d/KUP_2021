//This class contains methods for performing generic queue class.

package GenericQueue

import scala.collection.immutable.List
import scala.util.Try

class Queue[+A](list:List[A]) {

  override def toString: String = list.toString

  // Insertion in generic queue class
  def enqueue[B >: A](input: B): Queue[B] = {
    new Queue[B](list :+ input)
  }

  // Deletion in generic queue class
  def dequeue[B >: A]: Try[Queue[B]] = {
    Try(new Queue[B](list.tail))

  }
}

