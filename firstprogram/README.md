Hello world example for Kotlin

Dependencies
============

Java : https://gist.github.com/ansell/3606df67ccd89bf9d2e7
Kotlin : https://gist.github.com/ansell/3606df67ccd89bf9d2e7

Compilation
===========

Source: https://kotlinlang.org/docs/tutorials/command-line.html

Include the runtime to be self-contained:

    kotlinc hello.kt -include-runtime -d hello.jar
    java -jar hello.jar 

Do not include the runtime to be flexible:

    kotlinc hello.kt -d hello.jar
    kotlin -classpath hello.jar HelloKt # HelloKt is a magically generated main class name for hello.kt
