package com.manideep.gol

fun RunGameInLoop(gameGrid: GameGrid, gameProcessor: GameProcessor) {
    // Sleep before making first move
    Thread.sleep( 10 * 1000);
    while(true) {
        Thread(Runnable {
            run {
                Thread.sleep(1 * 1000)
                gameGrid.refreshGridCellsStatus(gameProcessor.getNextStepGridCells())
            }
        }).run()
    }
    // Sleep before making last move , just to hold the screen for a pause
    // to have a glance
    Thread.sleep( 2 * 1000);
}
