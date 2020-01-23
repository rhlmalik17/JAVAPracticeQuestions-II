import java.util.Queue;
import java.util.LinkedList;
public class LevelOrderTraversal
{
    TreeNode head;
    class TreeNode{
        int data;
        TreeNode leftNode;
        TreeNode rightNode;
        public TreeNode(int data)
        {
            this.data=data;
            leftNode=null;
            rightNode=null;
        }
    }
    public void printEachLevel()
    {
        Queue<TreeNode> que = new LinkedList<TreeNode>(); 
        que.add(head);
        que.add(null);
        while(!que.isEmpty())
        {
            TreeNode temp = que.poll();
            if(temp==null)
            {
                System.out.print("$ ");
                if(que.isEmpty())
                {
                    break;
                }
                que.add(null);
            }
            else
            {
                System.out.print(temp.data+" ");
                if(temp.leftNode!=null)
                {
                    que.add(temp.leftNode);
                }
                if(temp.rightNode!=null)
                que.add(temp.rightNode);
            }
        }
    }
    public void createTree()
    {
        head=new TreeNode(10);
        head.leftNode=new TreeNode(-1);
        head.leftNode.leftNode=new TreeNode(1);
        head.leftNode.rightNode=new TreeNode(2);
        head.rightNode = new TreeNode(-2);
        head.rightNode.rightNode=new TreeNode(3);
    }
    public static void main(String args[])
    {
        LevelOrderTraversal obj = new LevelOrderTraversal();
        obj.createTree();
        obj.printEachLevel();
    }
}