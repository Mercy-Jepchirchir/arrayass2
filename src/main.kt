fun main(){
  var multiply = takeIntegers(arrayOf(6,4,6,4))
  println(multiply)
    var decimal = takesMixedTypes(arrayOf(5.3,5.5,5.6F,6.8))
    println(decimal)
    var all = takeInChar(arrayOf('a','d','e','i','o','g','u'))
    println(all)
}
fun takeIntegers(numbers:Array<Int>):Int{
    var product = 1
    numbers.forEach { mercy->
        product*=mercy
    }
    return product
}
fun takesMixedTypes(mercy: Array<Any>):Double {
    var sum = 0.0
    mercy.forEach { chirii ->
        if (chirii is Double || chirii is Double || chirii is Float || chirii is Double) {
            sum += chirii.toString().toDouble()
        }

    }
    return sum
}
fun takeInChar(vowels: Array<Char>):Int{
    var number  = 0
    vowels.forEach { chirii->
        if (chirii=='a'|| chirii=='e'|| chirii=='i'|| chirii=='o'|| chirii=='u')
            number++
    }
    return number

}
