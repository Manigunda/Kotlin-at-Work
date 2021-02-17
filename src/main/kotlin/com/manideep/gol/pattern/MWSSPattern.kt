package com.manideep.gol.pattern

import com.manideep.gol.CellPosition

class MWSSPattern : GamePattern {
    override var cellPositions = arrayOf(
        CellPosition(1, 4), CellPosition(1, 5),CellPosition(1, 6),CellPosition(1, 7),CellPosition(1, 4),CellPosition(1, 8),
        CellPosition(2, 3), CellPosition(2, 8),
        CellPosition(3, 8),
        CellPosition(4, 3),CellPosition(4, 7),
        CellPosition(5, 5)

        )
    override val patternName: String
        get() = "MWSSPattern"

}
