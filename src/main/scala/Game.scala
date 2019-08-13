package gol
import scala.collection.mutable.HashMap

class Game(var size: Int, var cells: Array[Cell]) {
    def candidates(): HashMap[Coord, Int] = {
        val result = HashMap.empty[Coord, Int]
        cells.foreach { c => { 
            c.neighbours(size).foreach { n => {
                result(n) = result.getOrElse(n, 0) + 1
            } }
        } }
        result
    }

    override def toString: String = cells.grouped(size).map(row => row.map(c => c.toString()).mkString(",")).mkString("\n")
}