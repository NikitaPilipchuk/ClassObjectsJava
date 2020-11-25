package com.company;

// Создание класса-потомока: прямоугольника
public class Rectangle extends Square {

    // Добавление нового поля
    private int width;
    private int height;
    private int center;


    // Конструктор по умолчанию
    public Rectangle() {
        width = 4;
        height = 6;
        center = 0;
    }

    // Конструктр с заданием значений сторон и центра
    public Rectangle(int width, int height, int center) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
        this.center = center;
    };

    // Конструктор копирования
    public Rectangle(Rectangle OrigRectangle) {
        if (OrigRectangle.width < 0) {
            this.width = 0;
        } else {
            this.width = OrigRectangle.width;
        }
        if (OrigRectangle.height < 0) {
            this.height = 0;
        } else {
            this.height = OrigRectangle.height;
        }
        this.center = OrigRectangle.center;
    }

    // Геттеры
    public int getHeight() {
        return height;
    }
    @Override
    public int getWidth() {
        return width;
    }
    @Override
    public int getCenter() {
        return center;
    }

    // Сеттеры
    public void setHeight(int height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }
    @Override
    public void setWidth(int width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }
    @Override
    public void setCenter(int center) {
        this.center = center;
    }

    // Переопределение нахождение диагонали
    @Override
    public double getDiagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

    // Нахождение площади
    public int getArea() {
        return width * height;
    }
}
