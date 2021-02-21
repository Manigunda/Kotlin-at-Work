package com.manideep.gol

fun main() {
    //println("Enter Grid Count, rows and columns separately")
    //println("Enter Game Screen required Row Count")
    val rowCount =30//scanner.nextInt()
    //println("Enter Game Screen required Column Count")
    val colCount =40//scanner.nextInt()

    // Prepare Game Grid

    val gamePattern = getUserChoiceGamePattern()
    val cellPixelSize = 20
    val gameGrid = GameGrid(cellPixelSize, rowCount, colCount,gamePattern.patternName)

    //Prepare Initial State of Grid based on User Input
    val gameProcessor = GameProcessor(rowCount,colCount)
    makeInitialPatternCellsAlive(gameProcessor,gamePattern.cellPositions)


    gameGrid.refreshGridCellsStatus(gameProcessor.gameCells)
    runGameInLoop(gameGrid,gameProcessor)
}

fun makeInitialPatternCellsAlive(gameProcessor: GameProcessor, cellPositions: Array<CellPosition>) {
    for (cellPosition in cellPositions) {
        gameProcessor.gameCells[cellPosition.x][cellPosition.y].isAlive = true
    }
}




