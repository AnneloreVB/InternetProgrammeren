/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import domain.Address;
import java.util.ArrayList;

/**
 *
 * @author Annelore pc
 */
public interface AddressRepository {
    Address get(int id);

    ArrayList<Address> getAll();

    void add(Address adres);

    void update(Address adres);

    void delete(int id);
}
