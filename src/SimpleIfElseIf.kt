

fun main(args:Array<String>){

    println("Enter Your grade")
    var grade = readLine()!!.toDouble()

    if(grade>=90){
        //block of code

        println("your are in A level")
    }else if(grade>=80 && grade<90){

        println("your are not in B level")
    }else if(grade>=70 && grade<80){

        println("your are not in B level")
    }else{
        println("you fail")
    }


    println("your enter grade $grade")
}