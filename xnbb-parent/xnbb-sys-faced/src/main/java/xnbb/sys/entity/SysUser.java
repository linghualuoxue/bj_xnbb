package xnbb.sys.entity;

import org.codehaus.jackson.annotate.JsonProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SysUser {

    @NotNull
    private String id;

    @JsonProperty("name")
    @NotNull
    @Size(min = 6,max = 12)
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
