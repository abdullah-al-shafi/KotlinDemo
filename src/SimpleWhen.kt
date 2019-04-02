

fun main(args:Array<String>){

    var x=30

    when(x){
        //1 or 2
        1,2-> {
            print("Value is 1,2")
        }
        //10 to 30
        in 10..30-> {
            print("Value is range 10..30")
        }
        !in 10..30-> {
            print("Value is is not in range 10..30")
        }
        else -> {
            print("Value is out of range")
        }
    }
}