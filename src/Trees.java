// import java.util.LinkedList;
// import java.util.Queue;

// import javax.management.Query;
import java.util.*;

public class Trees{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // static class Binarytree {
    //     static int idx = -1;
    //     public static Node buildNode(int nodes[]){
    //           idx++;
    //           if(nodes[idx] == -1){
    //             return null;
    //           }
    //           Node newNode = new Node(nodes[idx]);
    //           newNode.left = buildNode(nodes);
    //           newNode.right = buildNode(nodes);
    //           return newNode;
    //     }
    // }
    //     public static void preOrder(Node root){
    //         if(root == null){
    //             // System.out.print("null");
    //             return;
    //         }
    //         System.out.print(root.data + " ");
    //         preOrder(root.left);
    //         preOrder(root.right);
    //     }

    //     public static void inOrder(Node root){
    //         if(root == null){
    //             return;
    //         }
    //         inOrder(root.left);
    //         System.out.print(root.data + " ");
    //         inOrder(root.right);
    //     }

    //     public static void postOrder(Node root){
    //         if(root == null){
    //             return;
    //         }
    //         inOrder(root.left);
    //         inOrder(root.right);
    //         System.out.print(root.data + " ");
    //     }
    //     public static void levelOrder(Node root){
    //         if(root == null){
    //             return;
    //         }
    //         Queue<Node> q = new LinkedList<>();
    //         q.add(root);
    //         q.add(null);
    //         while(!q.isEmpty()){
    //             Node curr = q.remove();
    //             if(curr == null){
    //                 System.out.println();
    //                 if(q.isEmpty()){
    //                     break;
    //                 }else{
    //                     q.add(null);
    //                 }
    //             }else{
    //                 System.out.print(curr.data +" ");
    //                 if(curr.left != null){
    //                     q.add(curr.left);
    //                 }
    //                 if(curr.right != null){
    //                     q.add(curr.right);
    //                 }
    //             }
    //         }
    //     }

    //     public static int height(Node root){
    //         if(root == null){
    //             return 0;
    //         }
    //         int leftH = height(root.left);
    //         int RightH = height(root.right);
    //         return Math.max(leftH, RightH) + 1;
    //     }
    
    //     public  static int count(Node root){
    //         if(root == null){
    //             return 0;
    //         }
    //         int leftcount = count(root.left);
    //         int rightcount = count(root.right);
    //         return leftcount +rightcount+1;
    //     }

    //     public static int sum_of_nodes(Node root){
    //         if(root == null){
    //             return 0;
    //         }
    //         int leftSum = sum_of_nodes(root.left);
    //         int rightSum = sum_of_nodes(root.right);
    //         return leftSum +rightSum + root.data;
    //     }
    //     public static int diameter(Node root){
    //         if(root == null){
    //             return 0;
    //         }
    //         int diam1 = height(root.left) + height(root.right) +1;
    //         int diam2 = diameter(root.left);
    //         int diam3 = diameter(root.right);
    //         return Math.max(diam1, Math.max(diam2, diam3));
    //     }

    //    static class TreeInfo{
    //         int ht;
    //         int diam;

    //         TreeInfo(int ht, int diam){
    //             this.ht = ht;
    //             this.diam = diam;
    //         }
    //     }

    //     public static TreeInfo diameter1(Node root){
    //         if(root == null){
    //             return new TreeInfo(0, 0);
    //         }
    //         TreeInfo left = diameter1(root.left);
    //         TreeInfo right = diameter1(root.right);
    //         int myH = Math.max(left.ht, right.ht) + 1 ;
    //         int diam1 = left.ht + right.ht + 1;
    //         int diam2 = left.diam;
    //         int diam3 = right.diam;
    //         int myD = Math.max(diam1, Math.max(diam2,diam3));
    //         TreeInfo myInfo = new TreeInfo(myH, myD);
    //         return myInfo;
    //     }

