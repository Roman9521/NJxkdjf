package leetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task_102_Binary_Tree_Level_Order_Traversal {
    public static void main(String[] args) {

    }
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        Queue<TreeNode> queue = new LinkedList<>();
//        List<List<Integer>> wrapList = new LinkedList<>();
//        if(root==null)
//            return wrapList;
//        queue.offer(root);
//        while(!queue.isEmpty()){
//            int size = queue.size();
//            List<Integer> subList = new LinkedList<>();
//            for(int i=0;i<size;i++){
//                if(queue.peek().left!=null)  queue.offer(queue.peek().left);
//                if(queue.peek().right!=null) queue.offer(queue.peek().right);
//                subList.add(queue.poll().val);
//            }
//            wrapList.add(subList);
//        }
//        return wrapList;
//    }
}
