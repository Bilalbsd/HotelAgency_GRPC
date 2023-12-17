package org.example;

import java.util.ArrayList;
import java.util.List;

public class DB {

    public static List<Client> getClientsFromDB() {
        return new ArrayList<Client>() {
            {
                add(Client.newBuilder().setId(1).setFirstName("Charles").setLastName("Dickens").setCardNumber("0188737483").setCcv("123").build());
                add(Client.newBuilder().setId(2).setFirstName("William").setLastName("Shakespeare").setCardNumber("93783904").setCcv("123").build());
                add(Client.newBuilder().setId(3).setFirstName("JK").setLastName("Rowling").setCardNumber("93807398065930").setCcv("123").build());
                add(Client.newBuilder().setId(4).setFirstName("Virginia").setLastName("Woolf").setCardNumber("3065390840").setCcv("123").build());
            }
        };
    }

}
