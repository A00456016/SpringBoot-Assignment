package com.example.demo.service;

import com.example.demo.model.Hotel;
import com.example.demo.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class UserService {
    @Autowired
    private HotelRepository hotelRepository;
    public List<Hotel> listAllHotel() {
        return hotelRepository.findAll();
    }

    public void saveHotel(Hotel hotel) {
        hotelRepository.save(hotel);
    }

    public Hotel getHotel(Integer id) {
        return hotelRepository.findById(id).get();
    }

    public void deleteHotel(Integer id) {
        hotelRepository.deleteById(id);
    }
}