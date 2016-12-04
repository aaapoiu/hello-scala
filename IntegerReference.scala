class Reference[T] {
    private var contents: T = _
    def set(value: T) {
        contents = value
    }
    def get: T = contents
}

object IntegerReference {
    def main(args: Array[String]) {
        val cell = new Reference[Int]
        cell.set(13) // 정수 외에 다른 것은 넣을 수 없다
        println("Reference contains the half of " + cell.get * 2)
    }
}