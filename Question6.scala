//Question 6

object Question6 extends App{
  def fibonacci (n:Int):Int = n match{
    case 0 => 0
    case 1 => 1
    case n => fibonacci(n-1)+ fibonacci(n-2)
  }
   def fibonacciSeq (n:Int):Unit = {
     if (n>0) fibonacciSeq(n-1)
     println(fibonacci(n))
   }
   println("\n*** Print fist n Fibonacci numbers for given n ***")
   fibonacciSeq(8)
}
