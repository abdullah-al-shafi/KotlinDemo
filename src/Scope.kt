
var fullname = "Abdullah Al Shafi"
fun display():Unit{

    println(fullname)
}

fun main(args:Array<String>){

    var name = "Shafi"   //local variable
    display()
    println(name)
    println("Full name:$fullname")
}