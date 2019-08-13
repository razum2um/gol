package gol
import CellState._

class Cell(var coord: Coord, var state: CellState) {
    def boundedMove(moveX: Int, moveY: Int, size: Int): Coord = {
        val newX = (coord.x + moveX) % size
        val newY = (coord.y + moveY) % size
        new Coord(if (newX >= 0) newX else (size + newX), if (newY >= 0) newY else (size + newY));
    } 

    def neighbours(size: Int): Array[Coord] = {
        Array(
            boundedMove(-1, -1, size),
            boundedMove(-1, 0, size),
            boundedMove(-1, 1, size),
            boundedMove(0, -1, size),
            boundedMove(0, 1, size),
            boundedMove(1, -1, size),
            boundedMove(1, 0, size),
            boundedMove(1, 1, size)
        )
    }

    override def toString: String = s"($coord is $state)"
}