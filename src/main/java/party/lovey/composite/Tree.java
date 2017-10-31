package party.lovey.composite;

import lombok.Data;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@Data
public class Tree {
    private TreeNode root;

    public Tree(String name) {
        root = new TreeNode(name);
    }

    public static void main(String[] args) {
        Tree tree = new Tree("课程表");
        tree.getRoot().add(new TreeNode("语文"));
        tree.getRoot().add(new TreeNode("数学"));
        tree.getRoot().add(new TreeNode("音乐"));
        tree.getRoot().remove(new TreeNode("英语"));
        System.out.println(tree);

        try {
            FileInputStream fin = new FileInputStream("dddd");
            BufferedInputStream bin=new BufferedInputStream(fin);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
