package org.fate7;

public class ParcourirArbre {

    //solution itérative
    public int findMax(Node root) {
        if(root == null)
            return 0;
        else
            return Math.max(
                    root.getValue(),
                    Math.max(
                            findMax(root.getLeftChild()),
                            findMax(root.getRightChild()
                            )
                    )
            );

    }

    public static void main(String[] args) {
        Node node = new Node(15,
                new Node(-12, new Node(3), new Node(19)),
                new Node(11, new Node(-8), new Node(7,
                        new Node(11),
                        new Node(3, new Node(-2), new Node())))
        );
        ParcourirArbre parcourirArbre = new ParcourirArbre();
        int ans = parcourirArbre.findMax(node);
        System.out.println("ans = " + ans);
    }

}
