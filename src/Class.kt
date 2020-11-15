/*//如何使用類別中的function
fun main() {
    println("如何使用類別中的function")
    /*Calc().sum(1,1)//2
    Calc().sub(1,1)//0
    Calc().mul(1,1)//1
    Calc().div(1,1)//1*/
    println(Calc().sum(1,1))//2
    println(Calc().sub(1,1))//0
    println(Calc().mul(1,1))//1
    println(Calc().div(1,1))//1
}

class Calc{
    /*fun sum(x:Int,y:Int){println(x+y)}
    fun sub(x:Int,y:Int){println(x-y)}
    fun mul(x:Int,y:Int){println(x*y)}
    fun div(x:Int,y:Int){println(x/y)}*/
    fun sum(x:Int,y:Int)=x+y
    fun sub(x:Int,y:Int)=x-y
    fun mul(x:Int,y:Int)=x*y
    fun div(x:Int,y:Int)=x/y
}*/
/*//存取類別的屬性
class Account{
    //帳號
    var id: String =""
    //戶名
    var name: String =""
    //餘額
    var balance: String =""
}
fun main(args:Array<String>){
    println("存取類別的屬性")
    //實體化
    val account=Account()
    //設定類別屬性值
    account.id ="123456789"
    account.name="HKT"
    account.balance="100"
    //獲取類別屬性值
    println(account.id)
    println(account.name)
    println(account.balance)
}*/
/*
//類別初始化
class Account{
    //戶名
    var name: String=""
    init{
        println("初始化，第一層")
    }

    constructor(){
        println("初始化，第二層")
    }
}

fun main() {
    //實體化
    val account=Account()
    account.name="hkt"
    println(account.name)
}
 */
/*
//繼承
open class Person{
    //戶名
    var name: String=""
    //地址
    var address: String=""
}

class Account : Person(){
    //帳號
    var id: String=""
}

fun main() {
    val account=Account()

    account.id="105103333"
    account.name="junyi"
    account.address="新北市板橋區四川路二段"

    println(account.id)
    println(account.name)
    println(account.address)
}
 */
/*
//複寫屬性   加入open、override關鍵修飾詞
open class Person{
    //戶名
    open var name: String = ""
}
class Account : Person(){
    //複寫戶名
    override var name: String = "123"
}

fun main() {
    val account=Account()
    print("更改前：")
    println(account.name)
    account .name="OIT_EE"
    print("更改後：")
    println(account.name)
}
 */
/*
//複寫函數    加入open、override關鍵修飾詞
open class Person{
    open fun show_state(){
        println("HKT")
    }
}

class Account: Person(){
    override fun show_state() {
        println("kitty")
    }
}

fun main() {
    //實體化
    val account=Account()
    account.show_state()
}
 */
/*
//介面
interface PersonInterface{
    fun show_state()
}
//實作Interface要求的show_state
class Account : PersonInterface{
    override fun show_state() {
        println("name：OITEE")
    }
}

fun main() {
    //實體化
    val account=Account()
    account.show_state()
}
 */
/*
//擴展
class Account{
    var id: String=""
}
//擴展Account，加入新功能
fun Account.Print(){
    println("帳號："+id)
}
fun main() {
    //實體化
    val account=Account()
    account.id="123456789"
    account.Print()
}
 */
/*
//資料類別
data class Account(val id:String,val name:String)
//自動生成 equals()  hashCode() toString()  componentN()  copy()

fun main() {
    val account_1=Account("123465789","OIT")
    val account_2=Account("666666666","junyi")
    val account_temp=account_1

    println(account_1.equals((account_2)))
    println(account_1.hashCode())
    println(account_temp.hashCode())
    println(account_2.hashCode())
    print(account_1.id)
    print(account_1.name)
}
 */
/*
//泛型 百變怪
class Box<T>(t:T){
    var value = t
}

fun main() {
    val box_int=Box(10)
    println(box_int.value)
    val box_string=Box("132...231")
    println(box_string.value)
}
 */
//列舉
enum class Color{
    YELLOW,
    GREEN,
    RED
}
enum class Day{
    MONDAY,
    TUSEDAY,
    WEDNESDAY
}

fun main() {
    println("${Color.YELLOW.ordinal} : ${Color.YELLOW.name}")
    println("${Day.TUSEDAY.ordinal} : ${Day.TUSEDAY.name}")
}
