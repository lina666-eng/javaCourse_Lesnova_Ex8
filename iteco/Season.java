package ru.iteco;

public enum Season {
    WINTER ("#FF0000"),
    SPRING ("#0000FF"),
    SUMMER("#00FF00"),
    AUTUMN("#00FF10");
    private String code;
    Season(String code){
        this.code = code;
    }
    public String getCode(){ return code;}
}
