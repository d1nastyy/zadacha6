fun main() {
    println("Введите первую цифру:")
    val digit1 = readLine()!!.toInt()
    println("Введите вторую цифру:")
    val digit2 = readLine()!!.toInt()

    if (digit1 != digit2) {
        if ((digit1 % 2 == 1) || (digit2 % 2 == 1)) {
            println("Нечетное число: ${digit1 * 10 + digit2}")
        } else {
            println("Создать нечетное число невозможно")
        }
    } else {
        println("Создать нечетное число невозможно")
    }
}
