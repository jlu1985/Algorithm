package org.myorg.routing;

import java.util.List;
import java.util.Set;

/**
 *
 * @author Jia Lu
 */
public interface RouteMap {

    public Route getRouteByKey(String key);

    public Node getNodeById(int id);
    public Node getNodeByKey(String key);
    public List<Node> getNeighborNodesById(int id);
}
