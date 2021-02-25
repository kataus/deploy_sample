package ru.otus.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndexControllerTest {
    @DisplayName( "Есть страница ads" )
    @Test
    public void testAds(){
        IndexController indexController = new IndexController();
        assertEquals( "ads", indexController.adsPage() );
    }
}