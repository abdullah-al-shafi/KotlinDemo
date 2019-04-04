
class Car(var type:String,var model:Int,var price:Double,
          var milesDrive:Int,var owner:String){

//    init {
//        println("type:$type")
//        println("model:$model")
//        println("price:$price")
//        println("milesDrive:$milesDrive")
//        println("owner:$owner")
//    }

    fun getCarPrice():Double {

        return this.price - (this.milesDrive.toDouble()*10 )
    }

}


fun main(args:Array<String>){

   val shaCar = Car("BMW",2015,10000.0,105,"Shafi")
    println("shafiCar:"+shaCar.getCarPrice())
    val sadCar= Car("KIA",2019,2000.0,1,"Osman")
    println("sadCar:"+sadCar.getCarPrice())

}