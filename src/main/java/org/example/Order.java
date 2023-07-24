package org.example;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Order {
    @NonNull
    @EqualsAndHashCode.Include
    private String innerNumber;
    @NonNull
    @EqualsAndHashCode.Include
    private String salesNumber;

    private Double sum;

    private Integer itemCount;

}