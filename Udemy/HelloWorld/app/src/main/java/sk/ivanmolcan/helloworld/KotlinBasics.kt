package sk.ivanmolcan.helloworld

fun main(){
//    var num = 100
//
//    while (num>=0){
//        if(num%2 == 0) println(num)
//        num--
//    }
//
//    for(i in 0 .. 10000){
////        print("$i")
//        if(i == 9001) println("IT'S OVER 9000!!!")
//    }
//
//    var humidity = "humid"
//    var humidityLevel = 80
//
//    while(humidity == "humid"){
//        println("$humidityLevel")
//        humidityLevel -=5
//        println("humidity decreased")
//        if(humidityLevel < 60){
//            println("it's comfy now")
//            humidity = "comfy"
//        }
//    }

    println(MobilePhone("Android", "Samsung", "Galaxy S20 Ultra"))
    println("\n ${Car().myBrand}")

}

class MobilePhone(osName: String = "Android", brand: String = "Nokia", model: String = "5540"){

    var weight : Int? = null

    init {
        println("Os name - $osName, Brand - $brand, Model - $model")
    }
}

class Car(){
   lateinit var owner : String

   val myBrand: String = "BMW"
    get(){
        return field
    }

    var maxSpeed: Int = 250
    get() = field
    set(value){
        field = value
    }

   init{
       owner = "Frank"
   }
}
