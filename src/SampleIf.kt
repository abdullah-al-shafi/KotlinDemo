

fun main(args:Array<String>){

    println("Enter Your grade")
    var grade = readLine()!!.toDouble()

    if(grade>=90){
        //block of code
        grade=grade+3
        println("your are in A level")
    }
    if (grade>=50 && grade <=70){
        grade = grade +10
        println("you get extra 10 point")

    }

    println("your enter grade $grade")
}