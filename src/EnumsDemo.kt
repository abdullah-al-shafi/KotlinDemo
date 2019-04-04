
enum class Direction{
    NORTH,SOUTH,EAST,WEST
}

fun main(args:Array<String>){

    var userdirect=Direction.SOUTH
    if(userdirect==Direction.NORTH){
        println("he wen to north")
    }else{
        println("i don't know where he went")
    }

}