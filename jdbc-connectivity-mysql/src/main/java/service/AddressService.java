package service;

import model.Address;
import repository.AddressRepository;

import java.util.List;

public class AddressService {
    private static final AddressRepository addressRepository = new AddressRepository();

    public List<Address> retrieveAddresses() {
        return addressRepository.retrieveAddresses();
    }

    public boolean insertAddress(Address address) {
        return addressRepository.createAddress(address);
    }
}
