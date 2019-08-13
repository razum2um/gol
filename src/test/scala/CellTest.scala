package gol

import org.scalatest.FunSpec

class CellTest extends FunSpec {

  describe("Cell") {
    describe("when in center") {
      it("find neighbours") {
        val cell = new Cell(new Coord(1, 1), CellState.Set)
        assert(cell.neighbours(3)(0) == new Coord(0, 0))
        assert(cell.neighbours(3)(7) == new Coord(2, 2))
      }
    }

    describe("when in left-top") {
      it("find neighbours") {
        val cell = new Cell(new Coord(0, 0), CellState.Set)
        assert(cell.neighbours(3)(0) == new Coord(2, 2))
        assert(cell.neighbours(3)(7) == new Coord(1, 1))
      }
    }

    describe("when in right-bottom") {
      it("find neighbours") {
        val cell = new Cell(new Coord(2, 2), CellState.Set)
        assert(cell.neighbours(3)(0) == new Coord(1, 1))
        assert(cell.neighbours(3)(7) == new Coord(0, 0))
      }
    }
  }
}