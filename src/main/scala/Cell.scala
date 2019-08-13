package gol
import CellState._

class Cell(var coord: Coord, var state: CellState) {
    def boundedMove(moveX: Int, moveY: Int, size: Int): Coord = {
        val newX = (coord.x + moveX) % size
        val newY = (coord.y + moveY) % size
        new Coord(if (newX >= 0) newX else (size + newX), if (newY >= 0) newY else (size + newY));
    } 

    def neighbours(size: Int): Array[Coord] = {
        var result = new Array[Coord](8)
        result(0) = boundedMove(-1, -1, size)
        result(1) = boundedMove(-1, 0, size)
        result(2) = boundedMove(-1, 1, size)
        result(3) = boundedMove(0, -1, size)
        result(4) = boundedMove(0, 1, size)
        result(5) = boundedMove(1, -1, size)
        result(6) = boundedMove(1, 0, size)
        result(7) = boundedMove(1, 1, size)
        result
    }

    override def toString: String = s"($coord is $state)"
}