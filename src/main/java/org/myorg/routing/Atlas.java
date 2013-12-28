package org.myorg.routing;

/**
 *
 * @author Jia Lu
 */
public interface Atlas extends RouteMap, EdgeMap {

    public void setEdgeMap(EdgeMap edgeMap);

    public EdgeMap getEdgeMap();

    public void setRouteMap(RouteMap routeMap);

    public RouteMap getRouteMap();
}
