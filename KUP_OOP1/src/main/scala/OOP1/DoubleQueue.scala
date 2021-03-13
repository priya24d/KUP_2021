//This class contains methods for performing queue.

package OOP1

class DoubleQueue extends Queue[Int] {
  def double(element: Int): Int = 2 * element
}

class SquareQueue extends Queue[Int]{
  def square(element: Int):Int =  Math.pow(element,2).toInt
}

object QueueMain {
  def main(args: Array[String]): Unit = {
    val d = new DoubleQueue
    val s = new SquareQueue
    val num1 = 1
    val num2 = 2
    val num3 = 3
    val num4 = 4
    val num5 = 5
    val num6 = 6
    print("\nQueue is empty: " + d.isEmpty)
    d.enqueue(d.double(num1))
    d.enqueue(d.double(num2))
    d.enqueue(d.double(num3))
    d.enqueue(d.double(num4))
    d.enqueue(d.double(num5))
    d.enqueue(d.double(num6))
    print("\nQueue: " + d)
    print("\nDequeue: " + d.dequeue)
    print("\nDequeue: " + d.dequeue)
    print("\nQueue is empty: " + d.isEmpty)
    print("\nQueue is empty: " + d.isEmpty)

    val num9 = 9
    s.enqueue(s.square(num9))
    print(s)
    s.enqueue(s.square(num1))
    val num11 = 11
    val num12 = 12
    val num13 = 13
    val num14 = 14
    val num15 = 15
    s.enqueue(s.square(num11))
    s.enqueue(s.square(num12))
    s.enqueue(s.square(num13))
    s.enqueue(s.square(num14))
    s.enqueue(s.square(num15))
    print("\nQueue: " + s)
    print("\nDequeue: " + s.dequeue)
    print("\nDequeue: " + s.dequeue)
    print("\nQueue: " + s)
    print("\nQueue is empty: " + s.isEmpty)
  }
}
