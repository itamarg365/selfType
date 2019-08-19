package writers

trait Writer[O]{
  def write(o:O):Unit
}
