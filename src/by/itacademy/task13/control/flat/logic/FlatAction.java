package by.itacademy.task13.control.flat.logic;

import by.itacademy.task13.control.flat.bean.City;
import by.itacademy.task13.control.flat.bean.Flat;

import java.util.ArrayList;
import java.util.List;

public class FlatAction {

    public List<Flat> chooseByRoomNumber (int roomNumber, City city) {

        List<Flat> chooseByRoomNumber = new ArrayList<>();
        List<Flat> flats = city.getFlats();

        for (int i = 0; i < flats.size(); i++) {
            if (flats.get(i).getRoomNumber() == roomNumber) {
                chooseByRoomNumber.add(flats.get(i));
            }
        }

        return chooseByRoomNumber;
    }

        public List<Flat> chooseByRoomNumberAndFloor (int roomNumber, int lowFloor, int highFloor,  City city) {
                List<Flat> chooseByRoomNumberAndFloor = new ArrayList<>();
                List<Flat> flats = city.getFlats();

            for (int i = 0; i < flats.size(); i++) {

                if ((flats.get(i).getRoomNumber()== roomNumber) &&
                        (flats.get(i).getFlatFloor()>=lowFloor) && (flats.get(i).getFlatFloor()<=highFloor))
                {

                    chooseByRoomNumberAndFloor.add(flats.get(i));

                }

            }

            return chooseByRoomNumberAndFloor;
        }

            public List<Flat> chooseByFlatArea (int flatArea, City city) {

                List<Flat> chooseByFlatArea = new ArrayList<>();
                List<Flat> flats = city.getFlats();

                for (Flat flat : flats) {

                    if (flat.getFlatArea()>= flatArea) {
                        chooseByFlatArea.add(flat);
                    }
                }
                return chooseByFlatArea;
            }

}
