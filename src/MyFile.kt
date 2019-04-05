import java.io.FileWriter

fun main(args:Array<String>){

    print("Write to file text:")
    var str:String = readLine()!!.toString()
    WriteToFile(str)

}

fun WriteToFile(str:String){

    try {
        var fo=FileWriter("text.txt",true)
        fo.write(str+"\n")
        fo.close()
    }catch (ex:Exception){
        println(ex.message)
    }

}