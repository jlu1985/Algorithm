package org.myorg.routing;

import java.util.List;

/**
 *
 * @author Jia Lu
 */
public interface EdgeChain {
    public void setChainId(int id);
    public int getChainId();
    public void setChainName(String name);
    public String getChainName();
    public void setChainDescription(String description);
    public String getChainDescription();
    public void setLeftEnd(Edge edge);
    public void setRightEnd(Edge edge);
    public Edge getLeftEnd();
    public Edge getRightEnd();
    public void setChain(List<Edge> edges);
    public Edge getLeftEdge(Edge edge);
    public Edge getRightEdge(Edge edge);
}
