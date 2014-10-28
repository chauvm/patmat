package patmat

object w4_worksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(81); 
  println("Welcome to the Scala worksheet");$skip(44); 
	val orderedList = List(('a', 2), ('b', 1));System.out.println("""orderedList  : List[(Char, Int)] = """ + $show(orderedList ));$skip(60); 
	val result = orderedList.map(pair => (pair._1, 2*pair._2));System.out.println("""result  : List[(Char, Int)] = """ + $show(result ));$skip(17); 
	println(result);$skip(33); 
  println(Huffman.decodedSecret)}
}
