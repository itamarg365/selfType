package readers

trait Reader[I]{
  def read():I
}