package org.fate7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParcourirArbreTest {

    Node node = new Node();

    @BeforeEach
    void setUp() {
        node = new Node(15,
                new Node(-12, new Node(3), new Node(19)),
                new Node(11, new Node(-8), new Node(7,
                        new Node(11),
                        new Node(3, new Node(-2), new Node())))
        );
    }

    @Test
    void findMax() {
        ParcourirArbre parcourirArbre = new ParcourirArbre();
        int max = parcourirArbre.findMax(node);
        assertEquals(19, max);

    }
}