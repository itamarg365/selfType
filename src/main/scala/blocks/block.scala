package blocks

import readers.{IntReader, Reader, StringReader}
import writers.{StringWriter, Writer}

trait block {
  def logic(): String
}
trait MyBlock extends block{
  this: Reader[Int]=>
  def logic(): String = (read() + 5).toString
}

object MyBlock extends MyBlock with IntReader with StringWriter