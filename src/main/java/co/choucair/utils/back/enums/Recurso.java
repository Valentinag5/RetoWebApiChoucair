package co.choucair.utils.back.enums;

public enum Recurso {
        GET_RECURSO("api/v1/employees"),
    POST_RECURSO("api/v1/create"),
    PUT_RECURSO("public/api/v1/update/21"),
    DELETE_RECURSO("public/api/v1/delete/2");

    private final String value;

    Recurso(String value){
        this.value=value;
    }

    public String getValue() {
        return value;
    }
}
