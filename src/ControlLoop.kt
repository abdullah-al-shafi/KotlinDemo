

fun main(args:Array<String>){

    for (count in 1..10){

        if (count==3){
            continue
        }
        for (count2 in 1..5){
            println("count:$count")
            if (count2==2){
                break
            }
        }
    }
    println("Loop Done")
}