package student_sergey_egorichev.lesson_12.level_3.task_12;

class GameOfLifeNextGenerationCalculator {

    public boolean[][] calculate(boolean[][] currentGeneration) {
        boolean[][] nextGeneration = new boolean[currentGeneration.length][currentGeneration[0].length];

//        Правило 1:
//        Любая живая клетка с меньше чем двумя живыми соседями умирает в следующем поколении.
        for (int y = 0; y < currentGeneration.length; y++) {
            for (int x = 0; x < currentGeneration[y].length; x++) {
                if (currentGeneration[y][x] &&
                        GameOfLifeNextGenerationCalculator.countLiveNeighbours(currentGeneration, x, y) < 2) {
                    nextGeneration[y][x] = false;
                } else {
                    nextGeneration[y][x] = currentGeneration[y][x];
                }
            }
        }

        return nextGeneration;
    }

    static int countLiveNeighbours(boolean[][] currentGeneration, int x, int y ) {
        int neighbours = 0;

        if (y - 1 >= 0 && currentGeneration[y-1][x]) {
            neighbours++;
        }
        if (x - 1 >= 0 && currentGeneration[y][x-1]) {
            neighbours++;
        }
        if (y + 1 < currentGeneration.length && currentGeneration[y+1][x]) {
            neighbours++;
        }
        if (x + 1 < currentGeneration[y].length && currentGeneration[y][x+1]) {
            neighbours++;
        }

        return neighbours;
    }

}
