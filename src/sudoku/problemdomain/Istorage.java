package sudoku.problemdomain;

import java.io.IOException;

public interface Istorage {
    void updateGameData(SudokuGame game) throws IOException;
    SudokuGame getGameData() throws IOException;
}
