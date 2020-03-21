package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void position() {
        Cell cell = Cell.findBy(0, 0);
        BishopBlack bishop = new BishopBlack(cell);
        Cell result = bishop.position();
        Cell expected = cell;
        assertThat(result, is(expected));
    }

    @Test
    public void copy() {
        Cell cell = Cell.findBy(0, 2);
        BishopBlack bishop = new BishopBlack(cell);
        Figure result = bishop.copy(cell);
        Figure expected = bishop;
        assertThat(result, is(expected));
    }

    @Test
    public void way() {
        Cell start = Cell.C1;
        Cell finish = Cell.G5;
        Figure bishop = new BishopBlack(start);
        Cell[] result = bishop.way(start, finish);
        Cell[] expected = new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5};
    }
}