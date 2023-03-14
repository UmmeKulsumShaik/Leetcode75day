# Leetcode75day
class Solution {
    public void traversal(Node root, List<Integer>ans) {
        if (root == null)
            return;
        ans.add(root.val);
        for (Node child: root.children) 
            traversal(child, ans);
}
    public List<Integer> preorder(Node root) {
        List<Integer> ans = new ArrayList<Integer>();
        traversal(root, ans);
        return ans;
    }
}
