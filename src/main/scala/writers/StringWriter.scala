package writers


trait StringWriter extends Writer[String] {
  override def write(o: String): Unit = println(f"writing `$o`")
}