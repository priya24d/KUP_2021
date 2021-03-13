//This class contains methods for comparison.

package OOPCall

import org.scalatest.flatspec.AnyFlatSpec

class PersonImplTest extends AnyFlatSpec {
  /* Below are the test cases where we are executing the test cases for Person age and name validation method
    * to check if method is giving valid results or not.
    */

  val age = 24
  val age1 = 18
  val age2 = 30
  val person1 = new Person("Priya", age)

  "It" should "valid for same name and age" in{
    val person2 = new Person("Priya", age)
    val res: Int = person1.compare(person2)
    assert(res == 0)
  }

  "Person1" should "be greater for larger name irrespective of age" in{
    val person2 = new Person("test", age)
    val res: Int = person1.compare(person2)
    assert(res<0)
  }

  "Person1" should "be greater for higher age for same name" in{
    val person2 = new Person("Priya", age1)
    val res: Int = person1.compare(person2)
    assert(res>0)
  }

  "Person2" should "be greater for larger name irrespective of age" in{
    val person2 = new Person("Assignment", age)
    val res: Int = person1.compare(person2)
    assert(res>0)
  }

  "Person2" should "be greater for higher age for same name" in{
    val person2 = new Person("Priya", age2)
    val res: Int = person1.compare(person2)
    assert(res < 0)
  }
}
