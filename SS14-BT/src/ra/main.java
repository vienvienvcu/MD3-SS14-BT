package ra;

import model.QuadraticSolver;

public class main {
    public static void main(String[] args) {
        QuadraticSolver solver = new QuadraticSolver(1, -3, 2);
        solver.solve(); // Prints: Roots are: 2.0 and 1.0
    }
}
