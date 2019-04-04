class CarWithCons(){
    var type:String?=null
    var model:Int?=null
    var price:Double?=null
    var milesDrive:Int?=null
    var owner:String?=null

    constructor( type:String, model:Int, price:Double,
                 milesDrive:Int, owner:String):this(){

        println("type:$type")
        println("model:$model")
        println("price:$price")
        println("milesDrive:$milesDrive")
        println("owner:$owner")

        this.type=type
        this.model=model
        this.price=price
        this.milesDrive=milesDrive
        this.owner=owner
        println("constructor1")

    }
    constructor(Name:String):this(){

        println("new class instance")

    }

    fun getCarPrice():Double? {

        return this.price!! - (this.milesDrive!!.toDouble()*10 )
    }


    fun GetOwner(): String? {

        return this.owner
    }


}


fun main(args:Array<String>){
    var c = CarWithCons("Shafi")
    var shaCar = CarWithCons("BMW",2015,10000.0,105,"Shafi")
    println("Get Owner:"+ shaCar.GetOwner())
    println("Get price:"+ shaCar.getCarPrice())

    var sadCar= CarWithCons("KIA",2019,2000.0,1,"Osman")
    println("Get Owner:"+ sadCar.GetOwner())
    println("Get price:"+ sadCar.getCarPrice())

}