package lsp;

import java.sql.Date;

public class Smartphone extends Product {
    @Override
    String getName(){
        return "Samsung S22 Ultra";
    }
    @Override
    Date getExpiredDate(){
        return new Date(0);
    }
}
