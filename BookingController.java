package com.klef.fsad.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.klef.fsad.exam.service.BookingService;
import com.klef.fsad.exam.model.Booking;

@RestController
@RequestMapping("/booking")
public class BookingController
{

@Autowired
BookingService service;

@PostMapping("/add")
public Booking add(@RequestBody Booking b)
{
return service.addBooking(b);
}

@DeleteMapping("/delete/{id}")
public String delete(@PathVariable int id)
{
service.deleteBooking(id);
return "Deleted";
}
}