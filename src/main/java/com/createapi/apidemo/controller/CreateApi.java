package com.createapi.apidemo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.createapi.apidemo.model.VendorDetails;

@RestController
@RequestMapping("/api")
public class CreateApi {
	private Map<String, VendorDetails> vendorDetailsMap = new HashMap<>();

    @GetMapping("/{VendorId}")
    public VendorDetails getVendorDetails(@PathVariable String VendorId) {
        // Check if the requested VendorId exists in the map
        if (vendorDetailsMap.containsKey(VendorId)) {
            return vendorDetailsMap.get(VendorId);
        } else {
            // Return a default response or handle the case when the requested VendorId is not found
            return new VendorDetails("DefaultId", "DefaultName", "DefaultPhone", "DefaultAddress");
        }
    }

    @PostMapping
    public String createVendorDetails(@RequestBody VendorDetails vendorDetails) {
        // Store the created vendorDetails in the map with its ID as the key
        vendorDetailsMap.put(vendorDetails.getVendorId(), vendorDetails);
        return "VendorDetails created.";
    }
    
    @PutMapping
    public String updateVendorDetails(@RequestBody VendorDetails vendorDetails) {
    	// Update the existing vendorDetails in the map 
    	vendorDetailsMap.put(vendorDetails.getVendorId(), vendorDetails);
    	return "VendorDetails updated.";
    }
    
    @DeleteMapping("/{VendorId}")
    public String deleteVendorDetails(String vendorId) {
    	// Delete the VendorDetails of the vendorId in the map
    	vendorDetailsMap.put(vendorId, null);
    	return "VendorDetails deleted.";
    }
}


































































































