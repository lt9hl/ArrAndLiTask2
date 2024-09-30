/*Имеется массив целых чисел из 5-и строк и 5-и столбцов. Выяснить, симметричен ли он относительно главной диагонали.
То есть - элемент 1,2 равен элементу 2,1. Элемент 1,3 равен элементу 3,1 и т.д. Например массив
5  9  6  7  2
9  8  4  5  3
6  4  3  8  7
7  5  8  4  8
2  3  7  8  1
является симметричным относительно главной диагонали*/
fun main() {
    var arr = Array(5, { Array(5, { 0 }) })
    arr[0] = arrayOf(5, 9, 6, 7, 2)
    arr[1] = arrayOf(9, 8, 4, 5, 3)
    arr[2] = arrayOf(6, 4, 3, 8, 7)
    arr[3] = arrayOf(7, 5, 8, 4, 8)
    arr[4] = arrayOf(2, 3, 7, 8, 1)
    println("Массив по умолчанию\n")
    printArr(arr)
    simmetry(arr)
    println("Желаете создать новый массив\n0-нет\n1-да")
    if (readln() == "1") {
        println("Введите числа")
        try {
            for (i in arr.indices) {
                for (j in 0..<arr[0].size) {
                    arr[i][j] = readln().toInt()
                }
            }
        } catch (e: Exception) {
            println("Введены неверные данные")
            return
        }
        println("Ваш массив")
        printArr(arr)
        simmetry(arr)
    } else println("Выход")

}

fun simmetry(arr: Array<Array<Int>>) {
    var count = 0
    for (i in arr.indices)
        for (j in 0..<arr[0].size)
            if (arr[i][j] == arr[j][i])
                count++
    if (count == arr[0].size * arr.size)
        println("\nЯвляется симметричным относительно главной диагонали\n")
    else println("\nЯвляется несимметричным относительно главной диагонали\n")
}

fun printArr(arr: Array<Array<Int>>) {
    for (i in arr.indices) {
        for (j in 0..<arr[0].size) {
            print("${arr[i][j]}\t")
        }
        println()
    }
}
