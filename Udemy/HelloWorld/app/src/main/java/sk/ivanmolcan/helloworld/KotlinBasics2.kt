package sk.ivanmolcan.helloworld

fun main(args: Array<String>) {

    var list = ArrayList<Double>()
    list.add(1.0)
    list.add(5.5)
    list.add(6.0)
    list.add(3.8)
    list.add(2.1)

    var num: Double = 0.0

    for(i in list){
        num += i
    }
    println(num/list.size)


}