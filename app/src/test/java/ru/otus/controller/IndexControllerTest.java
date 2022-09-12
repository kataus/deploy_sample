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

    @DisplayName( "Попытки должно быть 7" )
    @Test
    public void testRetryCount(){
        IndexController indexController = new IndexController();
        assertEquals( 6, indexController.retryCount() );
    }
}