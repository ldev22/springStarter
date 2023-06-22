package com.wungatech.roomswebapp.controllers;

import com.wungatech.roomswebapp.models.StaffMember;
import com.wungatech.roomswebapp.services.StaffService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/staff")
public class StaffRestController {
    private final StaffService staffService;

    public StaffRestController(StaffService staffService){ this.staffService = staffService; }

    @GetMapping
    public List<StaffMember> getAllStaff(Model model){
        return staffService.getAllStaff();
    }
}
