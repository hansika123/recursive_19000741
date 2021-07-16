//Question 1 & 2

object Question1_and_2 extends App{
  //Question 1
  def gcd(a:Int, b:Int) : Int = b match{
    case 0 => a
    case b if b > a =>gcd(b, a)
    case b =>gcd(b, a % b)
  }

  def is_prime(x:Int, y:Int = 2): Boolean = x match{
    case x if y==x => true
    case x if gcd(x,y) > 1 => false
    case x => is_prime(x, y+1)
  }
  println("\n*** Print number is is prime or not *** ")
  println(is_prime(5))
  println(is_prime(36))


  
  //Question 2
  def prime_Seq(p:Int, n:Int=2):Any ={
    if (p > n) { if (is_prime(n)) println(n)
                                 prime_Seq(p, n+1)}
  }
  println("\n *** Prints all prime number which less than n ***")
  prime_Seq(13)
}
