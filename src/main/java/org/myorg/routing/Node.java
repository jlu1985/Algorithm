package org.myorg.routing;

import java.util.List;

/**
 *
 * @author Jia Lu
 */
public interface Node extends Comparable<Node>{
    public void setNodeName(String name);
    public String getNodeName();
    public void setNodeId(int id);
    public int getNodeId();
    public Edge getEdgeById(int edgeId);
    public boolean hasEdge(int edgeId);
    public List<Edge> getEdges();
}
