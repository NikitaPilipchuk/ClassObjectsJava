package com.company;

public class Main {

    public static void main(String[] args) {

        // Тест для класса Square
        System.out.println("\n" + "---- Тест класса Square ----");
	    Square figure1 = new Square();
        System.out.println("Диагональ квадрата со сторонами " + figure1.getWidth() + " равна " + figure1.getDiagonal());
	    figure1.setWidth(17);
        System.out.println("Диагональ квадрата со сторонами " + figure1.getWidth() + " равна " + figure1.getDiagonal());
        System.out.println("-----------------------------" + "\n");

        // Тест для класса Rectangle
        System.out.println("---- Тест класса Rectangle ----");
        Rectangle figure2 = new Rectangle(5, 12, 0);
        System.out.println("height = " + figure2.getHeight());
        System.out.println("Диагональ при width " + figure2.getWidth() + " и height " + figure2.getHeight() + " = "  + figure2.getDiagonal());
        System.out.println("Площадь при width " + figure2.getWidth() + " и height " + figure2.getHeight() + " = "  +  figure2.getArea());
        figure2.setWidth(15);
        System.out.println("Диагональ при width " + figure2.getWidth() + " и height " + figure2.getHeight() + " = "  + figure2.getDiagonal());
        System.out.println("Площадь при width " + figure2.getWidth() + " и height " + figure2.getHeight() + " = "  +  figure2.getArea());

        System.out.println("-----------------------------" + "\n");

    }
}
