package com.company;

// Создание класса квадрат
public class Square {

    // Поля
    private int width;
    private int center;

    // Конструктор по умолчанию
    public Square() {
        width = 4;
        center = 0;
    }

    // Конструктр с заданием значений стороны и центра
    public Square(int width, int center) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        this.center = center;

    };

    // Конструктор копирования
    public Square(Square OrigSquare) {
        if (OrigSquare.width < 0) {
            this.width = 0;
        } else {
            this.width = OrigSquare.width;
        }
        this.center = OrigSquare.center;
    }

    // Геттеры
    int getWidth() {
        return width;
    };
    int getCenter() {
        return center;
    };

    // Сеттеры
    public void setCenter(int center) {
        this.center = center;
    }
    public void setWidth(int width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    // Вычисление диагонали квадрата
    public double getDiagonal() {
        return width * Math.sqrt(2);
    };
}








