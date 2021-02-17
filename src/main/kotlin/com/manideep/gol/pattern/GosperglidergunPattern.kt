package com.manideep.gol.pattern

import com.manideep.gol.CellPosition

class GosperglidergunPattern: GamePattern {
    override var cellPositions = arrayOf(
        CellPosition(1, 26),
        CellPosition(2, 24),CellPosition(2, 26),
        CellPosition(3, 14),CellPosition(3, 15),CellPosition(3, 22),CellPosition(3, 23),CellPosition(3, 36),CellPosition(3, 37),
        CellPosition(4, 13),CellPosition(4, 17),CellPosition(4, 22),CellPosition(4, 23),CellPosition(4, 36),CellPosition(4, 37),
        CellPosition(5, 2),CellPosition(5, 3),CellPosition(5, 12),CellPosition(5, 18),CellPosition(5, 22),CellPosition(5, 23),
        CellPosition(6, 2),CellPosition(6, 3),CellPosition(6, 12),CellPosition(6, 16),CellPosition(6, 18),CellPosition(6, 19),CellPosition(6, 24),CellPosition(6, 26),
        CellPosition(7, 12),CellPosition(7, 18),CellPosition(7, 26),
        CellPosition(8, 13),CellPosition(8, 17),
        CellPosition(9, 14),CellPosition(9, 15)
    )
    override val patternName: String
        get() = "GosperglidergunPattern"

}
