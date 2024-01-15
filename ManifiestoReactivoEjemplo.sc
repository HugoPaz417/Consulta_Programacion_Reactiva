class CustomIterator(collection: List[Int])
{
  var index = 0

  def next(): Option[Int] =
  {
    if (hasNext())
    {
      val result = Some(collection(index))
      index += 1
      result
    } else None
  }

  def hasNext(): Boolean = index < collection.length
}

val customIterator = new CustomIterator(List(1, 2, 3, 4))
println(s"${customIterator.next()}, ${customIterator.hasNext()}")