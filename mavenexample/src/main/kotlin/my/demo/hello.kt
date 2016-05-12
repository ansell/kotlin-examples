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
		val test = when (index) {
			in 0..1	-> "Going..." 
			3	-> "... Gone"
			in 6..7	-> index // Note, these do not appear with the null-safe cast operator below, and look as if they are null
			!in 2..5 -> "still here?"
			else -> null
		}
		// as? is a null-safe cast operator that will only translate strings through, and return null instead of failing to cast
		println(test as? String)
	}
}
