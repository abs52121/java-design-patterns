package party.lovey.composite;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TreeNode {
    private String name;
    private TreeNode parent;
    private List<TreeNode> children;

    public TreeNode(String name) {
        this.name=name;
        children=new ArrayList<>();
    }

    public boolean add(TreeNode node){
        return children.add(node);
    }
    public boolean remove(TreeNode node){
        return children.remove(node);
    }
}
