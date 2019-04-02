

fun main(args:Array<String>){

    var count = 1
    do {   //block of code
        println("Enter the loop")
        if(count==2){
            println("count:$count")
        }
        ++count
    }while (count <= 5)
    print("Loop Done")



}