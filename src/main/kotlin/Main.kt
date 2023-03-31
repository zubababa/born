import kotlin.math.max
import kotlin.math.sqrt

fun main(args: Array<String>) {
    var number_1 = 1
    var number_2 = 15
    var number_3 = -6
    var res = number_2*number_2-4*number_1*number_3
    var t=sqrt((number_2*number_2-4*number_1*number_3).toDouble())
    var x1=(-number_2+t)/(2*number_1)
    var x2=(-number_2-t)/(2*number_1)
    var l=(max(x1,x2))

    print("Дискреминант: $res")
    println()
    println("Корень из дискриминанта: $t")
    println("Первый корень: $x1")
    println("Второй корень: $x2")
    println("Больший из корней: $l")

    var number_11 = 2
    var number_12 = -4
    var number_13 = -6
    var number_21 = 1
    var number_22 = 9
    var number_23 = 6
    var number_31 = 11
    var number_32 = 15
    var number_33 = 26
    var t1=number_11*(number_22*number_33-number_23*number_32)
    var t2=-number_12*(number_21*number_33-number_23*number_31)
    var t3=number_13*(number_21*number_32-number_22*number_31)
    var T=t1+t2+t3
    println("Определитель матрицы $T")
}