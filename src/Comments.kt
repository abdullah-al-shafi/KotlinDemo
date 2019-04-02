
// This main function
fun main(args:Array<String>){
//Enter user name
    print("Enter Name : ")
    var name= readLine()

    print(" Enter age : ")
    var age=readLine()!!.toDouble()

    print(" Enter department : ")
    var dep =readLine()

    print(" Enter pi : ")
    var pi:Double = readLine()!!.toDouble()

/*Print output
to allow user to see the output

 */
    println("*******Output******")
    println("Name : "+ name)
    println("Age : "+ age)
    println("Depertment : "+ dep)
    println("Pi : "+ pi)



}