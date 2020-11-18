package kg.easy.shop.models.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Response {
    private int status;
    private String message;
    private Object object;

    public static Response getResponse(){
        return Response.builder()
                .status(1)
                .message("Succes")
                .build();
    }
}
