package Trees;

import java.util.Scanner;

public class BinaryTree {
    private Node root;
    public BinaryTree(){

    }
    private static class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
        }
    }
    public void populate(Scanner sc){
        System.out.println("Enter root node: ");
        int val = sc.nextInt();
        root = new Node(val);
        populate(sc,root);
    }
    private void populate(Scanner sc, Node node){
        System.out.println("Do you want to enter left of " + node.value);
        boolean left = sc.nextBoolean();
        if(left){
            System.out.print("Enter value of left ");
            int val = sc.nextInt();
            node.left = new Node(val);
            populate(sc,node.left);
        }
        System.out.println("Do you want to enter right of " + node.value);
        boolean right = sc.nextBoolean();
        if(right) {
            System.out.print("Enter value of right ");
            int val = sc.nextInt();
            node.right = new Node(val);
            populate(sc, node.right);
        }
    }
    public void display(){
        display(root, "");
    }
    private void display(Node node,String indent){
        if(node == null) return;
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }
    public void prettyDisplay(){
        prettyDisplay(root,0);
    }
    private void prettyDisplay(Node node, int level){
        if(node == null) return;
        prettyDisplay(node.right, level + 1);
        if(level != 0){
            for(int i=0;i<level-1;i++){
                System.out.print("|\t\t");
            }
            System.out.println("|----->" + node.value );
        }else{
            System.out.println(node.value);
        }
        prettyDisplay(node.left, level + 1);
    }

    //preorder traversal
    public void preorder(){
        preorder(root);
    }
    private void preorder(Node node){
        if(node == null) return;
        System.out.println(node.value);
        preorder(node.left);
        preorder(node.right);
    }

    //inorder traversal
    public void inorder(){
        inorder(root);
    }
    private void inorder(Node node){
        if(node == null) return;
        inorder(node.left);
        System.out.println(node.value);
        inorder(node.right);
    }

    //postorder traversal
    public void postorder(){
        postorder(root);
    }
    private void postorder(Node node){
        if(node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.value);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(sc);
        tree.prettyDisplay();
    }

}
