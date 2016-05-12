package my.demo

fun main(args: Array<String>) {
    println("Hello, World!")
	
	if(args.size > 0) {
		print("First argument: ${args[0]}")
	}
}
