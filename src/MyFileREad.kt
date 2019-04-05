import java.io.FileReader
import java.io.FileWriter

fun main(args:Array<String>){

    println("1-read\n 2-Write")
    val op = readLine()!!.toInt()
    when(op){
        1-> {
            ReadFromFile()
        }
        2->{
            print("Write to file text:")
            var str:String = readLine()!!.toString()
            WriteToFile2(str)
        }
    }



}

fun WriteToFile2(str:String){

    try {
        val fo=FileWriter("text.txt",true)
        fo.write(str+ "\n")
        fo.close()
        println("data is saved")
    }catch (ex:Exception){
        println(ex.message)
    }

}

fun ReadFromFile(){
    try {
       val fin=FileReader("text.txt")
        var c:Int?
        do{
            c=fin.read()
            print(c.toChar())
        }while (c!=-1)
    }

    catch (ex:Exception){
        print(ex.message)
    }
}

