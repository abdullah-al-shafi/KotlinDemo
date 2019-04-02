import java.util.*

fun main(args:Array<String>){

    //input
    print("Enter your DBO:")
    var DOB:Int= readLine()!!.toInt()

    //process

    var year = Calendar.getInstance().get(Calendar.YEAR)
    var age:Int ?
    age = year - DOB

    //output

    println(" your age is $age year")

}