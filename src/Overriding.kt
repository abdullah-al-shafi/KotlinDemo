open class Operations1(){

    /*
    by default it is public...
    if we protect it we can access it by inheritance
    if we privet it...we only can use it in this class
     */
    var processname:String?=null
    open fun sum(n1:Int,n2:Int):Int{
        return n1+n2
    }
    fun div(n1:Int,n2:Int):Int{
        return n1/n2
    }

}
class MultiOperations1():Operations1(){

    var t:Int?=null
    override fun sum(n1:Int,n2:Int):Int{
        return n1+n2*3
    }
    fun sub(n1:Int,n2:Int):Int{
        return n1-n2
    }
    fun multi(n1:Int,n2:Int):Int{
        return n1*n2
    }
    fun GetName(){
        super.processname
    }
}

fun main(args:Array<String>){

    var op = Operations1()
    var sum = op.sum(10,15)
    println("sum:$sum")
    var div = op.div(12,11)
    println("div:$div")

    println("op.ProcessName:"+op.processname)
    //Second

    var op2= MultiOperations1() as Operations1
    sum = op2.sum(10,15)
    println("sum:$sum")
    div = op2.div(12,11)
    println("div:$div")

}

