import java.util.*

class Person(var name:String , var age:Int):Comparable<Person>{

    override fun compareTo(other: Person): Int {
        return other.age - this.age
    }
}

fun main(args:Array<String>){

    var listOfNames= ArrayList<Person>()
    listOfNames.add(Person("Shafi",3))
    listOfNames.add(Person("Saad",13))
    listOfNames.add(Person("Abdullah",33))
    println("before sort")
    for (Person in listOfNames){
        println("Name:"+Person.name)
        println("Age:"+Person.age)
    }
    println("after sort")
    Collections.sort(listOfNames)
    for (Person in listOfNames){
        println("Name:"+Person.name)
        println("Age:"+Person.age)
    }
}