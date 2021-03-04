package com.manideep.gol.pattern

import com.manideep.gol.CellPosition

class BeaconPattern : GamePattern {
    override var cellPositions = arrayOf(
        CellPosition(6, 11), CellPosition(6, 12),
        CellPosition(7, 11),
                                    CellPosition(8, 14),
        CellPosition(9, 13), CellPosition(9, 14),
    )
    override val patternName: String
        get() = "BeaconPattern"

}