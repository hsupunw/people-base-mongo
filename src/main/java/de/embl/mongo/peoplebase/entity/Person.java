package de.embl.mongo.peoplebase.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.embl.mongo.peoplebase.constants.ExampleValues;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;

@Data
@Document(collection = "person")
public class Person {
    @Id
    @ApiModelProperty(hidden = true)
    private String id;
    @ApiModelProperty(required = true, notes = "first name of the person", example = ExampleValues.FIRST_NAME)
    @JsonProperty("first_name")
    private String firstName;
    @ApiModelProperty(notes = "last name of the person", example = ExampleValues.LAST_NAME)
    @JsonProperty("last_name")
    private String lastName;
    @ApiModelProperty(notes = "age of the person in years", example = ExampleValues.AGE)
    private Integer age;
    @ApiModelProperty(notes = "favourite colour of the person", example = ExampleValues.FAVOURITE_COLOUR)
    @JsonProperty("favourite_colour")
    private String favouriteColour;
    @ApiModelProperty(notes = "hobbies of the person", example = ExampleValues.HOBBIES)
    private Collection<String> hobby;
}
