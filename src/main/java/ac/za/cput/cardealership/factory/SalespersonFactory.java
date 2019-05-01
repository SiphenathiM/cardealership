package ac.za.cput.cardealership.factory;

import ac.za.cput.cardealership.domain.Salesperson;

public class SalespersonFactory{

    public static Salesperson getSalesperson(double salary, String position){
        return new Salesperson.Builder().salary(salary)
                .position(position)
                .build();
    }


}
