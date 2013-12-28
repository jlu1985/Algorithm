package org.myorg.routing;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Jia Lu
 */
public interface Route {
    public void setRouteId(int id);
    public int getRouteId();
    public void setRouteName(String name);
    public String getRouteName();
    public void setRouteDescription(String description);
    public String getRouteDescription();
    public void setLeftEnd(Node node);
    public void setRightEnd(Node node);
    public Node getLeftEnd();
    public Node getRightEnd();
    public void setRoute(List<Node> nodes);
    public List<Node> getRoute();
    public Node getLeftNode(Node node);
    public Node getRightNode(Node node);
}
