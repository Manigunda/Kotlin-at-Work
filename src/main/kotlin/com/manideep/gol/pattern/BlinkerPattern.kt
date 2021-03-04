package com.manideep.gol.pattern

import com.manideep.gol.CellPosition

class BlinkerPattern : GamePattern {
    override var cellPositions = arrayOf(
        CellPosition(6, 12), CellPosition(6, 13), CellPosition(6, 14),
        CellPosition(9, 20), CellPosition(9, 21), CellPosition(9, 22),
        CellPosition(13, 12), CellPosition(13, 13), CellPosition(13, 14)

    )
    override val patternName: String
        get() = "BlinkerPattern"
}
