package kg.easy.shop.models.dto;

import kg.easy.shop.models.enumPackage.OperationType;
import lombok.Data;

import java.util.Date;

@Data
public class OperationDto {
    private Long id;
    private UserDto user;
    private CustomerDto customer;
    private double sum;
    private double actualSum;
    private double difference;
    private Date date;
    private OperationType type;
}
