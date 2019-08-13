package gol

object Main extends App {
  val coord = new Coord(0, 0)
  val cell = new Cell(coord, CellState.Set)
  cell.neighbours(3).map(n => println(s"neighbour = $n"))
  println(s"cell = $cell")
}