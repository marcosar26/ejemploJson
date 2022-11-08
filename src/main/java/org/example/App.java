package org.example;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.Person;

import java.io.File;
import java.io.IOException;

public class App {
    private static final String FILE_PATH = "src/main/java/org/example/";

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        try {
            File people = new File(FILE_PATH + "people.json");
            Person john = mapper.readValue(people, Person.class);

            System.out.println(john);

            Person gertrudis = new Person();
            gertrudis.setFirstName("Gertrudis");
            gertrudis.setLastName("Fernández");
            gertrudis.setAge(24);
            gertrudis.setAlive(true);
            john.setSpouse(gertrudis);

            File felizmentecasado = new File(FILE_PATH + "felizmentecasado.json");
            mapper.writerWithDefaultPrettyPrinter().writeValue(felizmentecasado, john);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
