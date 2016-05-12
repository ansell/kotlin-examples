package my.demo

fun main(args: Array<String>) {
	println("Hello, World!")

	if(args.size > 0) {
		println("First argument: ${args[0]}")
	}
	for(i in args.indices) {
		println("$i = ${args[i]}")
	}
	for((index, value) in args.withIndex()) {
		println("$index = ${value}")
		when (value) {
			"Hello"	-> println("G'day")
			"World"	-> println("Earth")
		}
	}
}
