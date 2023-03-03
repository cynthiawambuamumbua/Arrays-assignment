fun main(){
    val namesArrays= arrayOf("jane","catherine","job","Asenath")
//    namesArrays.forEach { namesArrays->println(namesArrays) }
    println(namesArrays.sortedArray().contentToString())
    cities()
    numbers()
    var names = arrayOf("Valary","Eric","Jose")
    println(names.contentToString())


}
fun namesArray(x:String, y:String,z: String,u:String): String{
    val namesArrays = arrayOf("x","y","z","u")
    return namesArrays.contentToString()
}
fun cities(){
    var cities = arrayOf("harare","mumbai","dodoma","jakarta")
    println(cities.map { it.capitalize() })

}
fun numbers(){
    var number = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var sum = number[1] + number[4]
    println(sum)
    println(number.indexOf(158))
    println(number.sortedArray().contentToString())

}
fun names(name1:String, name2:String, name3:String): String{
    val names = arrayOf("name1","name2","name3")
    return names.contentToString()
}

