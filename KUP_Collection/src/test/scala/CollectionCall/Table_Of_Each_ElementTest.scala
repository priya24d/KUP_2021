//This class contains methods for performing collection.

package CollectionCall
import org.scalatest.flatspec.AnyFlatSpec
import scala.collection.immutable.List

class Table_Of_Each_ElementTest extends AnyFlatSpec {

  val table_Of_Each_Element = new Table_Of_Each_Element
  /* Below are the test cases where we are executing the test cases for table of each element method
  * to check if method is giving valid results or not.
  */
  val table = new Table_Of_Each_Element()


  "Table" should "be valid" in {
    val expectedResult = List(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20))
    val actualResult = table.printtable(List(1,2))
    assert(expectedResult === actualResult)
  }

  "Table" should "be invalid" in {
    val expectedResult = List(List(9, 2, 8, 4, 5, 6, 7, 8, 9, 10), List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20))
    val actualResult = table.printtable(List(1,2))
    assert(expectedResult != actualResult)
  }
}
