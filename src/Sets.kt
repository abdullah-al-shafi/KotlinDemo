

fun main(args:Array<String>){

    var setmenet = setOf(1,2,3,45,56,45)
    //setEmnet.add(36) not work
    for(element in setmenet){
        println(element)
    }
    var setmenetMutable = mutableSetOf(1,2,3,45,56,45)

    setmenetMutable.add(36)

    for(element in setmenetMutable){
        println(element)
    }

}