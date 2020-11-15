fun main(args: Array<String>) {
    println("第一個Hello, world!!!")
    println("Hello, world!")
    println()
    println("List")
    //宣告一個 List 集合，並初始化資料，kotlin 會根據資料，自動推斷，資料型別
    var lists = listOf(666,777,888)

    //取出索引值為1的資料
    println(lists[1])
    println()
/*--------------------------------------------------------------------------------------------------------------------*/
    println("List1")
    //宣告一個 MutableList 資料型態為整數的集合變數
    var mutableList: MutableList<Int>  = mutableListOf()

    //新增資料
    mutableList.add(666)
    mutableList.add(777)
    mutableList.add(888)
    println(mutableList)

    //獲取索引第二筆資料
    mutableList[2]
    println(mutableList[2])

    //移除資料為 666 的資料（需要注意的是這裏跟 Java 不同，此處移除不是根據索引筆數）
    mutableList.remove(666)
    println(mutableList)

    //根據索引筆數刪除方式
    mutableList.remove(mutableList[1])
    println(mutableList)

    //刪除全部 mutableList 內的資料
    mutableList.clear()
    println(mutableList)
    println()
/*--------------------------------------------------------------------------------------------------------------------*/
    println("Map")
    val map = mapOf("1" to 666, "2" to 777)
    println(map)
    println()
/*--------------------------------------------------------------------------------------------------------------------*/
    println("Map1")
    var mutableMap: MutableMap<String, Int> = mutableMapOf()
    //新增資料
    mutableMap.put("1", 666)
    mutableMap.put("2", 777)
    mutableMap.put("3", 888)
    println(mutableMap)

    //移除資料
    mutableMap.remove("1")
    println(mutableMap)

    //獲取資料
    mutableMap.get("2")
    println(mutableMap.get("2"))

    //刪除所有資料
    mutableMap.clear()
    println(mutableMap)
    println()
/*--------------------------------------------------------------------------------------------------------------------*/
    println("set")
    var set = setOf(666,777,888)
    println(set)

/*--------------------------------------------------------------------------------------------------------------------*/
    println("set1")
    var mutableSet: MutableSet<Int> = mutableSetOf()

    //新增資料
    mutableSet.add(666)
    mutableSet.add(777)
    mutableSet.add(888)
    println(mutableSet)

    //移除資料
    mutableSet.remove(666)
    println(mutableSet)

    //判斷元素，是否包含在 Set 集合內
    println(mutableSet.contains(666))

    //清除所有資料
    mutableSet.clear()
    println(mutableSet)
    println()
/*--------------------------------------------------------------------------------------------------------------------*/
    println("for")
    //宣告一個liseof集合
    val course_titkes=listOf("python","java","kotlin")
    println(course_titkes)//[python,java,kotlin]

    //for迴圈，取出每個值
    for(title in course_titkes){
        println(title)
    }
    println()
/*--------------------------------------------------------------------------------------------------------------------*/
    println("while")

    var x=60
    while(x>0){
        println(x--)
    }
    println()
/*--------------------------------------------------------------------------------------------------------------------*/
    println("break")
    val nums= listOf(1,2,3,4,5,6,7,8,9)
    for(n in nums){
        if(n==4) break
        println("n=$n")
    }
    println()
/*--------------------------------------------------------------------------------------------------------------------*/
    println("continue")
    val nums1= listOf(1,2,3,4,5,6,7,8,9)
    for(n in nums1){
        if(n==6) {
            println("跳過第 $n 次循環")
            continue
        }
        println("n=$n")
    }
    println()
/*--------------------------------------------------------------------------------------------------------------------*/
    println("return")

    foo()
    println()
/*--------------------------------------------------------------------------------------------------------------------*/
    println("Range")
    //印出1~4
    for(i in 1..4) print(i)          //1234
    println()
    println()
    //印出1~4，每次增加2
    for(i in 1..4 step 2) print(i)   //13
    println()
    println()

    //印出1~4，但不包含4
    for(i in 1 until 4)  print(i)   //123
    println()
    println()

    //定義最後結束範圍到1
    for(i in 4 downTo 1)  print(i)   //4321
}
fun foo(){
    val nums1= listOf(1,2,3,4,5,6,7,8,9)
    for(n in nums1){
        if(n==5) {
            return
        }
        println("n=$n")
    }

}