object ZipTest {
    def main(args: Array[String]) {
        List(1,2,3).zip(List("a","b","c")).foreach { it =>
            println(it)
        }
    }
}