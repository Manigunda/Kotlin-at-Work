package com.manideep.gol.pattern

import com.manideep.gol.CellPosition

class BeaconPattern : GamePattern {
    override var cellPositions = arrayOf(
        CellPosition(11, 11), CellPosition(11, 12),
        CellPosition(12, 11),
                                    CellPosition(13, 14),
        CellPosition(14, 13), CellPosition(14, 14),
    )
    override val patternName: String
        get() = "BeaconPattern"

}