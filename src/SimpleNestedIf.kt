

fun main(args:Array<String>){

    println("Enter Your grade")
    var grade = readLine()!!.toDouble()

    if(grade>=90){
        //block of code
        if (grade<93) {
            println("your are in A- level")
        }else{
            println("your are in A+ level")
        }
    }


    println("your enter grade $grade")
}