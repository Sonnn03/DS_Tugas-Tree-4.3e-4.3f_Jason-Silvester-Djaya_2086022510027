class TreeNode {
    char data;
    TreeNode leftMostChild;
    TreeNode rightSibling;

    TreeNode(char data) {
        this.data = data;
    }
}

public class Tugas4f1 {

    public static void printAtDepth(TreeNode node, int n, int depth) {
        if (node == null) return;

        // Jika berada di depth n, cetak lalu berhenti turun
        if (depth == n) {
            System.out.print(node.data + " ");
            return;
        }

        // Kunjungi anak-anak
        TreeNode child = node.leftMostChild;

        while (child != null) {
            printAtDepth(child, n, depth + 1);
            child = child.rightSibling;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode('a');

        root.leftMostChild = new TreeNode('b');
        root.leftMostChild.rightSibling = new TreeNode('c');
        root.leftMostChild.rightSibling.rightSibling = new TreeNode('d');

        root.leftMostChild.leftMostChild = new TreeNode('e');
        root.leftMostChild.leftMostChild.rightSibling = new TreeNode('f');

        root.leftMostChild.rightSibling.leftMostChild = new TreeNode('g');
        root.leftMostChild.rightSibling.leftMostChild.rightSibling = new TreeNode('h');

        root.leftMostChild.rightSibling.rightSibling.leftMostChild = new TreeNode('i');
        root.leftMostChild.rightSibling.rightSibling.leftMostChild.rightSibling = new TreeNode('j');
        root.leftMostChild.rightSibling.rightSibling.leftMostChild.rightSibling.rightSibling = new TreeNode('k');

        root.leftMostChild.leftMostChild.leftMostChild = new TreeNode('l');
        root.leftMostChild.leftMostChild.leftMostChild.rightSibling = new TreeNode('m');
        root.leftMostChild.leftMostChild.leftMostChild.rightSibling.rightSibling = new TreeNode('n');

        int n = 2; // depth yang ingin dicetak

        printAtDepth(root, n, 0);
    }
}