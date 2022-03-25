import kotlin.math.sqrt

fun main() {
    val pointOne = Point(1.0, 2.0)
    val pointTwo = Point(2.0,1.0)
    println(pointOne.toString()) // Works, tho don't understand logic well
    println(pointOne.equals(pointTwo)) // Surprisingly also Works, true if coordinates match
    pointOne.centerSymmetry() // Works, this one was easy
    //pointTwo.centerSymmetry()
    println(pointOne.pointDistance(pointTwo)) // spend 15 minutes guessing why didn't work, was calling it wrong way



}

class Point(private val x: Double, private val y: Double) {
    override fun toString(): String {
        val strX = x.toString()
        val strY = y.toString()
        //println("$strX, $strY")
        return "სტრინგად დაბრუნებული ველები $strX, $strY"
    }

    fun equals(other: Point): Boolean {
        if (this.x != other.x && this.y != other.y) return false
        return true
    }

    fun centerSymmetry() {
        val symX = -y
        val symY = -x
        println("სათავის მიმართ სიმეტრიულად გადატანილი წერტილის ახალი კოორდინატებია: $symX, $symY")
    }

    fun pointDistance(other: Point): Double {
        return sqrt((this.x - other.x)*(this.x - other.x)+(this.y - other.y)*(this.y - other.y))
    }
}