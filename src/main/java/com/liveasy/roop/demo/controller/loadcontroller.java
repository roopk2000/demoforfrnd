package com.liveasy.roop.demo.controller;

import com.liveasy.roop.demo.entity.Load;
import com.liveasy.roop.demo.service.impl.impl.loadservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RestController
@RequestMapping("/loads")
public class loadcontroller {
    @Autowired
    private loadservice loadService;

    @PostMapping("/add")
    public ResponseEntity<String> addLoad(@RequestBody Load load) {
        boolean success = loadService.addLoad(load);
        if (success) {
            return ResponseEntity.ok("Load details added successfully");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to add load details");
        }
    }

    @GetMapping("")
    public ResponseEntity<List<Load>> getLoadsByShipperId(@RequestParam("shipperId") String shipperId) {
        List<Load> loads = loadService.getLoadsByShipperId(shipperId);
        return ResponseEntity.ok(loads);
    }

    @GetMapping("/{loadId}")
    public ResponseEntity<Load> getLoadById(@PathVariable("loadId") Long loadId) {
        Load load = loadService.getLoadById(loadId);
        if (load != null) {
            return ResponseEntity.ok(load);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{loadId}")
    public ResponseEntity<String> updateLoad(@PathVariable("loadId") Long loadId, @RequestBody Load load) {
        boolean success = loadService.updateLoad(loadId, load);
        if (success) {
            return ResponseEntity.ok("Load details updated successfully");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to update load details");
        }
    }

    @DeleteMapping("/{loadId}")
    public ResponseEntity<String> deleteLoad(@PathVariable("loadId") Long loadId) {
        boolean success = loadService.deleteLoad(loadId);
        if (success) {
            return ResponseEntity.ok("Load deleted successfully");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to delete load");
        }
    }


}