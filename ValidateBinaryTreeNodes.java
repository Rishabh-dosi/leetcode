import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ValidateBinaryTreeNodes {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        HashMap<Integer,Integer> parentOfNode = new HashMap<>();
        HashMap<Integer,List<Integer>> childOfNode = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int node = i;
            int leftC = leftChild[i];
            int rightC = rightChild[i];

            if (leftC != -1) {
                childOfNode.computeIfAbsent(node, k -> new ArrayList<>()).add(leftC);
                if (parentOfNode.containsKey(leftC)) {
                    return false;
                } else {
                    parentOfNode.put(leftC, node);
                }
            }
            if (rightC != -1) {
                childOfNode.computeIfAbsent(node, k -> new ArrayList<>()).add(rightC);
                if (parentOfNode.containsKey(rightC))
                    return false;
                else
                    parentOfNode.put(rightC, node);

            }
        }
        int root = -1;
        for (int i = 0; i < n; i++) {
            if (!parentOfNode.containsKey(i)) {
                if (root != -1) {
                    return false;
                } else {
                    root = i;
                }
            }
        }
        if (root == -1)
            return false;
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        int count = 1;
        queue.add(root);
        while (queue.isEmpty() == false) {
            int node = queue.poll();
            for (int child : childOfNode.getOrDefault(node, Collections.emptyList())) {
                if (!visited[child]) {
                    visited[child] = true;
                    count++;
                    queue.add(child);
                }
            }
        }
        


        return count == n;

    }
}
