/*
Operation rules | Priorities rules
1-()
2-++,--(before variable)
3-^
4-*,/
5-+,-
6-=
7-++,--(After Variable)
 */

fun main(args:Array<String>){

    var x=10
    var y=11
    var z=++x+y     //(++x)=(x=x+1),(--x)=(x=x-1)
    //x=11, y=11
    println("z:$z")


    println("before x:$x")
    //x=11, y=11
    var m=x+++y
    println("m:$m")
    println("After x:$x")

}