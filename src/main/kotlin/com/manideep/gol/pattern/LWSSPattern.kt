package com.manideep.gol.pattern

import com.manideep.gol.CellPosition

class LWSSPattern : GamePattern {
    override var cellPositions = arrayOf(
        CellPosition(2, 2), CellPosition(2, 5),
        CellPosition(3, 6),
        CellPosition(4, 2), CellPosition(4, 6),
        CellPosition(5, 3),CellPosition(5, 4),CellPosition(5, 5),CellPosition(5, 6),
    )
    override val patternName: String
        get() = "LWSSPattern"

}
