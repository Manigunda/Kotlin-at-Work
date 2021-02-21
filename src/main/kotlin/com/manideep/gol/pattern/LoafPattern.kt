package com.manideep.gol.pattern

import com.manideep.gol.CellPosition

class LoafPattern : GamePattern {
    override var cellPositions = arrayOf(
        CellPosition(6, 12), CellPosition(6, 13),
        CellPosition(7, 11), CellPosition(7, 14),
        CellPosition(8, 12), CellPosition(8, 14),
        CellPosition(9, 13),
        CellPosition(12, 12), CellPosition(12, 13),
        CellPosition(13, 11), CellPosition(13, 14),
        CellPosition(14, 12), CellPosition(14, 14),
        CellPosition(15, 13),
        CellPosition(18, 12), CellPosition(18, 13),
        CellPosition(19, 11), CellPosition(19, 14),
        CellPosition(20, 12), CellPosition(20, 14),
        CellPosition(21, 13),
        CellPosition(15, 19), CellPosition(15, 20),
        CellPosition(16, 18), CellPosition(16, 21),
        CellPosition(17, 19), CellPosition(17, 21),
        CellPosition(18, 20)

    )
    override val patternName: String
        get() = "LoafPattern"

}
