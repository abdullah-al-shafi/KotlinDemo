

fun main(args:Array<String>){

    var map=HashMap<Int,String>()
    map.put(1,"Shafi")
    map.put(2,"Amanta")
    map.put(3,"sabbir")

    println(map.get(3))

    //update key
    map.put(3,"Osman")
    for (k in map.keys){
        println(map.get(k))
    }

}