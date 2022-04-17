package h07;

import java.util.HashMap;

public class ArcPointerAdjacencyMatrix<L, D> implements ArcPointer<L, D> {
	private final AdjacencyMatrix<L> adjacencyMatrix;
    private final HashMap<Integer, NodePointerAdjacencyMatrix<L, D>> existingNodePointers;
    private final HashMap<Pair<Integer, Integer>, ArcPointerAdjacencyMatrix<L, D>> existingArcPointers;
    private final int row;
    private final int column;

    /**
     * Erzeugt einen Pointer auf eine Kante eines Graphen, gegeben durch eine Adjazenzmatrix.
     * @param existingNodePointers Die bereits bestehenden NodePointer.
     * @param existingArcPointers Die bereits bestehenden ArcPointer.
     * @param adjacencyMatrix Die Adjazenzmatrix, die den Graphen bildet.
     * @param row Die Zeile der Matrix (Quelle der Kante).
     * @param column Die Spalte der Matrix (Ziel der Kante).
     */
	public ArcPointerAdjacencyMatrix(HashMap<Integer, NodePointerAdjacencyMatrix<L, D>> existingNodePointers,
                                     HashMap<Pair<Integer, Integer>, ArcPointerAdjacencyMatrix<L, D>> existingArcPointers,
                                     AdjacencyMatrix<L> adjacencyMatrix, int row, int column) {
        // TODO
        throw new RuntimeException("Not implemented");
	}

	@Override
	public L getLength() {
        // TODO
        throw new RuntimeException("Not implemented");
	}

	@Override
	public NodePointer<L, D> destination() {
        // TODO
        throw new RuntimeException("Not implemented");
	}
}
