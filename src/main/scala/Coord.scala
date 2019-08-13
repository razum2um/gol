package gol

class Coord(var x: Int, var y: Int) extends Ordered[Coord] {
    import scala.math.Ordered.orderingToOrdered

    def compare(that: Coord): Int = (this.x, this.y) compare (that.x, that.y)

    override def toString: String = s"($x, $y)"

    def canEqual(a: Any) = a.isInstanceOf[Coord]

    override def equals(that: Any): Boolean =
        that match {
            case that: Coord => {
                that.canEqual(this) &&
                this.x == that.x &&
                this.y == that.y
            }
            case _ => false
        }

    override def hashCode(): Int = x * 100000 + y
}