package coursera.`object`

import java.lang.IllegalArgumentException

@JvmField
val answer = 42


open class Expr
class Num(val value: Int): Expr()

class Sum(val left: Expr, val right: Expr) : Expr()

fun eval(e: Expr): Int =
    when (e) {
        is Num -> e.value
        is Sum -> Controller.Something.foo()
        else -> throw IllegalArgumentException()
    }
interface Repository {
    fun getById(id: Int): Num
    fun getAll(): List<Num>

}
interface Logger {
    fun logAll()

}
class Controller(val repository: Repository, val logger: Logger) : Repository by repository, Logger by logger {
    object Something : Expr() {
        fun foo(): Int {
           return 3
       }

    }
}