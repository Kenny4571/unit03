fun main(args: Array<String>) {
    print("Is anyone in your party a vegetarian? yes [Enter] ")
    val vegetarian = readLine()?.toBoolean() ?: false
 
    print("Is anyone in your party a vegan? yes [Enter] ")
    val vegan = readLine()?.toBoolean() ?: false
 
    print("Is anyone in your party gluten-free? yes [Enter] ")
    val glutenFree = readLine()?.toBoolean() ?: false
 
    println("Main Street Pizza Company, Corner Cafe, The Chef's Kitchen:")
    if (vegetarian || vegan || glutenFree) {
    }
    
}
       
