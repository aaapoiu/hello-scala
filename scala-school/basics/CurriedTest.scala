object CurriedTest {
    def add(m: Int, n: Int): Int = {
        m + n
    }

    def addTwo = (add _).curried(2)

    def main(args: Array[String]) {
        println("addTwo(4) == 6 : " + (addTwo(4) == 6))
    }
}