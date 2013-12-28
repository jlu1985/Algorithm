package org.myorg.routing.dijkstra;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import org.myorg.routing.Atlas;
import org.myorg.routing.Node;

public class Dijkstra{
    private static int INFINITE_DISTANCE = Integer.MAX_VALUE;
    private final Atlas map;

    private final Comparator<Node> shortestDistanceComparator = new Comparator<Node>() {
        public int compare(Node left, Node right) {
            // note that this trick doesn't work for huge distances, close to Integer.MAX_VALUE
            int result = getShortestDistance(left) - getShortestDistance(right);

            return (result == 0) ? left.compareTo(right) : result;
        }
    };

    private final PriorityQueue<Node> unsettledNodes = new PriorityQueue<Node>(
            8, shortestDistanceComparator);
    private final Set<Node> settledNodes = new HashSet<Node>();

    private final Map<String, Integer> shortestDistances = new HashMap<String, Integer>();

    private final Map<String, Node> predecessors = new HashMap<String, Node>();

    public Dijkstra(Atlas map) {
        this.map = map;
    }

    private void init(Node start) {
        settledNodes.clear();
        unsettledNodes.clear();

        shortestDistances.clear();
        predecessors.clear();

        setShortestDistance(start, 0);
        unsettledNodes.add(start);
    }

    public void execute(Node start, Node destination) {
        init(start);

        Node u;

        while ((u = unsettledNodes.poll()) != null) {
            assert !isSettled(u);

            if (u == destination) {
                break;
            }

            settledNodes.add(u);

            relaxNeighbors(u);
        }
//        return new ResultImpl(start, destination, shortestDistances, predecessors);
    }

    private void relaxNeighbors(Node u) {
        try {

            for (Node v : map.getNeighborNodesById(u.getNodeId())) {
                if (isSettled(v)) {
                    continue;
                }
                int shortDist = getShortestDistance(u) + map.getEdgeByKey(generateId(u, v)).getWeight();

                if (shortDist < getShortestDistance(v)) {
                    setShortestDistance(v, shortDist);
                    setPredecessor(v, u);
                }
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    private String generateId(Node u, Node v) {
        int a = u.getNodeId();
        int b = v.getNodeId();
        Integer result = null;
        if (b > a) {
            result = ((a + b) * (a + b + 1)) / 2 + b;
            return result.toString();
        }
        result = ((b + a) * (b + a + 1)) / 2 + a;
        return result.toString();
    }

    private boolean isSettled(Node v) {
        return settledNodes.contains(v);
    }

    public int getShortestDistance(Node station) {
        Integer d = shortestDistances.get(station.toString());
        return (d == null) ? INFINITE_DISTANCE : d;
    }

    private void setShortestDistance(Node station, int distance) {
        unsettledNodes.remove(station);
        shortestDistances.put(station.toString(), distance);
        unsettledNodes.add(station);
    }

    public Node getPredecessor(Node station) {
        return predecessors.get(station);
    }

    private void setPredecessor(Node a, Node b) {
        predecessors.put(a.toString(), b);
    }

}
