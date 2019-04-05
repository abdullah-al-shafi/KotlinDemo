

fun main(args:Array<String>){

    try {
        print("Enter N2:")
        var n2:Int = readLine()!!.toInt()
        var div =100/n2
        println("DIV:$div")
    }catch (ex:Exception){
        println(ex.message)
    }

    println("app is done")
}