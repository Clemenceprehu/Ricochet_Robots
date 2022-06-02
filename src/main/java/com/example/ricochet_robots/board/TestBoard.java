package com.example.ricochet_robots.board;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

import java.awt.*;

public class TestBoard {
    @Test
    void TestBot() {
        Rand rand = new Rand();
        Assertions.assertEquals("blue",rand.color);
    }
}
