package com.klef.fsad.exam.model;

import jakarta.persistence.*;

@Entity
public class Booking
{
@Id
private int bookingId;
private String name;
private String date;
private String status;
}