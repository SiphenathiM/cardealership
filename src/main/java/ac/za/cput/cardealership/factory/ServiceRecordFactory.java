package ac.za.cput.cardealership.factory;

import ac.za.cput.cardealership.domain.Part;
import ac.za.cput.cardealership.domain.ServiceRecord;
import ac.za.cput.cardealership.util.Misc;

public class ServiceRecordFactory {

    public static ServiceRecord getServiceRecord(String date, int currentMileage){
        return new ServiceRecord.Builder()
                .date(date)
                .currentMileage(currentMileage)
                .build();
    }
}
