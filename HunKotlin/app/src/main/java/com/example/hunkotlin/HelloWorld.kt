package com.example.hunkotlin

fun main() {
    val hello1: String = "안녕"   //final값
    var hello2: String = "하이"   //int,string,float,double 등등
    var hello3: String?   //null 값에 엄격 ?을 넣으면 null값 입력 가능 값을 저렇게 하고 넣어도 됨

    print(hello1)
    println(hello2)
    print(hello())
}

fun hello(): String { //자바로 생각하면 void 반환값 String
    return "hello함수호출"
}
