class Complex(real: Double, imaginary: Double) {
    def re(): Double = {
        real
    }
    def im() = imaginary // 타입 유추
}