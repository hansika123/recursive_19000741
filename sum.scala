//Question 3

object sum extends App {
    def sum(num:Int):Int={
      num match {
        case 1  => num
        case _  => num+sum(num-1)
      }
    }
    println("\n*** Addition of numbers from1 to n ***")
    println(sum(5))

}
