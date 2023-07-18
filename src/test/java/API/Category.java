package API;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "id",
            "name"
    })
    @Generated("jsonschema2pojo")
    public class Category {

        @JsonProperty("id")
        public Integer id;
        @JsonProperty("name")
        public String name;

    }

