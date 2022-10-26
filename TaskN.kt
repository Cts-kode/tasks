ЗАДАЧА 1
fun main(args: Array<String>) {
    var value = 25 //Двузначное число
    var d_1 = value % 10 //Получение второй цифры
    var d_2 = value / 10 //Получение первой цифры
    var s = d_1 + d_2 //Сумма этих чисел
    var y = d_1 * d_2 //Произведение этих чисел
    println(s) //Полученная сумма
    println(y) //Полученное произведение

}
ЗАДАЧА 2
fun main(args: Array<String>) {
    var value = 254 //Трёхзначное число
    var d_1 = value % 10 //Получение третьей цифры
    var d_2 = value / 10 % 10 //Получение второй цифры
    var d_3 = value / 100 //Получение первой цифры
    var s = d_1 + d_2 + d_3 //Сумма этих чисел
    var y = d_1 * d_2 * d_3 //Произведение этих чисел
    println(s)
    println(y)



}
ЗАДАЧА 3
fun main(args: Array<String>) {
    var value = 254 //Трёхзначное число
    var d_1 = value % 10 //Получение третьей цифры
    var d_2 = value / 10 % 10 //Получение второй цифры
    var d_3 = value / 100 //Получение первой цифры
    var n_1 = d_1*100 + d_2*10 +d_3

    println(n_1)

}

ЗАДАЧА 4
fun main(args: Array<String>) {
    println("Введите количество см в расстоянии: ")
    var l:Int
    l = readLine()!!.toInt()
    var m = l/100

    println(m)
}
ЗАДАЧА 5
fun main(args: Array<String>) {
    println("Введите количество прошедших секунд: ")
    var l:Int
    l = readLine()!!.toInt()
    var m = l/60


    println(m)

}
ЗАДАЧА 6
fun main(args: Array<String>) {
    println("Введите число А: ")
    var A:Int
    A = readLine()!!.toInt()
    if (A > 0)
        println("Число А положительное")
    else
        println("Число А отрицательное")

}
ЗАДАЧА 7-8
fun main(args: Array<String>) {
    println("Введите число А: ")
    var A:Int
    A = readLine()!!.toInt()
    if (A % 2 == 0)
        println("Число А чётное")
    else
        println("Число А нечётное")

}
ЗАДАЧА 9
fun main(args: Array<String>) {
    println("Введите число А: ")
    var A:Int
    A = readLine()!!.toInt()
    println("Введите число В: ")
    var B:Int
    B = readLine()!!.toInt()
    if ((A > 2)&&(B <= 3))
        println("Справедливо")
    else
        println("Несправедливо")

}
ЗАДАЧА 10
fun main(args: Array<String>) {
    println("Введите число А: ")
    var A:Int
    A = readLine()!!.toInt()
    println("Введите число В: ")
    var B:Int
    B = readLine()!!.toInt()
    if ((A%2!=0)&&(B%2!=0))
        println("Оба числа нечётные")
    else
        println("Оба числа(или одно из) - нечётные(ое)")

}
ЗАДАЧА 11
fun main(args: Array<String>) {
    println("Введите число А: ")
    var A:Int
    A = readLine()!!.toInt()
    println("Введите число B: ")
    var B:Int
    B = readLine()!!.toInt()
    println("Введите число C: ")
    var C:Int
    C = readLine()!!.toInt()
    if ((A>=0)&&(B>=0)&&(C>=0))
        println("Все числа положительны")
    else
        println("Все числа, или некоторые из - отрицательны")

}
ЗАДАЧА 12
fun main(args: Array<String>) {
    println("Введите число А: ")
    var A:Int
    A = readLine()!!.toInt()
    println("Введите число B: ")
    var B:Double
    B = readLine()!!.toDouble()
    println("Введите число C: ")
    var C:Int
    C = readLine()!!.toInt()
    var x: Double
    val D = Math.pow(B,2.0) - 4 * A * C
    if ((A!=0)&&(D>0))

        println("Имеет корни")
    else
        println("Не имеет")

}
ЗАДАЧА 13
fun main(args: Array<String>) {
   var X:Int
   X = readLine()!!.toInt()
    var Y:Int
    Y = readLine()!!.toInt()
    if((X > 0)&&(Y > 0))
        println("Точка лежит в первой плоскости")
    else if((X > 0)&&(Y < 0))
        println("Точка лежит в четвертой плоскости")
    else if((X < 0)&&(Y > 0))
        println("Точка лежит во второй плоскости")
    else if((X < 0)&&(Y < 0))
        println("Точка лежит в третьей плоскости")
}
ЗАДАЧА 14
fun main(args: Array<String>) {
   var X:Int
   X = readLine()!!.toInt()
    var Y:Int
    Y = readLine()!!.toInt()
    var C:Int
    C = readLine()!!.toInt()
    if(((X+Y)>C)&&((X+C)>Y)&&((Y+C)>X))
        println("Существует треугольник")
    else
        println("Несуществует треугольник")

}
