package model;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder
//@Getter
public class Greeting {

    private long id;

    private String Content;
}
