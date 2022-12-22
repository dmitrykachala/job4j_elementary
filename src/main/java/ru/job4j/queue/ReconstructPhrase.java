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
            } else {
                evenElements.poll();
            }
        }
        return result.toString();
    }

    private String getDescendingElements() {
        StringBuilder result = new StringBuilder();
        while (descendingElements.size() > 0) {
            result.insert(0, descendingElements.poll());
        }
        return result.toString();
    }

    public String getReconstructPhrase() {
        return  getEvenElements() + getDescendingElements();
    }

}
