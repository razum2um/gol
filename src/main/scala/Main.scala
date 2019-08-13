package gol

object Main extends App {
  // 1 1 0 0
  // 1 0 0 0
  // 0 0 0 0
  // 0 0 0 0
  val cell1 = new Cell(new Coord(0, 0), CellState.Set)
  val cell2 = new Cell(new Coord(0, 1), CellState.Set)
  val cell3 = new Cell(new Coord(1, 0), CellState.Set)
  val game = new Game(4, Array(cell1, cell2, cell3))
  val candidates = game.candidates()

  val printCandidates = candidates.toSeq.sortBy(_._1).grouped(game.size).map(row => row.map(c => c.toString()).mkString(",")).mkString("\n")
  println(s"printCandidates = $printCandidates")

  val addCells = candidates.filter { case (c, i) => (i >= 2 && i <= 3) }
  println(s"addCells = $addCells")

  val removeCells = candidates.filter { case (c, i) => !(i >= 2 && i <= 3) }
  println(s"removeCells = $removeCells")
}