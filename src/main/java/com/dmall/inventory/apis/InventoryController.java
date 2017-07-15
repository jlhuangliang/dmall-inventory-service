package com.dmall.inventory.apis;

import com.dmall.inventory.model.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/inventories")
@RefreshScope
public class InventoryController {

    private SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    private List<Inventory> inventories = null;

    @Autowired
    public InventoryController() throws ParseException {

        this.inventories = Arrays.asList(
            new Inventory("p001", "Iphone 6s", 10),
            new Inventory("p002", "Xiaomi 4 plus", 10),
            new Inventory("p003", "Oppo R11", 10));
    }

    @GetMapping
    public List<Inventory> getInventories() {

        return inventories;
    }

    @RequestMapping(value = "/{inventoryId}", method = RequestMethod.GET, headers = "Accept=application/json")
    public Inventory getDoctorByDoctorId(@PathVariable("inventoryId") final String inventoryId) {
        Optional<Inventory> doctor = inventories.stream().filter(c -> Objects.equals(c.getInventoryId(), inventoryId)).findAny();

        return doctor.isPresent() ? doctor.get() : null;
    }
}
