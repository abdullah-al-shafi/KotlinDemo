

fun main(args:Array<String>){

    print("Enter Name : ")
    var name= readLine()

    print(" Enter age : ")
    var age=readLine()!!.toDouble()

    print(" Enter department : ")
    var dep =readLine()

    print(" Enter pi : ")
    var pi:Double = readLine()!!.toDouble()


    println("*******Output******")
    println("Name : "+ name)
    println("Age : "+ age)
    println("Depertment : "+ dep)
    println("Pi : "+ pi)



}