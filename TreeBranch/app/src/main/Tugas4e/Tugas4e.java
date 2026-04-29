class TreeNode {
    char data;
    TreeNode leftMostChild;
    TreeNode rightSibling;

    TreeNode(char data) {
        this.data = data;
    }
}

public class Tugas4e {

    public static void printLeaves(TreeNode node) {
        if (node == null) return;

        if (node.leftMostChild == null) {
            System.out.print(node.data + " ");
            return;
        }

        TreeNode child = node.leftMostChild;

        while (child != null) {
            printLeaves(child);
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

        printLeaves(root);
    }
}