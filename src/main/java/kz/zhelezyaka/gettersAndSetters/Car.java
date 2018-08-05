package kz.zhelezyaka.gettersAndSetters;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Car {
    private String name;
    private Object price;
    private Object year;

}
