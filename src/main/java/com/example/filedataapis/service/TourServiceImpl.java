package com.example.filedataapis.service;

import com.example.filedataapis.model.Tourist;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class TourServiceImpl implements TourService {

    private static final String JSON_FILE_PATH = "src/main/resources/data/tourist.json";
    private static final ObjectMapper objectMapper = new ObjectMapper();
    public static int id = 1;

    // Ensure that the directory structure exists before attempting to write the file
    static File file = new File(JSON_FILE_PATH);
    static {
        File parentDir = file.getParentFile();
        if (!parentDir.exists()) {
            parentDir.mkdirs();
        }
    }

    public static void saveTourist(List<Tourist> touristList) {

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            objectMapper.writeValue(file, touristList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String insertTourist(Tourist tourist) {
        List<Tourist> touristList = getAllTourist();
        tourist.setId(id++);
        touristList.add(tourist);
        saveTourist(touristList);
        return "Data Inserted Successfully !";
    }

    @Override
    public List<Tourist> getAllTourist() {
        try {
            return objectMapper.readValue(file, new TypeReference<List<Tourist>>() {
            });
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    @Override
    public String deleteTourist(int id) {
        List<Tourist> touristList = getAllTourist();
        List<Tourist> removeList = new ArrayList<>();
        for (Tourist tourist : touristList) {
            if (tourist.getId() == id) {
                removeList.add(tourist);
            }
        }
        touristList.removeAll(removeList);
        saveTourist(touristList);
        return "Tourist Deleted Successfully !";
    }

    @Override
    public String updateTourist(int id, Tourist tourist) {
        deleteTourist(id);
        List<Tourist> touristList = getAllTourist();
        tourist.setId(id);
        touristList.add(tourist);
        saveTourist(touristList);
        return "Tourist Updated Successfully !";
    }

    @Override
    public Tourist getById(int id) {
        for (Tourist tourist : getAllTourist()) {
            if (tourist.getId() == id) {
                return tourist;
            }
        }
        return null;
    }

}
