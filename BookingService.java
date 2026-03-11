package com.klef.fsad.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.klef.fsad.exam.repository.BookingRepository;
import com.klef.fsad.exam.model.Booking;

@Service
public class BookingService
{
@Autowired
BookingRepository repo;

public Booking addBooking(Booking b)
{
return repo.save(b);
}

public void deleteBooking(int id)
{
repo.deleteById(id);
}
}