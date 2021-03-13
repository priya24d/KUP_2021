//This class contains methods for comparison.

package OOPCall

class Person(val name: String, val age: Int) extends Ordered[Person] {

  override def compare(that: Person): Int = {
    if(this.name.equals(that.name)){
      if(this.age == that.age) 0 else if(this.age < that.age) -1 else 1
    }
    else{
      if(this.name.length == that.name.length) 0 else if(this.name.length < that.name.length) -1 else 1
    }
  }

}

object Main extends App{

  val ageOne = 24
  val ageTwo = 23
  val ageThree = 25
  val personOne = new Person("Test", ageOne)
  val personTwo = new Person("Test", ageTwo)
  print((personOne > personTwo) + "\n")

  val person1 = new Person("TestAgain", ageOne)
  val person2 = new Person("Test", ageThree)
  print((person1 < person2) + "\n")

  val personFirst = new Person("Test",ageThree)
  val personSecond = new Person("Test",ageThree)
  print((personFirst <= personSecond) + "\n")
}

