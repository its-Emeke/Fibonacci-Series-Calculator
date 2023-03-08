fun main(args: Array<String>) {
    //Todo A Fibonacci Series
    println("Enter the Number You want in the Series")
    var value = readln().toIntOrNull()
    if(value == null){
        value = 1
    }
    var a = 0
    var b = 1
    println("************************")
    print("The Fibonacci series of $value is : ")
    //Todo Add the 2 previous values
    for (i in 0 until value){
        print("$a ")
        var c = a + b
        a = b
        b = c
    }
}