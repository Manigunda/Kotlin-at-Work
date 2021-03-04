package com.manideep.gol

import java.awt.Color
import java.awt.GridLayout
import javax.swing.BorderFactory
import javax.swing.JFrame
import javax.swing.JLabel

class GameGrid(cellPixelSize: Int, private val rowCount: Int, private val colCount: Int, val patternName: String) : JFrame("Manideeps GOL") {
    private val rowLastIndex: Int = rowCount - 1
    private val colLastIndex = colCount - 1
    private var cellLabels = (0..rowLastIndex).map {
        (0..colLastIndex).map { JLabel() }
    }

    init {
        title=title+"   :  "+patternName
        setInitialStateOfGrid()
        setSize(cellPixelSize * rowCount, cellPixelSize * colCount)
        setVisible(true)
        setDefaultLookAndFeelDecorated(true)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
    }

    private fun setInitialStateOfGrid() {
        setLayout(GridLayout(rowCount, colCount))

        val contentPane = getContentPane()
        contentPane.setBackground(Color.DARK_GRAY)

        (0..rowLastIndex).map { i ->
            (0..colLastIndex).map { j ->
                val cell = cellLabels[i][j]
                cell.setBackground(Color.BLACK)
                cell.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1))
                cell.setOpaque(true)
                contentPane.add(cell)
            }
        }

    }


    fun refreshGridCellsStatus(cells: List<List<Cell>>) {

        (0..rowLastIndex).map { i ->
            (0..colLastIndex).map { j ->
                if (cells[i][j].isAlive) {
                    cellLabels[i][j].setBackground(Color.WHITE)
                } else {
                    cellLabels[i][j].setBackground(Color.BLACK)
                }
            }
        }

    }
}
