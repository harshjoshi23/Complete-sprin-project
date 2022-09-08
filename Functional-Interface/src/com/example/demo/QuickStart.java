package com.example.demo;



public class QuickStart {
    
    private static void withLambda() {
        
        Runnable task = () -> {
            System.out.println("Hi from lambda thread");
        };
        
        Thread thread = new Thread(task);
        thread.start();
    }



   private static void withoutLambda() {
        
        Runnable task = new Runnable() {
            
            @Override
            public void run() {
                System.out.println("Hi from thread");
                
            }
        };
        
        Thread thread = new Thread(task);
        thread.start();
    }
    
    public static void main(String[] args) {
        
        withoutLambda();
        withLambda();
        
    }



}