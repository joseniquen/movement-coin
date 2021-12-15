package com.example.monederomovementmicroservice.infraestructure.modelDao;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("coin")
public class CoinDao {
    @Id
    public String idMonedero;
    public String telephone;
    public String mail;
    public String document;
    public String documentType;
    public String date;
    public boolean state;
}