    //     public boolean isIdentical(Node root, Node subtree){
    //         if(subtree == null && root == null){
    //             return true;
    //         }
    //         if(root == null || subtree == null){
    //             return false;
    //         }
    //          if(root.data == subtree.data){
    //             return isIdentical(root.left, subtree.left) && isIdentical(root.right, subtree.right);
    //          }
    //          return false;
    //     }

    //     public boolean isSubtree(Node root, Node subtree){
    //         if(subtree == null){
    //               return true;
    //         }
    //         if(root ==  null){
    //             return false;
    //         }
    //         if(isIdentical(root, subtree)){
    //             return true;
    //         }
    //         return isSubtree(root.left, subtree) || isSubtree(root.right, subtree);
    //     }

    // public static void main(String args[]) {
    //     int nodes[] = {9,2,4,-1,-1,5, 3,-1,6,-1,-1,5,6, -1, -1,8,-1,7};
    //     Binarytree tree = new Binarytree();
    //     Node root = tree.buildNode(nodes);
    //     int height = diameter(root);
    //     System.out.println(height);
    //     System.out.println(diameter1(root).diam);
    // }

// ------------------------------/---- BINARY SEARCH TREE ----/-----------------------------------------//
//             7
//         4   |  10              left side should be small compare to root and right side should be bigger comapare to root.
//       3   5 | 8   12


    public static Node insert(Node root, int val){
         if(root == null){
            root = new Node(val);
            return root;
         }
         // left subtree
         if(root.data > val){
            root.left = insert(root.left, val);
         }
         // right subtree
         if(root.data < val){
            root.right = insert(root.right, val);
         }
         return root;
    }

    public static void inOrder(Node root){
        if(root == null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data +" ");
        inOrder(root.right);
    }

    public static boolean search(Node root, int val){
        if(root == null){
            return false;
        }
        if(root.data == val){
            return true;
        }
        else if(root.data < val){ 
          return search(root.right, val);
        }
        else{
            return search(root.left, val);
        }
    }

    public static Node delete(Node root, int val){
        if(root == null){
            return root;
        }

        if(root.data > val){
            root.left = delete(root.left, val);
        }

        else if(root.data < val){
            root.right = delete(root.right, val);
        }

        else{
            //case 1--
            if(root.left == null && root.right == null){
                return null;
            }
            // case 2--
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            Node a =  inorderElement(root.right);
            root.data = a.data;
            root.right = delete(root.right, a.data);
         }
         return root;
    }

    public static Node inorderElement(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
//------------------------------------------------------------------------
    public static void printSpecific(Node root, int x, int y){
        if(root == null){
            return;
            // System.out.println("null");
        }
        if( root.data >= x && root.data <=y){
            printSpecific(root.left, x, y);
            System.out.print(root.data  + " ");
            printSpecific(root.right, x, y);
        }

        else if( root.data >=y ){
            printSpecific(root.left, x, y);
        }

        else {
            printSpecific(root.right, x, y);
        }
    }
//---------------------------------------------------------

        public static void printPath(ArrayList<Integer> path){
            for(int i=0; i<path.size(); i++){
                System.out.print(path.get(i) + " ");
            }
            System.out.println();
        }
        public static void printRootToLeaf(Node root, ArrayList<Integer> path){
            if(root == null){
                return;
            }
            path.add(root.data);
            if(root.left == null && root.right == null){
                printPath(path);
            }
            else{
                printRootToLeaf(root.left, path);
                printRootToLeaf(root.right, path);   
            }
            path.remove(path.size()-1);
        }

    public static void main(String args[]){
        int values[] = {5,3,4,1,7,2,8,10,13,55};
        Node root = null;
        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }
        inOrder(root);
        // boolean ans = search(root, 9);
        // System.out.println(ans);
        System.out.println();
        // printSpecific(root, 1,3);
        printRootToLeaf(root, new ArrayList<>());
        // inOrder(root);
    }
}