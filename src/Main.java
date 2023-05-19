import Model.Person;
import Model.WORK_SHIFTS;
import Workers.Administrative;
import Workers.WarehouseWaiter;
import Workers.Worker;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        List<Administrative> administrativesList = new ArrayList<>();
        List<WarehouseWaiter> warehouseWaitersList = new ArrayList<>();

        Person FranciscoMG = new WarehouseWaiter("Francisco", "Martínez Gutierrez", "01/01/2000", "Mozo de almacen", WORK_SHIFTS.NIGHT, "LicenciaCarretillaFMG", "LicenciaManipuladorFMG");

        Person PedroGF = new Administrative("Pedro", "Gómez Fernández", "17/02/1970", "Administrativo", "Excel, Word, PowerPoint, ContaPlus, NominaPlus, Teams, Outlook, Visual Basic");

        Person MariaA = new WarehouseWaiter("María", "Alfajores", "10/11/1990", "Moza de almacen", WORK_SHIFTS.MORNING, "LicenciaCarretillaMaA", null);

        Person PedroGH = new WarehouseWaiter("Pedro", "Gómez Hernández", "03/03/1999", "Mozo de almacén", WORK_SHIFTS.AFTERNOON, null, null);

        Person MartaSG = new Administrative("Marta", "Sánchez García", "04/07/1997", "Administrativa", "Excel, Word, Power Point, ContaPlus, NominaPlus, Teams, Outlook");

        Person AllanMcK = new Worker("Allan", "McKenzie", "29/09/1970", "Gerente", WORK_SHIFTS.MORNING);

        personList.add(FranciscoMG);
        personList.add(PedroGF);
        personList.add(MariaA);
        personList.add(PedroGH);
        personList.add(MartaSG);
        personList.add(AllanMcK);

        for (Person p: personList) {

            if (p.getJob().contains("de almac")) {
                warehouseWaitersList.add((WarehouseWaiter) p);
                System.out.println("El trabajador con nombre " + p.getName() + " " + p.getSurname() + " añadido a lista de mozos de almacén");
            } else if (p.getJob().contains("Administrativ")){
                assert p instanceof Administrative;
                administrativesList.add((Administrative) p);
                System.out.println("El trabajador con nombre " + p.getName() + " " + p.getSurname() + " añadido a lista de administrativos");
            } else {
                System.out.println("El trabajador con nombre " + p.getName() + " " + p.getSurname() + " no pertenece a ningún grupo de trabajo porque su cargo es: " + p.getJob());
            }

        }

        System.out.println("\n===== MOZOS DE ALMACÉN =====");
        for (int i = 0; i < warehouseWaitersList.size(); i++) {
            WarehouseWaiter whw = warehouseWaitersList.get(i);
            System.out.println(whw.getName() + " " + whw.getSurname() +
                    "(" +  whw.getBirthDate() + ")" +
                    "\n\tPuesto: " + whw.getJob() +
                    "\n\tTurno: " + whw.getShift() +
                    "\n\tCarné de manipulador: " + whw.getFoodHandlerLicense() +
                    "\n\tCarné de carretilla: " + whw.getForkliftLicense()
            );
        }

        System.out.println("\n===== ADMINISTRATIVOS =====");
        for (Administrative ad : administrativesList) {
            System.out.println(ad.getName() + " " + ad.getSurname() +
                    "(" +  ad.getBirthDate() + ")" +
                    "\n\tPuesto: " + ad.getJob() +
                    "\n\tTurno: " + ad.getShift() +
                    "\n\tConocimientos informáticos: " + ad.getSoftwareKnowledge()
            );
        }

    }
}