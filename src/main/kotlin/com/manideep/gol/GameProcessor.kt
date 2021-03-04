package com.manideep.gol

import com.manideep.gol.rules.canCellSurviveOrPopulate

class GameProcessor(private val rowCount: Int, colCount: Int) {
    private val rowLastIndex = rowCount - 1
    private val colLastIndex = colCount - 1
    var gameCells = (0..rowLastIndex).map {
        (0..colLastIndex).map { Cell() }
    }


    fun getNextStepGridCells(): List<List<Cell>> {
        gameCells = (0..rowLastIndex).map { i ->
            (0..colLastIndex).map { j ->
                val newCellStatus = nextCellStatus(CellPosition(i, j))
                Cell(newCellStatus)
            }
        }
        return gameCells
    }

    private fun nextCellStatus(cellPos: CellPosition): Boolean {
        val cell = gameCells[cellPos.x][cellPos.y]
        val neighboursAlive = countNeighborsAlive(cellPos)
        return CanCellSurviveOrPopulate(cell.isAlive, neighboursAlive)
    }


    private fun countNeighborsAlive(curCellPosition: CellPosition): Int {
        val i = curCellPosition.x
        val j = curCellPosition.y
        return arrayOf(
            CellPosition(i - 1, j - 1), CellPosition(i - 1, j), CellPosition(i - 1, j + 1),
            CellPosition(i, j - 1), CellPosition(i, j + 1),
            CellPosition(i + 1, j - 1), CellPosition(i + 1, j), CellPosition(i + 1, j + 1)
        ).filter { neighborCP -> isValidCellPosition(neighborCP) && gameCells[neighborCP.x][neighborCP.y].isAlive }
            .count()
    }

    private fun isValidCellPosition(cellPosition: CellPosition): Boolean {
        return (cellPosition.x in 0..rowLastIndex) && (cellPosition.y in 0..colLastIndex)
    }

}
