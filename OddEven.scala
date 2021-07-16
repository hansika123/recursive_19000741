//Question 4

object OddEven extends App {
    def isEven(num:Int): Boolean= num match{
        case 0 => true
        case _ => isOdd(num-1)
    }
    def isOdd(num:Int):Boolean = !(isEven(num))

    println("\n *** determine even and odd numbers ***")
    println(isEven(5))
    println(isEven(4))
    println(isOdd(15))
    println(isOdd(12))

}
