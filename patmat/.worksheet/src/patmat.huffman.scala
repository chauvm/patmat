package patmat

object huffman {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(76); 
  println("Welcome to the Scala worksheet");$skip(44); 
	val orderedList = List(('a', 2), ('b', 1));System.out.println("""orderedList  : List[(Char, Int)] = """ + $show(orderedList ));$skip(64); 
	val result = orderedList.foreach(pair => (pair._1, 2*pair._2));System.out.println("""result  : Unit = """ + $show(result ))}
	
}
