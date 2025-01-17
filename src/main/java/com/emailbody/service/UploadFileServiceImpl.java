package com.emailbody.service;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

@Service
public class UploadFileServiceImpl implements  UploadFileService{
    @Override
    public Map<String, Map<String, Object>> parseTextFile(MultipartFile file) throws Exception {
        if (file.isEmpty() || !file.getOriginalFilename().endsWith(".txt")) {
            throw new Exception("Invalid file");
        }

        Map<String, Object> data = new HashMap<>();
        StringBuilder descriptionBuilder = new StringBuilder();
        boolean isDescription = false;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(file.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(":") && !isDescription) {
                    String[] parts = line.split(":", 2);
                    String key = parts[0].trim();  // trim() method is remove any  trailing spaces from both the key and value.
                    String value = parts[1].trim();


                    if (key.equalsIgnoreCase("Description")) {
                        descriptionBuilder.append(value);
                        isDescription = true;
                    } else if (key.equalsIgnoreCase("Location")) {
                        String[] locationParts = value.split(",");
                        if (locationParts.length >= 3) {
                            data.put("city", locationParts[0].trim());
                            data.put("state", locationParts[1].trim());
                            data.put("zip", locationParts[2].trim());
                        } else {
                            data.put("Location", value);
                        }
                    } else if (key.equalsIgnoreCase("Start and End Date")) {
                        if (value.endsWith("-")) {
                            value = value.substring(0, value.length() - 1).trim();
                        }
                        data.put(key, value);
                    } else {
                        data.put(key, value);
                    }
                } else if (isDescription) {
                    if (line.contains(":")) {
                        isDescription = false;
                    } else {
                        descriptionBuilder.append(" ").append(line.trim());
                    }
                } else {
                    descriptionBuilder.append(" ").append(line.trim());
                }
            }
        }
        data.put("Description", descriptionBuilder.toString().trim());
















//        Map<String, Object> data = new HashMap<>();
//        StringBuilder descriptionBuilder = new StringBuilder();
//
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(file.getInputStream()))) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                // Check if the line contains a key-value pair
//                if (line.contains(":")) {
//                    String[] parts = line.split(":", 2);
//                    String key = parts[0].trim();
//                    String value = parts[1].trim();
//
//                    if (key.equalsIgnoreCase("Location")) {
//                        // Split the location value into city, state, and zip
//                        String[] locationParts = value.split(",");
//                        if (locationParts.length >= 3) {
//                            data.put("city", locationParts[0].trim());
//                            data.put("state", locationParts[1].trim());
//                            data.put("zip", locationParts[2].trim());
//                        } else {
//                            data.put("Location", value); // Store the full value if parsing fails
//                        }
//                    } else if (key.equalsIgnoreCase("Start and End Date")) {
//                        // Remove the trailing '-' from the date value if it exists
//                        if (value.endsWith("-")) {
//                            value = value.substring(0, value.length() - 1).trim();
//                        }
//                        data.put(key, value);
//                    } else {
//                        // Add other key-value pairs directly to the map
//                        data.put(key, value);
//                    }
//                } else {
//                    // Append non-key-value lines to the description
//                    descriptionBuilder.append(line.trim()).append(" ");
//                }
//            }
//        }
//
//        // Add the description to the data map
//        data.put("Description", descriptionBuilder.toString().trim());
//
//        // Wrap the result in the response map
//
//



//        Map<String, Object> data = new HashMap<>();
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(file.getInputStream()))) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                String[] parts = line.split(":");
//                if (parts.length == 2) {
//                    String key = parts[0].trim();
//                    String value = parts[1].trim();
//                    if (key.equalsIgnoreCase("Location")) {
//                        String[] locationParts = value.split(",");
//                        if (locationParts.length >= 3) {
//                            data.put("city", locationParts[0].trim());
//                            data.put("state", locationParts[1].trim());
//                            data.put("zip", locationParts[2].trim());
//                        } else {
//                            data.put("Location", value);
//                        }
//                    } else {
//                        data.put(key, value);
//                    }
//                }
//            }
//        }
        Map<String, Map<String, Object>> response = new HashMap<>();
        response.put("parsedData", data);
        return response;
    }
}

