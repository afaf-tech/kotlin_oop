package app

import data.BigNote
import data.Note

fun main() {

    val note = Note("Belajar Kotlin OOp");
    println(note.title);
    note.title = ""
    println(note.title)
    val bignote= BigNote("belajar Kotlin oop")
    print(bignote.bigTitle)
}