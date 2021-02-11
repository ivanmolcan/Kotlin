package sk.ivanmolcan.helloworld

fun main(){
    var num = 100

    while (num>=0){
        if(num%2 == 0) println(num)
        num--
    }

    for(i in 0 .. 10000){
//        print("$i")
        if(i == 9001) println("IT'S OVER 9000!!!")
    }

    var humidity = "humid"
    var humidityLevel = 80

    while(humidity == "humid"){
        println("$humidityLevel")
        humidityLevel -=5
        println("humidity decreased")
        if(humidityLevel < 60){
            println("it's comfy now")
            humidity = "comfy"
        }
    }
}
