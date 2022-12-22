package ru.job4j.queue;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class ReconstructPhrase {
    private final Queue<Character> descendingElements;

    private final Queue<Character> evenElements;

    public ReconstructPhrase(Queue<Character> descendingElements, Queue<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder result = new StringBuilder();
        int count = evenElements.size();
        for (int i = 0; i < count; i++) {
            if (i % 2 == 0) {
                result.append(evenElements.poll());
            }else {
                evenElements.poll();
            }
        }
        return result.toString();
    }

    private String getDescendingElements() {
        StringBuilder result = new StringBuilder();
        while (descendingElements.size() > 0) {
            result.insert(0,descendingElements.poll());
        }
        return result.toString();
    }

    public String getReconstructPhrase() {
        return  getEvenElements() + getDescendingElements();
    }

    public static void main(String[] args) {
        Deque<Character> evenElements = new LinkedList<>(
                Arrays.asList(
                        'S', '1', 'l', '3', 'o', 'h', 'g', 'h', 'a', 'm', 'n', 't',
                        ' ', 't', 'o', ' ', 'f', 'q', ' ', '6', 'l', '.', 'a', ',',
                        'n', 'w', 'g', 'd', 'u', 'a', 'a', 'u', 'g', 'd', 'e', 'q',
                        ' ', 'y', 'J', 'd', 'a', 'k', 'v', 'p', 'a', 'e', ':', 'b'
                )
        );
        Deque<Character> descendingElements = new LinkedList<>(
                Arrays.asList(
                        'e', 'r', 'e', 'h', 'w', 'y', 'r', 'e', 'v', 'e', ' ', 'n', 'u',
                        'r', ' ', ',', 'e', 'c', 'n', 'o', ' ', 'e', 't', 'i', 'r', 'W', ' '
                )
        );
        String expected = "Slogan of language Java: Write once, run everywhere";
        ReconstructPhrase rph = new ReconstructPhrase(descendingElements, evenElements);
        String result = rph.getReconstructPhrase();
        System.out.println(rph.getEvenElements());
        System.out.println(rph.getDescendingElements());
        System.out.println(result);
    }
}
