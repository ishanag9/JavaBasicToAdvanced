package Lecture19;

import java.util.*;

public class Graph {
    private class Vertex {
        String name;
        HashMap<Vertex, Integer> nbrs;

        Vertex(String name) {
            this.name = name;
            this.nbrs = new HashMap<>();
        }

        public void display() {
            String str = this.name + "=>";
            Set<Vertex> nbrs = this.nbrs.keySet();
            for (Vertex nbr : nbrs) {
                str = str + nbr.name + "(" + this.nbrs.get(nbr) + "), ";
            }

            str = str + "END";
            System.out.println(str);
        }
    }

    HashMap<String, Vertex> vtces;

    Graph() {
        this.vtces = new HashMap<>();
    }

    public int numVtces() {
        return this.vtces.size();
    }

    public void addVertex(String name) {
        if (this.vtces.containsKey(name)) {
            return;
        }

        Vertex vtx = new Vertex(name);
        this.vtces.put(name, vtx);
    }

    public void removeVertex(String name) {
        if (!this.vtces.containsKey(name)) {
            return;
        }

        Vertex rvtx = this.vtces.get(name);
        Set<Vertex> nbrs = rvtx.nbrs.keySet();
        for (Vertex nbr : nbrs) {
            nbr.nbrs.remove(rvtx);
        }

        this.vtces.remove(name);
    }

    public int numEdges() {
        Collection<Vertex> allvtces = this.vtces.values();
        int rv = 0;
        for (Vertex onevtx : allvtces) {
            rv = rv + onevtx.nbrs.size();
        }
        rv = rv / 2;
        return rv;
    }

    public void addEdge(String name1, String name2, int cost) {
        Vertex vtx1 = this.vtces.get(name1);
        Vertex vtx2 = this.vtces.get(name2);

        if (vtx1 == null || vtx2 == null || vtx1.nbrs.containsKey(vtx2)) {
            return;
        }
        vtx1.nbrs.put(vtx2, cost);
        vtx2.nbrs.put(vtx1, cost);
    }

    public void removeEdge(String name1, String name2) {
        Vertex vtx1 = this.vtces.get(name1);
        Vertex vtx2 = this.vtces.get(name2);

        if (vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vtx2)) {
            return;
        }
        vtx1.nbrs.remove(vtx2);
        vtx2.nbrs.remove(vtx1);
    }

    public void display() {
        Collection<Vertex> vtces = this.vtces.values();
        for (Vertex vtx1 : vtces) {
            vtx1.display();
        }
    }

    public boolean hasPath(String name1, String name2) {
        Vertex vtx1 = this.vtces.get(name1);
        Vertex vtx2 = this.vtces.get(name2);

        if (vtx1 == null || vtx2 == null) {
            return false;
        }
        HashMap<Vertex, Boolean> traversed = new HashMap<>();
//        return this.hasPathRecursuive(vtx1, vtx2, traversed);
        return this.hasPathIterative(vtx1, vtx2, traversed);

    }

    //    Depth First Search (dfs)
    private boolean hasPathRecursuive(Vertex vtx1, Vertex vtx2, HashMap<Vertex, Boolean> traversed) {
        if (!traversed.containsKey(vtx1)) {
            traversed.put(vtx1, true);
        } else {
            return false;
        }

        if (vtx1.nbrs.containsKey(vtx2)) {
            return true;
        }

        Set<Vertex> nbrs = vtx1.nbrs.keySet();
        for (Vertex nbr : nbrs) {
            if (this.hasPathRecursuive(nbr, vtx2, traversed)) {
                return true;
            }
        }
        return false;
    }

    //    Breadth First Search (bfs)
    private boolean hasPathIterative(Vertex vtx1, Vertex vtx2, HashMap<Vertex, Boolean> traversed) {
        LinkedList<Vertex> queue = new LinkedList<>();
        queue.add(vtx1);
        while (!queue.isEmpty()) {
            Vertex rv = queue.remove();
            if (!traversed.containsKey(rv)) {
                traversed.put(rv, true);
                if (rv.nbrs.containsKey(vtx2)) {
                    return true;
                } else {
                    Set<Vertex> nbrs = rv.nbrs.keySet();
                    for (Vertex nbr : nbrs) {
                        if (!traversed.containsKey(nbr)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    //    Breadth First Traversal (bft)
    public void bft() {
        LinkedList<Vertex> queue = new LinkedList<>();
        HashMap<Vertex, Boolean> traversed = new HashMap<>();
        Collection<Vertex> vtces = this.vtces.values();
        for (Vertex vtx : vtces) {
            if (!traversed.containsKey(vtx)) {
                queue.add(vtx);
            }
            while (!queue.isEmpty()) {
                Vertex rv = queue.remove();
                if (!traversed.containsKey(rv)) {
                    traversed.put(rv, true);
                    System.out.print(rv.name + " ");
                    Set<Vertex> nbrs = rv.nbrs.keySet();
                    for (Vertex nbr : nbrs) {
                        if (!traversed.containsKey(nbr)) {
                            queue.add(nbr);
                        }
                    }
                }
            }
        }
    }

    //    Depth First Search (dft)
    public void dft() {
        LinkedList<Vertex> stack = new LinkedList<>();
        HashMap<Vertex, Boolean> traversed = new HashMap<>();
        Collection<Vertex> vtces = this.vtces.values();
        for (Vertex vtx : vtces) {
            if (!traversed.containsKey(vtx)) {
                stack.addFirst(vtx);
            }
            while (!stack.isEmpty()) {
                Vertex rv = stack.remove();
                if (!traversed.containsKey(rv)) {
                    traversed.put(rv, true);
                    System.out.print(rv.name + " ");
                    Set<Vertex> nbrs = rv.nbrs.keySet();
                    for (Vertex nbr : nbrs) {
                        if (!traversed.containsKey(nbr)) {
                            stack.addFirst(nbr);
                        }
                    }
                }
            }
        }
    }

    public boolean isConnected() {
        LinkedList<Vertex> queue = new LinkedList<>();
        HashMap<Vertex, Boolean> traversed = new HashMap<>();
        Collection<Vertex> vtces = this.vtces.values();
        queue.add((Vertex) vtces.toArray()[0]);
        while (!queue.isEmpty()) {
            Vertex rv = queue.remove();
            if (!traversed.containsKey(rv)) {
                traversed.put(rv, true);
                Set<Vertex> nbrs = rv.nbrs.keySet();
                for (Vertex nbr : nbrs) {
                    if (!traversed.containsKey(nbr)) {
                        queue.add(nbr);
                    }
                }
            }
        }
        return this.vtces.size() == traversed.size();
    }


}
