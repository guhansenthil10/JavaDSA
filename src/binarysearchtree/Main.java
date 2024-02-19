package binarysearchtree;

public class Main {
    public static void main(String[]args){
        BinarySearchTree bst = new BinarySearchTree();
        //System.out.println(bst.root);
        for(int i=1;i<10;i++)
        System.out.println(bst.insert(i));
        //System.out.println(bst.root.left.right.left.value);
        System.out.println(bst.contains(37));

        System.out.println();
        bst.preOrder(bst.root);
        System.out.println();
        bst.inOrder(bst.root);

    }
}
