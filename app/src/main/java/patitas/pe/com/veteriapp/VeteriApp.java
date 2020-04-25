package patitas.pe.com.veteriapp;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

import patitas.pe.com.veteriapp.models.Order;
import patitas.pe.com.veteriapp.models.Pet;

public class VeteriApp extends Application {

    public ArrayList<Pet> petList = new ArrayList<>();
    public ArrayList<Order> orderList = new ArrayList<>();

    public void addPet(Pet pet) {
        petList.add(pet);
    }


    public List<Pet> getPetList() {
        return petList;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void addOrder(Order order) {
        orderList.add(order);
    }

}
