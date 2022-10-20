package com.example.lr1

class Words {

    val newItem2: MutableList<String> = mutableListOf()
    val message: MutableList<String> = mutableListOf()
    var list2: MutableList<String> = mutableListOf()
    val str = "Слова не найдены"


    fun wordsString(list: MutableList<String>): MutableList<String> {
        message.add(str)
        list2 = list.toString().split(" ") as MutableList<String>

        newItem2 += list2.filter {it.toList().first() == it.toList().last()}
        if(newItem2.isEmpty())
            return message

        return newItem2
    }
}



