package ac.za.cput.cardealership.factory;


import ac.za.cput.cardealership.domain.ServiceTicket;
import ac.za.cput.cardealership.util.Misc;

public class ServiceTicketFactory {

    public static ServiceTicket getServiceTicket(int number, String dateRecieved){
        return new ServiceTicket.Builder().serviceTicketID(Misc.generatedId())
                . number( number)
                .dateRecieved(dateRecieved)
                .build();
    }


}
