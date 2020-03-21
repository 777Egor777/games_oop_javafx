package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.PawnBlack;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class LogicTest {

    @Test
    public void CanNotMove() {
        Logic logic = new Logic();
        logic.add(new PawnBlack(Cell.E7));
        logic.add(new BishopBlack(Cell.F8));
        boolean result = logic.move(Cell.F8, Cell.D6);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void CanMove() {
        Logic logic = new Logic();
        logic.add(new PawnBlack(Cell.E6));
        logic.add(new BishopBlack(Cell.F8));
        boolean result = logic.move(Cell.F8, Cell.D6);
        boolean expected = true;
        assertThat(result, is(expected));
    }
}