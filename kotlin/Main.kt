import kotlin.math.pow

fun main() {
//    Zadanie1()
//    Zadanie2()
//    Zadanie3()
//    Zadanie4()
//    Zadanie5()
    Zadanie6()

}

fun Zadanie1(){ // вариант 18
    try {
        println("Введите число x")

        var x: Double = readLine()!!.toDouble()
        if(x>=8) x = -(x.pow(2))+x-9
        else
            x = 1/(x.pow(4)-6)
        println(x)
    }
    catch(e: Exception){
        println("Вы ввели не число")
    }
}
fun Zadanie2(){
    try {
        println("введите первое число")
        var firstnumber: Double = readLine()!!.toDouble()
        println("введите второе число")
        var secondnumber: Double = readLine()!!.toDouble()
        if (firstnumber > secondnumber)
            secondnumber++
        else
            firstnumber++
        if (firstnumber == secondnumber)
            println(firstnumber.pow(3))
        else
            println("если к минимальному числу добавить 1, то они не станут равными")
    }
    catch(e:Exception){
        println("вы ввели не число")
    }
}
fun Zadanie3() {
    try {
        println("введите цифру")
        val x: Int = readLine()!!.toInt()
        when (x) {
            0 -> println("ноль")
            1 -> println("один")
            2 -> println("два")
            3 -> println("три")
            4 -> println("четыре")
            5 -> println("пять")
            6 -> println("шесть")
            7 -> println("семь")
            8 -> println("восемь")
            9 -> print("девять")
            else ->
                println("вы ввели не цифру")
        }
    } catch (e: Exception) {
        println("вы ввели не число")
    }
}
fun Zadanie4(){
    try {
        println("введите возраст")
        val x: Int = readLine()!!.toInt()
        if (x < 0)
            println("возраст должен быть минимум равен 0")
        else {
            when (x) {

                in 0..2 -> println("младенец")
                in 3..13 -> println("ребенок")
                in 14..17 -> println("подросток")
                in 18..55 -> println("взрослый")
                in 56..90 -> println("старый")
                in 91..122 -> println("долгожитель")
                else -> println("новый рекордный возраст человека")

            }
        }
    } catch (e: Exception) {
        println("вы ввели не число")
    }
}
fun Zadanie5(){
    try {
        println("Введите число")
        val num: Int = readLine()!!.toInt()
        if (num == 0)
            println("нулевое число")
        else {
            if (num < 0)
                print("Отрицательное ")
            else
                print("Положительное ")

            if (num % 2 == 0)
                print("четное число")
            else
                print("нечетное число")
        }
    }
    catch(e:Exception){
        println("Вы ввели не число")
    }
}
fun Zadanie6(){
    try{
        println("Введите год")
        val year: Int = readLine()!!.toInt()
        if(year%100==0 && year%400==0)
            println("Високосный")
        else if(year%4==0 && year%100!=0)
            println("Високосный")
        else
            println("невисокосный")
    }
    catch(e:Exception){
        println("вы ввели не число")
    }
}
