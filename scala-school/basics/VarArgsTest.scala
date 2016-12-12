object VarArgsTest {
    def capitalizeAll(args: String*) = {
        args.map { arg =>
            arg.capitalize
        }
    }
    def main(args: Array[String]) {
        capitalizeAll("abcd", "efg", "asdfasdf").foreach { str =>
            println(str)
        }

    }
}