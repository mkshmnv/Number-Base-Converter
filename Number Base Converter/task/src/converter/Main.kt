package converter // Do not delete this line

fun main() {
    print("Enter number in decimal system: ")
    val numberDecimal = readln().toInt()

    print("Enter target base: ")
    val result = when (readln().toInt()) {
        2 -> binary(numberDecimal)
        8 -> octal(numberDecimal)
        16 -> hexadecimal(numberDecimal)
        else -> 0
    }

    print("Conversion result: $result")
}

// Convert Decimal to Binary
fun binary(numberDecimal: Int) : Int {
    var input = numberDecimal
    var result = ""
    while (input > 0) {
        if (input % 2 == 0) {
            input /= 2
            result += 0
        } else {
            input /= 2
            result += 1
        }
    }
    return result.reversed().toInt()
}

fun octal(numberDecimal: Int): Int {
    return 0
}

fun hexadecimal(numberDecimal: Int): Int {
    return 0
}

