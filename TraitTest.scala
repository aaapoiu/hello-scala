object TraitTest {
    def main(args: Array[String]) {
        val someday = new Date(2016, 11, 30)
        val today = new Date(2016, 12, 4)

        println("someday: " + someday)
        println("today: " + today)
        println("someday < today ? " + (someday < today))
        println("someday <= today ? " + (someday <= today))
        println("someday > today ? " + (someday > today))
        println("someday >= today ? " + (someday >= today))
    }
}

trait Ord {
    def < (that: Any): Boolean
    def <=(that: Any): Boolean = (this < that) || (this == that)
    def > (that: Any): Boolean = !(this <= that)
    def >=(that: Any): Boolean = !(this < that)
}

class Date(y: Int, m: Int, d: Int) extends Ord {
    def year = y
    def month = m
    def day = d
    override def toString(): String = 
        year + "-" + month + "-" + day
    override def equals(that: Any): Boolean = that.isInstanceOf[Date] && {
        val o = that.asInstanceOf[Date]
        o.day == day && o.month == month && o.year == year
    }
    def <(that: Any): Boolean = {
        if(!that.isInstanceOf[Date]) 
            sys.error("cannot compare " + that + " and a Date") // error is deprecated. Use sys.error instead.
        val o = that.asInstanceOf[Date]
        (year < o.year) ||
        ((year == o.year) && (month < o.month)) ||
        ((year == o.year) && (month == o.month) && (day < o.day))
    }
}