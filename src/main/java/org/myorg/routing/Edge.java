package org.myorg.routing;

import java.util.List;

/**
 *
 * @author Jia Lu
 */
public interface Edge {
    public void setEdgeId(int id);
    public int getEdgeId();
    public int getWeight();
    public void setWeight(int weight);
    public Node getLeftNode();
    public Node getRightNode();
    public List<Node> getNodes();
    public void setLeftNode(Node leftNode);
    public void setRightNode(Node rightNode);
    public void setNodes(List nodes);
}
