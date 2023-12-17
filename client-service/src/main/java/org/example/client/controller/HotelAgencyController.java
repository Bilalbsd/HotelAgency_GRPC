package org.example.client.controller;

import com.google.protobuf.Descriptors;
import org.example.client.service.HotelAgencyClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HotelAgencyController {

    final HotelAgencyClientService hotelAgencyClientService;

    public HotelAgencyController(HotelAgencyClientService hotelAgencyClientService) {
        this.hotelAgencyClientService = hotelAgencyClientService;
    }

    @GetMapping("/client/{id}")
    public Map<Descriptors.FieldDescriptor, Object> getClient(@PathVariable String id) {
        return hotelAgencyClientService.getClient(Integer.parseInt(id));
    }
}
