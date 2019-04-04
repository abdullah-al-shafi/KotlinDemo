abstract  class CreditCard(){
    fun CreaditId(): String {
        return "123abc"
    }
    abstract fun newCreadit()
}
class UserInfo():CreditCard(){
    fun getInfo():String{
        return CreaditId()
    }

    override fun newCreadit() {
        println(" new card created")
    }

}

fun main(args:Array<String>){

//    var creditCard = CreditCard()
//    println(creditCard.CreaditId())

    var user=UserInfo()
    println(user.getInfo())
    user.newCreadit()
}