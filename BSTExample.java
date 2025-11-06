public class BSTExample {
    public static void main(String[] args) {
        BST tree = new BST();
        int[] sequence = {2, 4, 0, 4, 0, 5, 4};

        // Inserir todos os valores na árvore
        for (int value : sequence) {
            tree.insert(value);
        }

        System.out.println("Sequência de inserção: 2, 4, 0, 4, 0, 5, 4");
        System.out.println("Raiz: " + tree.root.value);

        System.out.print("Folhas: ");
        tree.printLeaves(tree.root);
        System.out.println();

        System.out.println("Altura: " + tree.height(tree.root));

        System.out.print("Em ordem: ");
        tree.inOrder(tree.root);
        System.out.println();
    }
}
