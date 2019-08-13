package gol

class Coord(var x: Int, var y: Int) {
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
}