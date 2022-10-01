//goal: madlibs with words chosen randomly from .txt files

import java.io.File
//import java.io.BufferedReader
//import java.io.FileWriter
//import java.io.FileReader
//import kotlin.system.exitProcess



fun main() {
    println("Dear, " + Name() + "\n" + "You are extremly " + Adjective() + " and I " + Verb() + " you! I want kiss your " + Body_Part() + " " + (7..90).random().toString() + " times. You make my " + Noun() + " burn with desire." + "\n" + "When I first saw you, I " + Adverb() + " stared at you and fell in love. Will you " + Verb() +  " out with me? Don`t let your parents discourage you, they are just " + Noun() + "s" + "." + "\n" + "Yours forever, " + Name())
}

fun Noun(): String {
    return File("nouns.txt").readLines().random()
}

fun Adjective(): String {
    return File("adjectives.txt").readLines().random()
}

fun Verb(): String {
    return File("verbs.txt").readLines().random()
}

fun Body_Part(): String {
    return File("body parts.txt").readLines().random()
}

fun Name(): String {
    return File("names.txt").readLines().random()
}

fun Adverb(): String {
    return File("adverbs.txt").readLines().random()
}