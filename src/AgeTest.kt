import java.util.*

fun main(args:Array<String>){

    //input
    print("Enter your DBO:")
    var DBO:Int = readLine()!!.toInt()

    //operation
    var year = Calendar.getInstance().get(Calendar.YEAR)
    var age:Int ?
    age = year-DBO


    //output

    println("your age : $age year")
}