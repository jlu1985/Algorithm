package org.myorg.routing;

/**
 *
 * @author Jia Lu
 */
public interface EdgeMap {
    public EdgeChain getEdgeChainByKey(String key);
    public Edge getEdgeById(int id);
    public Edge getEdgeByKey(String key);
   
}
