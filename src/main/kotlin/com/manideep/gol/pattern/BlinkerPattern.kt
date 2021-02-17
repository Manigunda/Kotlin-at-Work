package com.manideep.gol.pattern

import com.manideep.gol.CellPosition

class BlinkerPattern : GamePattern {
    override var cellPositions = arrayOf(
        CellPosition(13, 12), CellPosition(13, 13), CellPosition(13, 14)
    )
    override val patternName: String
        get() = "BlinkerPattern"
}
