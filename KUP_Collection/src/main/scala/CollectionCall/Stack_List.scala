//This class contains methods for performing collection.

package CollectionCall

class Stack_List[T] {

  private var items = List[T]()

  def get(): Unit = items.foreach(x=>print(x))

  def isEmpty: Boolean = items.isEmpty

  def peek: Any = items match {
    case List()       => "Stack is empty"
    case head  => head
  }

  def pop: Any = items match {
    case List()       => "Stack is empty"
    case head :: rest => items = rest; head
  }

  def push(value: T): Unit = items = value +: items

  def empty(): Unit =items=List()
}

object StackImplementation extends App {

  val stack = new Stack_List[String]
  print(s"Stack is empty: ${stack.isEmpty}")

  stack.push("Scala")
  stack.push("Assignment")
  stack.push("Collection")
  stack.push("by")
  stack.push("Priya")
  stack.push("done")
  stack.pop == "done"
  print(s"\nTop element of stack : ${stack.peek}")
  print("\nElements of stack : ")
  stack.get()
  print(s"\nStack is empty: ${stack.isEmpty}")
  stack.empty()
  print("\nDeleting all elements from stack.")
  print("\nElements of stack : ")
  stack.get()
  print(s"\nStack is empty: ${stack.isEmpty}")

}
