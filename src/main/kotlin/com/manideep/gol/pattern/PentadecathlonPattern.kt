package com.manideep.gol.pattern

import com.manideep.gol.CellPosition

class PentadecathlonPattern: GamePattern {
    override var cellPositions = arrayOf(
        CellPosition(5, 6),
        CellPosition(6, 5),CellPosition(6, 6),CellPosition(6, 7),
        CellPosition(7, 4), CellPosition(7, 5),CellPosition(7, 7),CellPosition(7, 8),
        CellPosition(8, 3),CellPosition(8, 4),CellPosition(8, 5),CellPosition(8, 7),CellPosition(8, 8),CellPosition(8, 9),
        CellPosition(9, 3),CellPosition(9, 4),CellPosition(9, 5),CellPosition(9, 7),CellPosition(9, 8),CellPosition(9, 9),
        CellPosition(10, 3),CellPosition(10, 4),CellPosition(10, 5),CellPosition(10, 7),CellPosition(10, 8),CellPosition(10, 9),
        CellPosition(11, 3),CellPosition(11, 4),CellPosition(11, 5),CellPosition(11, 7),CellPosition(11, 8),CellPosition(11, 9),
        CellPosition(12, 4),CellPosition(12, 5),CellPosition(12, 7),CellPosition(12, 8),
        CellPosition(13, 5),CellPosition(13, 6),CellPosition(13, 7),
        CellPosition(14, 6)

    )
    override val patternName: String
        get() = "PentadecathlonPattern"
}