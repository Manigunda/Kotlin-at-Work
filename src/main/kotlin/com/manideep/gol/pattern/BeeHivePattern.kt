package com.manideep.gol.pattern

import com.manideep.gol.CellPosition

class BeeHivePattern : GamePattern {
    override var cellPositions = arrayOf(
        CellPosition(6, 12),  CellPosition(6, 13),
        CellPosition(7, 11),  CellPosition(7, 14),
        CellPosition(8, 12),  CellPosition(8, 13),
        CellPosition(6, 25),  CellPosition(6, 26),
        CellPosition(7, 24),  CellPosition(7, 27),
        CellPosition(8, 25),  CellPosition(8, 26),



    )
    override val patternName: String
        get() = "BeeHivePattern"

}