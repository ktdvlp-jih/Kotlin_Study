package com.example.hunkotlin

fun main() {
    //기능(함수)들의 집합체(객체)

    //1.class
    //2. data class - set, get(데이터만을 저장하고 불러오기 편리하기 위함)

    //1. 코딩
    //2. 호출

    var cls1 = HelloCalss()
    var cls2 = HelloCalss(26)

    //java
    //helloClass cls = new HelloClass()

    println(cls2.age)

    var person1 = Person(5,"Hun")
    var person2 = Person(age = 15,name = "Hun2")

    println(person1.age + person2.age)
    println("person1.age" + "person2.name")

    println("$person1.age $person1.name")
    println("$person2.age $person1.name")

}

//값을 초가화 시길떄 init // data class에서도 사용간ㅇ
class HelloCalss {
    var age: Int = 0
    init {

    }

    //default
    constructor() //기본생성자 만들어야함
    constructor(age: Int) { //보조생성자
        this.age =age
    }

}


data class Person(var age:Int, var name:String)