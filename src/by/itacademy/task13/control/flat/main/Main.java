package by.itacademy.task13.control.flat.main;

import by.itacademy.task13.control.flat.bean.City;
import by.itacademy.task13.control.flat.bean.Flat;
import by.itacademy.task13.control.flat.logic.FlatAction;
import by.itacademy.task13.control.flat.view.View;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Flat flat1 = new Flat(106, 99, 10, 4,
                "Kahovskaya", "blocks", 150);
        Flat flat2 = new Flat(85, 45, 15, 2,
                "Luchiny", "concrete", 99);
        Flat flat3 = new Flat(12, 52, 3, 1,
                "Kolasa", "bricks", 85);
        Flat flat4 = new Flat(5, 1056, 1, 25,
                "Peramogi", "stone", 2000);
        Flat flat5 = new Flat(4, 84, 1, 4,
                "Bykova", "wood", 99);
        Flat flat6 = new Flat(14, 42, 2, 3,
                "Kahovskaya", "brick", 99);
        Flat flat7 = new Flat(14, 42, 3, 3,
                "Kahovskaya", "brick", 99);

        City flats = new City();
        flats.add(flat1);
        flats.add(flat2);
        flats.add(flat3);
        flats.add(flat4);
        flats.add(flat5);
        flats.add(flat6);
        flats.add(flat7);

        FlatAction flatAction = new FlatAction();
        View view = new View();
        List<Flat> flatViewByRoom = flatAction.chooseByRoomNumber(4,flats);
        view.viewJustFlats(flats);
        view.viewFlat("By room numbers", flatViewByRoom );
        List<Flat> flatViewByRoomFloor = flatAction.chooseByRoomNumberAndFloor(3,
                2,3,flats);
        view.viewFlat("By rooms and floors", flatViewByRoomFloor);
        List<Flat> byArea = flatAction.chooseByFlatArea(60, flats);

        view.viewFlat("By area", byArea);

    }
}
