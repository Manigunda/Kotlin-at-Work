package com.manideep.gol.pattern

import com.manideep.gol.CellPosition

class BeeHivePattern : GamePattern {
    override var cellPositions = arrayOf(
        CellPosition(12, 12), CellPosition(12, 13),
        CellPosition(13, 11), CellPosition(13, 14),
        CellPosition(14, 12), CellPosition(14, 13),
        CellPosition(12, 25), CellPosition(12, 26),
        CellPosition(13, 24), CellPosition(13, 27),
        CellPosition(14, 25), CellPosition(14, 26),
        CellPosition(18, 12), CellPosition(18, 13),
        CellPosition(19, 11), CellPosition(19, 14),
        CellPosition(20, 12), CellPosition(20, 13),
        CellPosition(18, 25), CellPosition(18, 26),
        CellPosition(19, 24), CellPosition(19, 27),
        CellPosition(20, 25), CellPosition(20, 26),

    )
    override val patternName: String
        get() = "BeeHivePattern"

}