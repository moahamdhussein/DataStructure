import java.util.*

fun main(args: Array<String>) {

    val names : MutableList<String> = mutableListOf()
    println("enter the number of names you need to enter")
    val n :Int = readln().toInt()
    for (i in 0 until n){
        println("enter the name number ${i+1}")
        names.add(readln())
    }

    println("names that contains b or m with ignore case")
    names.forEach{
       if ( it.contains("m" , true) || it.contains("b" , true) ){
           println(it.uppercase())
       }
    }

}