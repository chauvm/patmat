package patmat

object w4_worksheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
	val orderedList = List(('a', 2), ('b', 1))//> orderedList  : List[(Char, Int)] = List((a,2), (b,1))
	val result = orderedList.map(pair => (pair._1, 2*pair._2))
                                                  //> result  : List[(Char, Int)] = List((a,4), (b,2))
	println(result)                           //> List((a,4), (b,2))
  println(Huffman.decodedSecret)                  //> List(h, u, f, f, m, a, n, e, s, t, c, o, o, l)
}