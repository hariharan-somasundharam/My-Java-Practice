import java.util.*;

// Define Node class for the binary tree structure
class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Merge_Two_BST {
    
    // Method to merge two BSTs into a sorted list
    public List<Integer> merge(Node root1, Node root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        
        inOrderTraversal(root1, list1);
        inOrderTraversal(root2, list2);
        
        return mergeSortedLists(list1, list2);
    }
    
    // Inorder traversal of BST
    private void inOrderTraversal(Node root, List<Integer> result) {
        if (root == null) return;
        inOrderTraversal(root.left, result);
        result.add(root.data);
        inOrderTraversal(root.right, result);
    }
    
    // Merge two sorted lists
    private List<Integer> mergeSortedLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                mergedList.add(list1.get(i++));
            } else {
                mergedList.add(list2.get(j++));
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i++));
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j++));
        }

        return mergedList;
    }

    // Method to insert a value into a BST
    public Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Merge_Two_BST solution = new Merge_Two_BST();

        // Input BST 1
        System.out.print("Enter number of nodes for BST 1: ");
        int n1 = scanner.nextInt();
        Node root1 = null;
        System.out.println("Enter the values for BST 1:");
        for (int i = 0; i < n1; i++) {
            root1 = solution.insert(root1, scanner.nextInt());
        }

        // Input BST 2
        System.out.print("Enter number of nodes for BST 2: ");
        int n2 = scanner.nextInt();
        Node root2 = null;
        System.out.println("Enter the values for BST 2:");
        for (int i = 0; i < n2; i++) {
            root2 = solution.insert(root2, scanner.nextInt());
        }

        // Merge the two BSTs and print the result
        List<Integer> mergedList = solution.merge(root1, root2);
        System.out.println("Merged list: " + mergedList);

        scanner.close();
    }
}
