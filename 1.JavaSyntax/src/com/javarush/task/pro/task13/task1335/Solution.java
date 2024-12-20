package com.javarush.task.pro.task13.task1335;

/* 
Дорога к выходу
*/

import java.util.List;

public class Solution {

    public static void main(String[] args) {
        printList(clearBoard());
    }

    public static List<Board.Node> clearBoard() {
        Board board = new Board();
        List<Board.Node> nodes = board.getBoardNodes();

        for (Board.Node node : nodes) {
            if (!node.getData().equals("board")) {
                node.setData("board");
            }
        }
        return nodes;
    }

    private static void printList(List<?> list) {
        list.forEach(element -> System.out.print(element + " "));
    }
}
