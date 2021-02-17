package com.manideep.gol.pattern

import com.manideep.gol.CellPosition

class LoafPattern : GamePattern {
    override var cellPositions = arrayOf(
        CellPosition(12, 12), CellPosition(12, 13),
        CellPosition(13, 11), CellPosition(13, 14),
        CellPosition(14, 12), CellPosition(14, 14),
        CellPosition(15, 13)
    )
    override val patternName: String
        get() = "LoafPattern"

}
