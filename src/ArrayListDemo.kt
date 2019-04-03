

fun main(args:Array<String>){

    var arrayList = ArrayList<String>()

    arrayList.add("arafa")
    arrayList.add("laya")
    arrayList.add("Shafi")
    arrayList.add("amanta")
    arrayList.add("humayra")
    arrayList.add("saad")

    println("first name:"+arrayList.get(0))
    arrayList.set(0,"sharafat")

    println("all element by object")
    for (item in arrayList){
        println(item)
    }
    println("all element by index")
    for (index in 0..arrayList.size-1){

        println(arrayList.get(index))
    }

    //Search
    if (arrayList.contains("Shafi")){
        println("name is found")
    }else{
        println("name is not found")
    }

}