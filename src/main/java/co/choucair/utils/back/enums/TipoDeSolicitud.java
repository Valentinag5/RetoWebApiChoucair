package co.choucair.utils.back.enums;

public enum TipoDeSolicitud {
    GET("GET"),
    POST("POST"),
    PUT("PUT"),
    DELETE("DELETE");

    private final String value;

    TipoDeSolicitud(String value){
        this.value=value;
    }

    public String getValue() {
        return value;
    }
}
