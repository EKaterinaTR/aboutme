package ru.katya.aboutme.money.models;

public enum Bank {
    Sberbank("Сбербанк"),
    Tinkoff("Тинькофф"),
    OPEN("Открытие"),
    VTB("ВТБ"),
    Rosbank("Росбанк"),
    Abank("Альфа-Банк"),
    Sofcombank("Совкомбанк"),
    MKB("МКБ"),
    CUSH("Наличные"),
    NONEED("Не важно");
    private String name;

    Bank(String name) {
        this.name = name;
    }
}
