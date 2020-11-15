
/*//基本函數定義

fun add(){
    val x=1
    val y=1
    print(x+y)
}
fun main() {
    println("基本函數定義")
    add()
}*/

/*//帶有參數的函數定義
fun add(x:Int,y:Int){
    print(x+y)
}
fun main() {
    println("帶有參數的函數定義")
    add(1,1)
}*/

/*//函數有回傳值定義
fun add(x:Int,y:Int):Int{
    return x+y
}
fun main() {
    println("函數有回傳值定義")
    val result = add(1,1)
    println(result)
}*/

/*//函數有默認參數值定義
fun add(x:Int=0,y:Int=0):Int{
    return x+y
}
fun main() {
    println("函數有默認參數值定義")
    val result_1 = add()
    println(result_1)

    val result_2 = add(1,1)
    println(result_2)
}*/

/*//命名参數的方式來呼叫函數
fun add(x:Int=0,y:Int=0):Int{
    println("x= "+x)//1
    println("y= "+y)//2
    return x+y
}
fun main() {
    println("命名参數的方式來呼叫函數")
    val result = add(y=2,x=1)
    println(result)
}*/

//單行表達式函數
fun add(x:Int=0,y:Int=0)=x+y
fun main() {
    println("單行表達式函數")
    val result = add(2,1)
    println(result)
}