//Question 5

object Question5 extends App{
    def less_than_num (num:Int):Int={
        if (num % 2 == 0) addition_even(num - 2)
        else addition_even(num-1)
    }

    def addition_even (num:Int) : Int = num match{
        case 0 => 0
        case 1 => 0
        case _ if num<0 => 0
        case _ => num + addition_even(num-2)
    }

    println("\n *** Addition of all even numbers less than given n ***")
    println(less_than_num(5))
    println(less_than_num(6))

}
