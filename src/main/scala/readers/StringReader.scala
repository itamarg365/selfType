package readers

trait StringReader extends Reader[String] {
  override def read() = "real string"
}

trait IntReader extends Reader[Int] {
  override def read() = 2
}

