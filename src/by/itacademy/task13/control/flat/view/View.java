package by.itacademy.task13.control.flat.view;

import by.itacademy.task13.control.flat.bean.City;
import by.itacademy.task13.control.flat.bean.Flat;

import java.util.List;

public class View {

    public void viewFlat(String byWhat, List<Flat> flats) {

        for (int i = 0; i < flats.size(); i++) {

                System.out.printf("%10s |flat number %3d |area %5d |floor %5d  " +
                                " |rooms %2d | street %10s | material %10s |usage %3d \n", byWhat,
                        flats.get(i).getFlatNumber(),
                        flats.get(i).getFlatArea(),
                        flats.get(i).getFlatFloor(),
                        flats.get(i).getRoomNumber(),
                        flats.get(i).getStreet(),
                        flats.get(i).getBuildingType(),
                        flats.get(i).getUsagePeriod()
                );
            }

        }

            public void viewJustFlats (City flat) {
                List<Flat> flats = flat.getFlats();

                for (Flat flat1: flats) {
                    System.out.printf("%3d %5d %5d %2d %10s %10s %3d \n",
                            flat1.getFlatNumber(),
                            flat1.getFlatArea(),
                            flat1.getFlatFloor(),
                            flat1.getRoomNumber(),
                            flat1.getStreet(),
                            flat1.getBuildingType(),
                            flat1.getUsagePeriod()
                    );
                    
                }
        
            }
}