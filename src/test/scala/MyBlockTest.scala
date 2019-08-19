import blocks.MyBlock
import org.scalamock.scalatest.MockFactory
import org.scalatest.FlatSpec
import readers.Reader

class MyBlockTest extends FlatSpec with MockFactory {
    trait mockReader extends Reader[Int]{
        override def read(): Int = 0
      }
  "logic" should "add 5" in {
    val block = new MyBlock with mockReader
    assert(block.logic() == "5")
  }
}
