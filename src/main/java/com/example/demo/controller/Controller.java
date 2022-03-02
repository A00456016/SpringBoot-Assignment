package com.example.demo.controller;

import com.example.demo.model.Hotel;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/hotels")
public class Controller {
    @Autowired
    UserService userService;

    @GetMapping("")
    public List<Hotel> list() {
        return userService.listAllHotel();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Hotel> get(@PathVariable Integer id) {
        try {
            Hotel hotel = userService.getHotel(id);
            return new ResponseEntity<Hotel>(hotel, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Hotel>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public void add(@RequestBody Hotel hotel) {
        userService.saveHotel(hotel);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Hotel hotel, @PathVariable Integer id) {
        try {
            Hotel existHotel = userService.getHotel(id);
            hotel.setId(id);
            userService.saveHotel(hotel);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {

        userService.deleteHotel(id);
    }
}