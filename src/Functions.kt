
fun sum(n1:Double,n2:Double):Double{
    //block
    var sum = n1+n2;
    return sum
}

fun display(n:Int=0):Unit{

    println("n:$n")
}
fun displayNoInput():Unit{

    println("Welcome to display")
}


fun main(args:Array<String>){

    var r=sum(10.0,12.0)
    println("r:$r")

    r=sum(65.0,35.0)
    println("r:$r")

    r=sum(5.0,96.0)
    println("r:$r")

    display(10)
    display()
    displayNoInput()

}