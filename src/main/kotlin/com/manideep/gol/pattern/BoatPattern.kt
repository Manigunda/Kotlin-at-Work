package com.manideep.gol.pattern

import com.manideep.gol.CellPosition

class BoatPattern : GamePattern {
    override var cellPositions = arrayOf(
        CellPosition(12, 11),CellPosition(12, 12),
        CellPosition(13, 11), CellPosition(13, 13),
        CellPosition(14, 12),
        CellPosition(18, 11), CellPosition(18, 12),
        CellPosition(19, 11), CellPosition(19, 13),
        CellPosition(20, 12),
        CellPosition(6, 11), CellPosition(6, 12),
        CellPosition(7, 11), CellPosition(7, 13),
        CellPosition(8, 12),
        CellPosition(6, 20), CellPosition(6, 21),
        CellPosition(7, 20), CellPosition(7, 22),
        CellPosition(8, 21),

    )
    override val patternName: String
        get() = "BoatPattern"
}
