package DataStructures;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by ARPITHA RAO on 01-05-2017.
 */
public class BinaryMinHeap<T> {

    class Node {
        T key;
        int weight;
    }

    private ArrayList<Node> allNodes = new ArrayList<>();
    private HashMap<T, Integer> nodePosition = new HashMap<>();

    public boolean containsData(T key) {
        if (nodePosition.containsKey(key)) {
            return true;
        }
        return false;
    }

    public void add(T key, int weight) {
        Node node = new Node();
        node.key = key;
        node.weight = weight;

        allNodes.add(node);
        int currentPostition = allNodes.size() - 1;
        nodePosition.put(node.key, currentPostition);

        int parentPosition = (currentPostition - 1) / 2;

        while (parentPosition >= 0) {
            Node parent = allNodes.get(parentPosition);
            Node currentNode = allNodes.get(currentPostition);
            int parentWeight = parent.weight;
            int currentWeight = node.weight;

            if (parentWeight > currentWeight) {
                swap(currentNode, parent);
                updatePosition(currentNode.key, parent.key, currentPostition, parentPosition);
                currentPostition = parentPosition;
                parentPosition = (parentPosition - 1) / 2;
            } else {
                break;
            }
        }
    }

    public void decrease(T key, int newWeight) {
        int currentPosition = nodePosition.get(key);
        allNodes.get(currentPosition).weight = newWeight;

        int parentPostion = (currentPosition - 1) / 2;
        Node parent = allNodes.get(parentPostion);
        while (parentPostion >= 0) {
            if (parent.weight > allNodes.get(currentPosition).weight) {
                swap(parent, allNodes.get(currentPosition));
                updatePosition(allNodes.get(currentPosition).key, parent.key, currentPosition, parentPostion);
                currentPosition = parentPostion;
                parentPostion = (parentPostion - 1) / 2;
            } else {
                break;
            }
        }
    }

    public Node extractMinNode() {
        Node min = new Node();
        min.key = allNodes.get(0).key;
        min.weight = allNodes.get(0).weight;

        int last = allNodes.size() - 1;
        allNodes.get(0).key = allNodes.get(last).key;
        allNodes.get(0).weight = allNodes.get(last).weight;


        nodePosition.remove(min.key);
        nodePosition.remove(last);
        nodePosition.put(allNodes.get(0).key, 0);
        allNodes.remove(last);

        int currentPosition = 0;
        last--;

        while (true) {
            int leftPosition = 2 * currentPosition + 1;
            int rightPosition = 2 * currentPosition + 2;

            if (leftPosition > last) {
                break;
            }

            if (rightPosition > last) {
                rightPosition = leftPosition;
            }

            int nextMin = allNodes.get(leftPosition).weight <= allNodes.get(rightPosition).weight
                    ? leftPosition : rightPosition;

            if (allNodes.get(currentPosition).weight > allNodes.get(nextMin).weight) {

                swap(allNodes.get(nextMin), allNodes.get(currentPosition));
                updatePosition(allNodes.get(nextMin).key, allNodes.get(currentPosition).key, nextMin, currentPosition);

                currentPosition = nextMin;
            } else {
                break;
            }

        }

        return min;
    }

    public T extractMin() {
        Node node = extractMinNode();
        return node.key;
    }

    public Integer getWeight(T key) {
        if (nodePosition.containsKey(key)) {
            return allNodes.get(nodePosition.get(key)).weight;
        }
        return null;
    }

    public void swap(Node node1, Node node2) {
        T key = node1.key;
        int weight = node1.weight;

        node1.key = node2.key;
        node1.weight = node2.weight;

        node2.key = key;
        node2.weight = weight;
    }

    public void updatePosition(T data1, T data2, int weight1, int weight2) {
        nodePosition.remove(data1);
        nodePosition.remove(data2);
        nodePosition.put(data1, weight1);
        nodePosition.put(data2, weight2);
    }

    public void printHeap(){
        for(Node n:allNodes){
            System.out.println(n.key+" "+n.weight);
        }
    }
    public boolean empty(){
        return allNodes.size() == 0;
    }

    public T min(){
        return allNodes.get(0).key;
    }

    public static void main(String args[]){
        BinaryMinHeap<String> heap = new BinaryMinHeap<>();
        heap.add("A", 5);
        heap.add("B", 3);
        heap.add("C", 7);
        heap.add("D", 6);
        heap.add("E", 10);
        heap.add("F", 16);
        heap.printHeap();

        heap.extractMin();
        System.out.println("After extract min");
        heap.printHeap();

        System.out.println("min " + heap.min());

        heap.decrease("F", 4);
        System.out.println("After decrease");
        heap.printHeap();

        heap.extractMin();
        System.out.println("After extract min");
        heap.printHeap();
        System.out.println("min " + heap.min());


    }

}
