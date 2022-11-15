// binary tree

import java.util.ArrayList;

public class Practical019 {
  public static void main(String[] args) {

    Node n1 = new Node(1);

    Node n2 = new Node(2);
    Node n3 = new Node(3);

    Node n4 = new Node(4);
    Node n5 = new Node(5);
    Node n6 = new Node(6);

    Node n7 = new Node(7);
    Node n9 = new Node(9);
    Node n11 = new Node(11);
    Node n20 = new Node(20);

    n1.add(n2);
    n1.add(n3);

    n2.add(n4);
    n4.add(n7);
    n4.add(n9);

    n3.add(n5);
    n3.add(n6);
    n6.add(n11);
    n6.add(n20);

    // NLR
    // 1 2 4 7 9 3 5 6 11 20
    preOrder(n1);
  }

  static void preOrder(Node root) {
    if (root != null) {
      System.out.print(root.value + " ");
      for (Node c : root.nodes) {
        preOrder(c);
      }
    }
  }
}

class Node {
  int value;

  public Node(int value) {
    this.value = value;
  }

  ArrayList<Node> nodes = new ArrayList<>();

  public void add(Node node) {
    nodes.add(node);
  }
}