package sk.ivanmolcan.classesandobjects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//Interfaces
class MyClass{
    lateinit var myListener: ExampleListener
}

interface  ExampleListener{
    fun sayHello()
}

//Companion
class AppData{

    companion object{
        var score: Int = 0
    }
}

//Enums
enum class Direction{
    NORTH, SOUTH, WEST, EAST
}

enum class ColorEnum(val rgb: Long){
    RED(0xff0000),
    BLUE(0x0000ff),
    GREEN(0x00ff00)
}

//Generics
class Generic<T>(age: T){

}

class MainActivity : AppCompatActivity(), ExampleListener {
    //Data Conversion
    fun myFunction(x: Any){
        if(x is String){
            println(x.length)
        }
        //Unsafe Casting
        val y: String = x as String
        //Safe Casting
        val z: String? = x as? String
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Data Conversion
        var myVal = 10
        val theLong = myVal.toLong()

        //Generics
        var obj1: Generic<String> = Generic("Kotlin")
        var obj2: Generic<Int> = Generic(123)
        var obj3: Generic<ExUser> = Generic(ExUser())

        //Enum
        val myDir = Direction.NORTH
        if(myDir == Direction.SOUTH){

        }

        //Companion
        AppData.score = 8

        //Class
        val ivanUser = User("Ivan", "ivan@ivan.com", 20, 40)
        val steveUser = User("Steve", "steve@steve.com", 45, 27)

        val arrayOfUsers = ArrayList<User>()
        arrayOfUsers.add(ivanUser)
        arrayOfUsers.add(steveUser)

        val data : HashMap<String, String> = hashMapOf("name" to "Amir", "email" to "ivan@gmail.com", "id" to "2342")

        val myUser2 = User2(data)

        val exUser = ExUser()

        //Optionals and Null Safety
        var a: String = "Hello"
        var b: String? = null

        var f: Int = 0
        if(b != null){
            f = b.length
        }else{
            f = -1
        }
        var ff:Int = b?.length ?: -1

        val g = b!!

        //Interfaces
        var myObj = MyClass()
        myObj.myListener = this
        myObj.myListener.sayHello()

        //Try and Catch
        val result: Int = divider(100, 0)

    }

    override fun sayHello() {
        TODO("Not yet implemented")
    }

    //Try and Catch
    fun divider (numerator: Int, denominator: Int) : Int{
        return try{
            numerator/denominator
        } catch (e: ArithmeticException){
            0
        } finally{

        }
    }
}
//Class
class User(inpName: String, inpEmail: String, inpId: Int, inpAge: Int){
    val name = inpName
    val email = inpEmail
    val id = inpId
    val age = inpAge
}
//Constructor
class User2(){
    var name: String = ""
    var email: String = ""
    var id: String = ""

    constructor(map: HashMap<String, String>) : this() {
        name = map["name"]!!
        name = map["email"]!!
        name = map["id"]!!
    }
}
//Data Class
data class User3(var name: String){

}
//Inheritance Override
open class Property{
    var address: String = ""

    open fun setOpenHouse(){}
    open fun someFunction(){}

    open var ready: Boolean = true
}

class Rental: Property (){
    var rent: Int = 1000

    override fun setOpenHouse() {
        super.setOpenHouse()

    }
}

class Sale: Property(){
    var sale: Int = 100_000

    override fun someFunction() {
        super.someFunction()
        sale = sale -10_000
    }
}


