
class UserAdmin<T>(credit:T){

    init {
        println(credit)
    }
}

fun <T>display(process:T){
    println(process)
}

fun main(args:Array<String>){

    var userAdmin=UserAdmin<String>("Shai")
    var userAdmin2=UserAdmin<Int>(22)
    var userAdmin3=UserAdmin<Double>(1234.4)

    display<Int>(22)
    display<String>("Shafi")

}