//This class contains methods for performing collection.

package CollectionCall

class Queue_List[T] {

  private class Node[T](val value:T) {
    var next:Option[Node[T]]=None
    def append(n:Node[T]): Unit =next=Some(n)
  }

  private[this] var head:Option[Node[T]]=None
  //tail element for queue
  private[this] var tail:Option[Node[T]]=None

  def isEmpty: Boolean =head.isEmpty

  def enqueue(item:T): Unit ={
    val n=new Node(item)
    if(isEmpty) head=Some(n) else tail.get.append(n)
    tail=Some(n)
  }

  def dequeue: Any =head match {
    case Some(item) =>
      head=item.next
      item.value
    case None => "No element found"
  }

  def front: Any =head match {
    case Some(item) => item.value
    case None => "No element found"
  }

  def iterator: Iterator[T]=new Iterator[T]{
    private[this] var it=head
    override def hasNext: Boolean =it.isDefined
    override def next:T={
      val n=it.get
      it=n.next
      n.value
    }
  }

  override def toString: String =iterator.mkString("Queue(", ", ", ")")
}

object  QueueImplementation extends App{
  val q=new Queue_List[Int]()

  print(s"Queue is empty : ${q.isEmpty} ")

  val num1 = 4
  val num2 = 5
  val num3 = 6
  val num4 = 1
  val num5 = 2
  val num6 = 3
  q.enqueue(num4)
  q.enqueue(num5)
  q.enqueue(num6)
  q.enqueue(num1)
  q.enqueue(num2)
  q.enqueue(num3)

  print(s"Queue : $q ")
  print(s"Front element of Queue : ${q.front} ")
  print(s"Remove element ${q.dequeue} from Queue")
  print(s"Remove element ${q.dequeue} from Queue")
  print(s"Queue :  $q")
  print(s"Queue is empty : ${q.isEmpty} ")

}
