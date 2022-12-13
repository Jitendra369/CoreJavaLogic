fun main(){


    println("hello world")
    var a = addnew(1,2);
    var b =sum(8,7);
    var c =add(78,78);
   println(a+b+c);
    printSum(1,2);
    variable()

    var rec = Rectangle(5.0,2.0);
    rec.area;
    println(rec.area)
    println("area of rectangle is ${rec.area}")
//    string
    stringMethod()
    loopStatment()
}

fun loopStatment() {
   var iteam = listOf("apple","banana","orhange")
    for (itm in iteam){
        println(itm)
    }

    var color = listOf("blue","back")
    for (m in color.indices){
        println("number of element in the array is ${color[m]}")
    }
}

fun stringMethod() {
    var a =1;
    var b = "a is $a"
    a = 10
    var num = "${b.replace("is","was")}, but now it is $a"
    println(num)
    var name:String


}

fun sum(a: Int, b: Int): Int {
    if (a<0 || b<0){
        return 0
    }
    return a + b
}
fun add(num1 : Int, num2:Int):Int{
    return num1 +num2
}


fun maximum(a: Int , b :Int )= if (a>b) a else b;

fun addnew(a: Int , b:Int) = a+b;
fun printSum(a: Int, b:Int){
    println("$a and $b is ${a + b}")
}
fun variable(){
var a:Int=1
    var b = 2;
    var c:Int
    c = 3
    println(a)
    println(b)
    println(c)
}

class Rectangle(var height : Double, var breath:Double){
    var area = height * breath;
}