

fun main(args:Array<String>){

   var map= hashMapOf(1 to "shafi",2 to "amanta")
    map.put(3,"abdullah")
    println(map.get(3))
    println(map[3])

    var ar = arrayOf(1,55,2,4,9)
    println(ar[0])

    //data can't changeable
    var list = listOf(11,55,99,6,7)

    for(item in list){
        println(item)
    }
    //data can chage and update
    var listmutable = mutableListOf(2,3,5,6,7)
    listmutable[0]=1
    for (item in listmutable){
        println(item)
    }

}